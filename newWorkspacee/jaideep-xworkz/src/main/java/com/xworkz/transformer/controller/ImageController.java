package com.xworkz.transformer.controller;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/upload")
public class ImageController {

	public ImageController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onUplod(@RequestParam("pic") MultipartFile multipartFile, Model model) throws IOException {
		System.out.println("MultipartFile" + multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getSize());

		if (multipartFile.isEmpty()) {
			System.out.println("File not found, select the file ");
			model.addAttribute("errorMessage", "Please select the file");
			return "UplodeImage";
		}
		model.addAttribute("successMessage", "file is successfully uploaded");

		try {
			System.out.println(multipartFile.getBytes());
			Path path = Paths.get("D:\\transformer\\" + multipartFile.getOriginalFilename());
			Files.write(path, multipartFile.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "UplodeImage";
	}
	
	@GetMapping("/download")
	public void onDownload(HttpServletResponse response,@RequestParam String fileName) throws IOException {
		System.out.println("Running onDownload in image controller");
		response.setContentType("image/jpeg");
		File file=new File("D:\\transformer\\"+fileName);
		
		InputStream in=new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out=response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
	}

}

package com.xworkz.transformer.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@ComponentScan("/")
public class ImageController {
	
	public ImageController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@PostMapping("/upload")
	public String onUplod(@RequestParam("pic") MultipartFile multipartFile) throws IOException {
		System.out.println("MultipartFile" +multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.getBytes());
		
		byte[] bytes=multipartFile.getBytes();
		Path path=Paths.get("D:\\transformer\\" + multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		
		return "UplodeImage";
	}

}

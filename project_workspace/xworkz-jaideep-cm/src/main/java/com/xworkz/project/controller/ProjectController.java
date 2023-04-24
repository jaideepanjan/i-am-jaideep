package com.xworkz.project.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.TechnologyEntity;
import com.xworkz.project.repositary.ProjectRepo;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	public ProjectController() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@PostMapping("/ivar")
	public String onSignUp(ProjectDto dto, Model model) {

		Set<ConstraintViolation<ProjectDto>> violations = this.projectService.validateAndSave(dto);

		if (violations.isEmpty() && violations != null && dto != null) {
			model.addAttribute("message", "Registration  sucessfully");
			log.info("No violation in Controller go to success page");
			return "Signup";
		}

		model.addAttribute("error", violations);

		model.addAttribute("message", "data not saved ");

		log.info("Violation in Controller");

		return "Signup";

	}

	@PostMapping("/aj")
	public String userSignIn(String userId, String password, Model model, HttpServletRequest request) {

		log.info(" user Id : " + userId);
		log.info("Running Sign in in controller");
		try {
			log.info("try block of sign in controller");
			ProjectDto dto = this.projectService.signIn(userId, password);
			log.info("Login count" + dto.getLoginCount());

			if (dto.getLoginCount() == 3) {
				model.addAttribute("msg", "Account locked Reset password");
				log.info("Acount locked due to 3 time wrong attempts");
				return "SignIn";
			}

			if (dto != null) {

				if (dto.isResetPassword() == true) {
					log.info("Running in ResetPassword true condition");
					if (!dto.getPasswordChangedTime().isAfter(LocalTime.now())) {
						log.info("Running in time warifying condition");
						model.addAttribute("msgs", "Time out please reset password again ");
						return "SignIn";
					}
					model.addAttribute("userID", dto.getUserId());
					log.info("Running in reset condition");
					log.info("ResetPassword---" + dto.isResetPassword());
					log.info("Timer-----" + dto.getPasswordChangedTime().isAfter(LocalTime.now()));
					return "UpdatePassword";
				}

				// System.currentTimeMillis();
				log.info("User ID and password is matched");
				HttpSession httpSession = request.getSession(true);
				httpSession.setAttribute("userID", dto.getUserId());
				httpSession.setAttribute("dtoPic", dto.getPicName());
				httpSession.setAttribute("dto", dto);

				return "LoginSucess";
			}
			log.info("try block completed of sign in controller");
//			return "LoginSucess";

		} catch (Exception e) {
			log.info(e.getMessage());
		}
		model.addAttribute("fail", "UserID OR Password is not matching");
		return "SignIn";
	}

	@PostMapping("/reSet")
	public String reSetPassword(String email, Model model) {

		try {
			log.info("try block of reset password in controller");
			ProjectDto dto = this.projectService.reSetPassword(email);

			if (dto.isResetPassword() == true) {
				model.addAttribute("msg", "OTP Sent sucessfully please login with in ");
				return "ResetPassword";
			}

		} catch (Exception e) {
			e.getMessage();
		}
		return "ResetPassword";
	}

	@PostMapping("/updatePassword")
	public String updatePassword(String userId, String password, String confirmPassword) {
		this.projectService.updatePassword(userId, password, confirmPassword);
		return "UpdateSuccess";

	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra") MultipartFile multipartFile, String userId, String email,
			Long mobileNumber, Model model) throws IOException {
		log.info("multipartFile" + multipartFile);
		log.info(multipartFile.getOriginalFilename());

		String imageFormat = multipartFile.getOriginalFilename().substring(
				multipartFile.getOriginalFilename().lastIndexOf('.'), multipartFile.getOriginalFilename().length());

		log.info("Image Format " + imageFormat);
		log.info(multipartFile.getContentType());
		log.info("Size of file" + multipartFile.getSize());
		log.info("Size of bite" + multipartFile.getBytes());
		if (multipartFile.isEmpty()) {
			log.info("file not uploaded");
			model.addAttribute("error", "please select file");
			return "UpdateProfile";
		}
		model.addAttribute("sucess", "image uploaded sucessfully");
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("D:\\pic\\" + userId + System.currentTimeMillis() + imageFormat);
		Files.write(path, bytes);
		String imageName = path.getFileName().toString();
		log.info("Image name--" + imageName);
		log.info("Image name in tostring--" + path.toString());
		log.info("Image file name--" + path.getFileName());
		this.projectService.updateProfile(userId, email, mobileNumber, imageName);
		return "UpdateProfile";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName, ProjectDto user)
			throws IOException {
		
		try {
		Path path = Paths.get("D:\\pic\\" + user.getPicName());
		path.toFile();
		response.setContentType("image/jpeg");
		File file = new File("D:\\pic\\" + fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
		}catch(FileNotFoundException fne) {
			fne.getStackTrace();
		}

	}

	@PostMapping("/technologyes")
	public String onTechnologyes(String userId, TechnologyEntity techEntity, Model model) {
		log.info("Running technologyes adding in controller");

		ProjectDto dto = this.projectService.technology(userId, techEntity);

		model.addAttribute("techs", "technologyes added successfully ");
		model.addAttribute("tech", techEntity);
		return "AddTechnologyes";
	}
	
	@GetMapping("/viewTech")
	public String onViewTech(@RequestParam String userId,Model model) {
		log.info("Running view technologyes in controller ");
		List<TechnologyEntity> technologyes=this.projectService.techView(userId);
		model.addAttribute("viewTechno", technologyes);
		
		return "ViewTechnolgyes";
	}

}

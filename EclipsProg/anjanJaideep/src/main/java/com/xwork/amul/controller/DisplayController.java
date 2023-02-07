package com.xwork.amul.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwork.amul.dto.BeverageDTO;
import com.xwork.amul.dto.ChatDTO;
import com.xwork.amul.dto.EducationDTO;
import com.xwork.amul.dto.FamilyDTO;
import com.xwork.amul.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {
	
	public DisplayController() {
		System.out.println("Running DisplayController"+this.getClass().getSimpleName());
	}
	
	 @GetMapping("/getEmail")
	 public String getEmail(Model model) {
		 System.out.println("Running Email method");
		 model.addAttribute("email", "jaideepanjan@gmail.com");
		 return "index.jsp";
	 }
	 
	 @GetMapping("/mobile")
	 public String onMobile(Model model) {
		 System.out.println("Running Mobile method");
		 model.addAttribute("phone", "6366504207");
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/adhar")
	 public String onAdhar(Model model) {
		 System.out.println("Running Adhar method");
		 model.addAttribute("adhar", "5747 5743 4860");
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/age")
	 public String onAge(Model model) {
		 System.out.println("Running age method");
		 model.addAttribute("age", "23");
		 return "index.jsp";		 
	 }
	 @GetMapping("/dobNdtime")
	 public String onDOBndTime(Model model) {
		 System.out.println("Running DOB with Time");
		 model.addAttribute("dobNdtime", LocalDateTime.of(2000, 06, 20, 9, 30));
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/salary")
	 public String onSalary(Model model) {
		 System.out.println("Running Desired Salary");
		 model.addAttribute("salary", "4LPA");
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/bestee")
	 public String onBestis(Model model) {
		 System.out.println("Running list of best friends name method ");
		 List<String> friends=new ArrayList<String>();
		 friends.add("Agraja");
		 friends.add("Swami ji");
		 friends.add("Captain Bhai");
		 friends.add("Dosta");
		 friends.add("Geleya");
		 friends.add("Peddu");
		 friends.add("Pappu");
		 
		 model.addAttribute("bestee", friends);
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/places")
	 public String onPlaces(Model model) {
		 System.out.println("Running list of most visited place names method");
		 List<String> places=new ArrayList<String>();
		 places.add("Dharmastala");
		 places.add("Mysore Palace");
		 places.add("Chamundi Hills");
		 places.add("Sigandooru");
		 places.add("Murudeswara");
		 places.add("Gokarna");
		 places.add("KRS Dam");
		 
		 model.addAttribute("pravasa", places);
		 return "index.jsp";		 
	 }
	 
	 
	 @GetMapping("/skillSets")
	 public String onSkillSets(Model model) {
		 System.out.println("Running list of Skill sets method ");
		 List<String> skills=new ArrayList<String>();
		 skills.add("Singing");
		 skills.add("Dancing");
		 skills.add("Cragt");
		 skills.add("Cooking");
		 skills.add("Gardening");
		 skills.add("Decoration");
		 skills.add("Modling");
		 
		 model.addAttribute("vidye", skills);
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/educationDto")
	 public String onEducation(Model model) {
		 System.out.println("Running Education method ");
		EducationDTO edu=new EducationDTO();
		edu.setEducationMinister("B C Nagesh");
		edu.setTypes(13);
		edu.setType("Primary Education");
		edu.setReagion("Hindu");
		edu.setLanguage("Kannada");
		edu.setAim("Devolop childrens into good citizens");
		model.addAttribute("krupe", edu);
		
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/drinks")
	 public String onDrinks(Model model) {
		 System.out.println("Running Drinks method ");
		BeverageDTO drink=new BeverageDTO();
		drink.setName("Tea");
		drink.setBrand("TATA");
		drink.setId(21);
		drink.setMnufDate(LocalDate.of(2023, 1, 15));
		drink.setExpDate(LocalDate.of(2023, 2, 15));
		drink.setType("Mood fresh Drink");
		drink.setMadeIn("India");
		drink.setQuantity(205.00);
		drink.setPrice(180);
		model.addAttribute("paniyas", drink);
		
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/jangamaVani")
	 public String onJangamaVani(Model model) {
		 System.out.println("Running JangamaVani method ");
		MobileDTO vani=new MobileDTO();
		vani.setBrand("Apple");
		vani.setVesion(4.5f);
		vani.setMadeIn("India");
		vani.setGeneration(5);
		vani.setPrice(50600);
		
		model.addAttribute("phones", vani);
		
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/kutumba")
	 public String onKutumba(Model model) {
		 System.out.println("Running Kutumba method ");
		FamilyDTO fam=new FamilyDTO();
		fam.setName("Puttaswamy Family");
		fam.setType("Joint Family");
		fam.setNoOfMem(10);
		fam.setHostName("Puttaswamy");
		fam.setOwnerName("Jayalakshmi");
		fam.setNoOfChildrens(4);
		fam.setNoOfAdults(6);
		fam.setBasicallyFrom("Mandya");
		fam.setCurrentlyStayingIn("Shivamogga");
		fam.setReagion("Hindu");
		model.addAttribute("kutumba", fam);
		
		 return "index.jsp";		 
	 }
	 
	 @GetMapping("/chatDTO")
	 public String onChatDTO(Model model) {
		 System.out.println("Running ChatDTO method ");
		ChatDTO chat=new ChatDTO();
		chat.setName("Panipuri");
		chat.setShopName("Shree Chats");
		chat.setType("Auto Mobile");
		chat.setInventionBy("Jaideep");
		chat.setTypeOfTaste("Speicy");
		chat.setStyle("Indian");
		chat.setShape('O');
		chat.setColor("Golden Brown");
		chat.setFamousIn("Karnataka");
		chat.setNoOfIngreadients(15);
		chat.setPrice(50);
		model.addAttribute("kurukalu", chat);
		
		 return "index.jsp";		 
	 }
	
	

}

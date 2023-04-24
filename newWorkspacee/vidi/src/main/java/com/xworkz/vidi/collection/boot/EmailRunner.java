package com.xworkz.vidi.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmailRunner {

	public static void main(String[] args) {


		List<String> emails=new ArrayList<>();
		
		emails.add("keerthana@gmail.com");
		emails.add("lokesh@gmail.com");
		emails.add("shantanu@gmail.com");
		emails.add("jayanth@gmail.com");
		emails.add("suhas@gmail.com");
		emails.add("jaideep@gmail.com");
		emails.add("anjan@gmail.com");
		emails.add("karthik@gmail.com");
		emails.add("akshata@outlook.com");
		emails.add("sneha@outlook.com");
		emails.add("anarkarmel@outlook.com");
		emails.add("allage@outlook.com");
		emails.add("omkar@outlook.com");
		emails.add("devendra@outlook.com");
		emails.add("avinash@yahoo.com");
		emails.add("rudresh@yahoo.com");
		emails.add("prashanth@yahoo.com");
		emails.add("vidya@yahoo.com");
		emails.add("viloop@yahoo.com");
		emails.add("kavita@yahoo.com");
		emails.add("pavan@xworkz.com");
		emails.add("kumarpatil@xworkz.com");
		emails.add("divakar@xworkz.com");
		emails.add("akarsh@xworkz.com");
		emails.add("mallikarjun@xworkz.com");
		emails.add("chaitra@xworkz.com");
		emails.add("spoorthi@xworkz.com");
		emails.add("tanuja@xworkz.com");
		emails.add("chaitra@xworkz.com");
		emails.add("manohar@xworkz.com");
		
		System.out.println("-----  all in Uppercase    -----");
		emails.stream().map(mail->mail.toUpperCase()).collect(Collectors.toList()).forEach(booth->System.out.println(booth));

		
		System.out.println("-----    All unique domains     -----");
		emails
		.stream()
		.map(mails->mails.split("@"))
		.filter(re->re.length>0)
		.map(re->re[1])
		.distinct()
		.collect(Collectors.toList())
		.forEach(m->System.out.println(m));

		
		System.out.println("-----     names with out domains     -----");
		emails.stream().map(mails->mails.split("@")[0]).collect(Collectors.toList()).forEach(m->System.out.println(m));

		
		System.out.println("-----     Gmails     -----");
		emails.stream().filter(mails->mails.contains("gmail.com")).collect(Collectors.toList()).forEach(ma->System.out.println(ma));

		
		System.out.println("-----     X-workz     -----");
		emails.stream().filter(mails->mails.contains("xworkz.com")).collect(Collectors.toList()).forEach(ma->System.out.println(ma));

		
		System.out.println("-----     not Gmail and X-workz     -----");
		emails.stream().filter(mails->!mails.contains("xworkz.com")&&!mails.contains("gmail.com")).collect(Collectors.toList()).forEach(x->System.out.println(x));

		
		

	}

}

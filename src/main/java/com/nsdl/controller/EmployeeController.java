package com.nsdl.controller;

import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class EmployeeController {
	@RequestMapping("/show")
	private String showPage(Model m) {
		m.addAttribute("msg","WELCOME App!!"+new Date());
		return 
				"<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h2 style=color:red;text-aligen:center>WELCOME TO PUNE</h2>\r\n"
				+ "</body>\r\n"
				+ "</html>";
	}
}

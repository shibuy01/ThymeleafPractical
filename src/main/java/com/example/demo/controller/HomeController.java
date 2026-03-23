package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/about")
	public String about(Model m) {
		
		System.out.println("about handler");
		
		m.addAttribute("name", "SHibu Kumar");
		m.addAttribute("date", new Date().toString());
		
		return"about";
	}
	
	
	@GetMapping("/example-loop")
	public String iteratorHandler(Model m) {
		
		List<String> names = List.of("Ankit","Shibu","Anish");
		
		m.addAttribute("names", names);
		
		return "iterator";
	}
	
	
	@GetMapping("/condition")
	public String Condition(Model m) {

	    m.addAttribute("isActive", true);
	    m.addAttribute("gender", "M");
	    
	    List<Integer> list =List.of(232,123,456,4);
	    m.addAttribute("mylist",list);

	    return "condition"; 
	}
	
	
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		return"service";
	}
}

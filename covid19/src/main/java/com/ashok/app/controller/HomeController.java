package com.ashok.app.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashok.app.service.GetRawdata;

@Controller
public class HomeController {
	
	@Autowired
	GetRawdata Servicestats;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Map<String, String>> allStats = Servicestats.getStats();
		model.addAttribute("stats", allStats);
		int totalRepCase=0;
		for (Map<String, String> map : allStats) {
			totalRepCase+=Integer.parseInt(map.get("TotalCase"));
		}
		model.addAttribute("totalRepCase",totalRepCase);
	    model.addAttribute("stats", allStats);
		return "home";
	}
	

}

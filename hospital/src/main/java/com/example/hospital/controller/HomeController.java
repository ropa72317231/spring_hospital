package com.example.hospital.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/html")
	public String html(@RequestParam(name = "area", defaultValue="") 
	String area, Model model) {
		model.addAttribute("area", area);
		return "html";
	}

	@GetMapping("/json") @ResponseBody  // @Res -> Json 으로 실행
	public Map<String, Object> json(@RequestParam(name = "area", defaultValue="") 
	String area) {
		Map<String, Object> map = new HashMap<> ();
		map.put("area", area);
		return map;
	}

}

package com.myboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

//	@ResponseBody
	@RequestMapping("/z")
	public String home() {
		System.out.println("nice");
		return "hell";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		model.addAttribute("dasdw","ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		return "th/hello";
	}
	
	@RequestMapping("/hi.do")
	public String fasd(Model model) {
		model.addAttribute("zzxczx","ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		return "hi";
	}
}

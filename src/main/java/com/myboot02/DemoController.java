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
	
	@RequestMapping("/hello.do") //타임리프는 기본 cache 설정이 true 이므로 개발시에는 spring.thymeleaf.cache를 false를 설정하여 두는게 수정 사항이 바로 반영되므로 편리합니다.
	public String hello(Model model) {
		model.addAttribute("dasdw","ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		return "thymeleaf/hello";
	}
	
	@RequestMapping("/hi.do")
	public String fasd(Model model) {
		model.addAttribute("zzxczx","ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		return "hi";
	}
}

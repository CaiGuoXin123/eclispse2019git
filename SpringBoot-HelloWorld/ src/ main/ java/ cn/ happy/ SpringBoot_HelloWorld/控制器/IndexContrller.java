package cn.happy.SpringBoot_HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContrller {
//wertyjukidfghj
///78645312879645
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}

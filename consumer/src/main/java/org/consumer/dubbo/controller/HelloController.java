package org.consumer.dubbo.controller;

import org.BaseInterface.dubbo.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
public class HelloController {

	@Reference
	private HelloService helloService;
	
	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return helloService.sayHello(name);
	}
	
}

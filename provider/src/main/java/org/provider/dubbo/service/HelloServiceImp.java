package org.provider.dubbo.service;

import org.BaseInterface.dubbo.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImp implements HelloService{

	
	private static Logger log = LoggerFactory.getLogger(HelloServiceImp.class);
	
	@Override
	public String sayHello(String name) {
		
		log.info(name);
		return "hello," + name;
	}
}

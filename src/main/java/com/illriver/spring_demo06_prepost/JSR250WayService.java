package com.illriver.spring_demo06_prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * jsr250形式的Bean
 * @author Pactera
 *
 */
public class JSR250WayService {
	
	@PostConstruct
	public void init() {
		System.out.println("@jsr250-init-method");
	}
	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
	@PreDestroy
	public void destory() {
		System.out.println("@jsr250-destory-method");
	}

}

package com.illriver.spring_demo06_prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @author Pactera
 *
 */
@Configuration
@ComponentScan("com.illriver.spring_demo06_prepost")
public class ProPostConfig {
	@Bean(initMethod="init",destroyMethod="destory")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}

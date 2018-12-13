package com.illriver.spring_demo06_prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    @SuppressWarnings("unused")
	public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProPostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}

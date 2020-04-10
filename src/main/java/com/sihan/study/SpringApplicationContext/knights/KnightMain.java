package com.sihan.study.SpringApplicationContext.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		System.out.println(System.getProperties());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		
		context.close();
	}

}

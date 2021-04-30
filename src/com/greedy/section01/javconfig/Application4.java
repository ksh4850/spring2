package com.greedy.section01.javconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application4 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.javconfig", "com.greedy.section01.javconfig.config");
		
		String[] beanNames =  context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println(" 빈네임 : "+beanName);
			
		}
		
		MemberDAO memberDAO = context.getBean(MemberDAO.class);
		
		System.out.println(memberDAO.selectMember(2));
		System.out.println(memberDAO.insertMember(new MemberDTO(3, "user03", "pass03","newMember")));
		System.out.println(memberDAO.selectMember(3));
	}

}

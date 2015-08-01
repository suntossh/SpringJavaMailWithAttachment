package com.suntossh.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleEmailTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		MailHelper mailHelper = context.getBean("mailHelperBean",MailHelper.class);
		mailHelper.sendMail();
		System.out.println("Done");
	}

}

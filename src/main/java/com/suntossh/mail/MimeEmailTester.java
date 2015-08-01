package com.suntossh.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MimeEmailTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		
		MailHelper mailHelper = context.getBean("mailHelperBean",MailHelper.class);
		
		MessageBuilder messageBuilder = context.getBean("mimeMessageBuilderBean", MessageBuilder.class);
			messageBuilder.setFileLocation("E:\\Java e-books\\JSP_tutorial.pdf");
			messageBuilder.setFileName("JSP_SyntaxExamples.pdf");
		mailHelper.sendMail(messageBuilder);
		
		System.out.println("Done sending attaching a pdf");
	}
}

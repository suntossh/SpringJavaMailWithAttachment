package com.suntossh.mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailHelper {

	private SimpleMailMessage mailMessage;
	private JavaMailSender mailSender;
	
	public SimpleMailMessage getMailMessage() {
		return mailMessage;
	}
	public void setMailMessage(SimpleMailMessage mailMessage) {
		this.mailMessage = mailMessage;
	}
	public JavaMailSender getMailSender() {
		return mailSender;
	}
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	//SEND EMAIL with ATTACHMENT using MessageBuilder ;-)
	public void sendMail(MessageBuilder builder) {
		//************************************DO THIS BEFORE SENDING EMAIL FROM YOUR APP***********
		//You can switch to an app made by Google such as Gmail to access your account (recommended)
		//or change your settings at https://www.google.com/settings/security/lesssecureapps 
		//so that your account is no longer protected by modern security standards. 
		
		mailSender.send(builder);
	}
	
	//SEND PLAIN TEXT EMAIL, NO ATTACHMENTS :-(
	public void sendMail() {
		//************************************DO THIS BEFORE SENDING EMAIL FROM YOUR APP***********
		//You can switch to an app made by Google such as Gmail to access your account (recommended)
		//or change your settings at https://www.google.com/settings/security/lesssecureapps 
		//so that your account is no longer protected by modern security standards. 
		mailSender.send(mailMessage);
	}

}

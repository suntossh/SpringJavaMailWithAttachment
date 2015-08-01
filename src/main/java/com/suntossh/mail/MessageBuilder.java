package com.suntossh.mail;

import java.io.File;

import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

public class MessageBuilder implements MimeMessagePreparator {
	
	private String from;
	private String to;
	private String subject;
	private String body;
	private String fileName;
	private String fileLocation;
	
	

	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getFileLocation() {
		return fileLocation;
	}


	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public void prepare(MimeMessage mimeMessage) throws Exception {
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setTo(to);
		mimeMessageHelper.setFrom(from);
		mimeMessageHelper.setSubject(subject);
		mimeMessageHelper.addAttachment(fileName, new File(fileLocation));
		mimeMessageHelper.setText(body);
	}

}

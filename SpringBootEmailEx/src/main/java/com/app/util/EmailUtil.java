package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	@Autowired
	private JavaMailSender mailSender;
	public boolean send(String to,String subject,String text,
			String[]cc,
			String [] bcc,
			FileSystemResource file)
			//ClassPathResource file)
	{
		boolean flag=false;
		try {
			MimeMessage message=mailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message,file!=null?true:false);
			helper.setTo(to);
			helper.setFrom("nagrabi1999@gmail.com");
			helper.setSubject(subject);
			helper.setText(text);
			helper.setCc(cc);
			helper.setBcc(bcc);
			if(file!=null)
				helper.addAttachment(file.getFilename(), file);
			mailSender.send(message);
			flag=true;
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
			
		}
		return flag;
	}

}

package mymail;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@WebServlet("/SendMyEmail")
public class SendMyEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SendMyEmail()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user="icss@gmail.com";
		String pass="xxxxx";

		String subject = "";
		String msg = "";
		String to = "sender@gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.host", "mail.gmail.com");
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props,  
		 new javax.mail.Authenticator() {  
		  protected PasswordAuthentication getPasswordAuthentication() {  
		   return new PasswordAuthentication(user,pass);  
		   }  
		});  

		try
		{  
		 MimeMessage message = new MimeMessage(session);
		 message.setFrom(new InternetAddress(user));  
		 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		 message.setSubject(subject);
		 message.setText(msg);
		 //3rd step)send message  
		 Transport.send(message); 
		 System.out.println("Done");
		} 
		catch (MessagingException e) 
		{  
		   throw new RuntimeException(e);  
		}
	}
}

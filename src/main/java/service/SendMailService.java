package service;

import java.util.Random;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Session Bean implementation class SendMailService
 */
@Stateless
public class SendMailService implements SendMailServiceLocal {

    /**
     * Default constructor. 
     */
    public SendMailService() {
        // TODO Auto-generated constructor stub
    }
    
    @Resource(name = "java:jboss/mail/Default")
    private Session sessionSend;
    @Override
    public void sendMail(String ramz,String email) throws AddressException, MessagingException {
        Message message = new MimeMessage(sessionSend);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
        message.setSubject("کد احراز هویت");
        String msg="Code :" + ramz;
        message.setContent(msg,"text/html");
        Transport.send(message);
} 

}

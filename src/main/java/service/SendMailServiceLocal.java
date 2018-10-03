package service;

import javax.ejb.Local;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@Local
public interface SendMailServiceLocal {

	void sendMail(String ramz, String email) throws AddressException, MessagingException;

}

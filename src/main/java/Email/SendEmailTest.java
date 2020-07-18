package Email;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmailTest {

    public static void main(String[] args) {

        String to = "18930330252@163.com";
        String from = "615332135@qq.com";
        String host = "smtp.qq.com";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("615332135@qq.com", "lhltaziaqmsnbgai");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));

            message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));
            message.setSubject("This is the Subject line!");
            message.setText("This is actual message");
            Transport.send(message);
            System.out.println("Send message successfully....");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}

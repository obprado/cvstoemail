package acceptancetests;

import org.junit.Ignore;
import org.junit.Test;
import org.obprado.jobapplications.Application;
import org.obprado.jobapplications.EmailSender;
import org.obprado.jobapplications.Recipient;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SendEmailToRecipientsInCvsFileTest {

    private EmailSender emailSender = mock(EmailSender.class);

    @Test
    @Ignore
    public void shouldReadContentsFromTheCvsFileAndSendEmails() {
        Application sender = new Application(emailSender);
        sender.loadAndSend(".\\src\\test\\resources\\important_fizz_buzz.cvs");

        verify(emailSender).sendEmail(new Recipient("mrjohn@google.com", "John", "Johnson"));
        verify(emailSender).sendEmail(new Recipient("david@google.com", "david, H", "White"));
        verify(emailSender).sendEmail(new Recipient("leia@yahoo.com", "leia", "the daughter of, \"Anakin\""));
        verify(emailSender).sendEmail(new Recipient("mrjohn@google.com", "John", "Johnson"));
        verify(emailSender).sendEmail(new Recipient("vic@crumb.tk", "Vic", "\"Good Vic\", \"Very, Very Good Vic\""));
    }

}

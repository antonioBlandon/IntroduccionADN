package co.com.ceiba.ejerciciopractico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotifyPersonServiceTest {

    private NotifyPersonService notifyPersonService;
    private EmailService emailService;

    @Before
    public void setup(){
        emailService = new EmailService();
        notifyPersonService = new NotifyPersonService(emailService);
    }

    @Test
    public void notifyTest(){
        //Arrange
        Person person = new PersonTestDataBuilder().build();
        //Act
        String message = notifyPersonService.notify(person);
        //Assert
        Assert.assertNotNull(message);
    }
}

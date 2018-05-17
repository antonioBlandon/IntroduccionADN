package co.com.ceiba.ejerciciopractico;

import org.junit.Test;
import org.mockito.Mockito;

public class NotifyPersonServiceTestWithMockito {

    @Test
    public void notifyTest(){
        EmailService emailService = Mockito.mock(EmailService.class);
        Mockito.when(emailService.sendMail(Mockito.anyString())).thenReturn("Hola mundo");
    }
}

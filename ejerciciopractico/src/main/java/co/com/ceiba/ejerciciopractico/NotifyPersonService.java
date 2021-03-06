package co.com.ceiba.ejerciciopractico;

public class NotifyPersonService {

    private EmailService emailService;

    public NotifyPersonService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String notify(Person person){
        String message = "Welcome " + person.getName();
        return emailService.sendMail(message);
    }
}

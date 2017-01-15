package org.obprado.jobapplications;

public class Application {

    private EmailSender emailSender;

    public Application(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public static void main(String[] args) {
        new Application(new SimpleEmailSender()).loadAndSend(args[0]);
    }

    public void loadAndSend(String cvsFilePath) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

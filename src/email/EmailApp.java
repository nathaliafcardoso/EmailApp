package email;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("nathalia","cardoso");

        email1.setAlternateEmail("teste@gmail.com");
        System.out.println(email1.getAlternateEmail());

        System.out.println(email1.showInfo());
    }
}

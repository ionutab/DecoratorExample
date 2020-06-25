package email;

public class EmailDecorator implements Email {

    protected Email email;

    public EmailDecorator(Email email) {
        this.email = email;
    }

    @Override
    public String decorate() {
        return this.email.decorate();
    }
}

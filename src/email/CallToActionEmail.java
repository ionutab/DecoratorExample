package email;

public class CallToActionEmail extends EmailDecorator {

    public CallToActionEmail(Email email) {
        super(email);
    }

    @Override
    public String decorate() {
        return super.decorate() + " call to action";
    }
}

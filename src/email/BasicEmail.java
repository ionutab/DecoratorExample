package email;

public class BasicEmail implements Email {

    @Override
    public String decorate() {
        return "Basic email.Email";
    }
}

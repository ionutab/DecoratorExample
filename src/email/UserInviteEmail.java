package email;

public class UserInviteEmail extends EmailDecorator {

    public UserInviteEmail(Email email) {
        super(email);
    }

    @Override
    public String decorate() {
        return super.decorate() + " User invite";
    }
}

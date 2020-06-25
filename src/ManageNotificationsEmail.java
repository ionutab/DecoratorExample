public class ManageNotificationsEmail extends EmailDecorator {



    public ManageNotificationsEmail(Email email) {
        super(email);
    }

    @Override
    public String decorate() {
        return super.decorate() + " Manage Notifications";
    }
}

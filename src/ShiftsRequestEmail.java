public class ShiftsRequestEmail extends EmailDecorator {

    public ShiftsRequestEmail(Email email) {
        super(email);
    }

    @Override
    public String decorate() {
        return super.decorate() + " Shifts Request Details";
    }
}

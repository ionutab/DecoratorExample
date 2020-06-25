public class LogoEmail extends EmailDecorator {

    String logoImage = "Logo image";

    public LogoEmail(Email email) {
        super(email);
    }

    @Override
    public String decorate() {
        return logoImage + " " + super.decorate();
    }
}

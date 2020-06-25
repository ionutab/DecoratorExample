public class SocialAspectsEmail extends EmailDecorator {

    public SocialAspectsEmail(Email email) {
        super(email);
    }

    @Override
    public String decorate() {
        return super.decorate() + " Social Aspects";
    }
}

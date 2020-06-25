public class Main {


    public static Email build(boolean social, boolean call, boolean logo) {

        Email em = new BasicEmail();
        if (true == social) {
            em = new SocialAspectsEmail(em);
        }

        if (true == call) {
            em = new CallToActionEmail(em);
        }

        if (true == logo) {
            em = new LogoEmail(em);
        }
        return em;
    }

    public static void main(String[] args) {

        /**
         * classic tutorial example
         */
        Email basicEmailFrame = new BasicEmail();

        Email userToNonUserEmailFrame =
                new SocialAspectsEmail(
                        new LogoEmail(
                                new CallToActionEmail(
                                        new BasicEmail())));

        Email userToUserEmailFrame = new SocialAspectsEmail(
                new ManageNotificationsEmail(
                        new LogoEmail(
                                new CallToActionEmail(new BasicEmail())
                        )));


        System.out.println("basicEmailFrame");
        System.out.println(basicEmailFrame.decorate());

        System.out.println();
        System.out.println("userToNonUserEmailFrame");
        System.out.println(userToNonUserEmailFrame.decorate());

        System.out.println();
        System.out.println("userToUserEmailFrame");
        System.out.println(userToUserEmailFrame.decorate());

        /**
         * example that suits real-life purposes more
         * imagine that the user picks the values 3 variables from some inputs
         */

        System.out.println(build(true, true, false).decorate());
        System.out.println(build(false, true, true).decorate());
        System.out.println(build(true, false, false).decorate());
        System.out.println(build(true, true, true).decorate());

    }

}

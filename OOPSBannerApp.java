public class OOPSBannerApp {
    public static void main(String[] args) {
        // We use String.join to build each line of the banner 
        // This is better for the computer's memory!
        System.out.println(String.join("", "  ***", " ***", " ****", " ****", " "));
        System.out.println(String.join("", " *", "   *", " *", "   *", " *", "   *", " *", "   *"));
        System.out.println(String.join("", " *", "   *", " *", "   *", " *", "   *", " *", "   *"));
        System.out.println(String.join("", " *", "   *", " *", "   *", " ****", " ****", " "));
        System.out.println(String.join("", " *", "   *", " *", "   *", " *", "    ", " ", "   "));
        System.out.println(String.join("", " *", "   *", " *", "   *", " *", "    ", " ", "   "));
        System.out.println(String.join("", "  ***", " ***", " *", "    ", " ****", " "));
    }
}
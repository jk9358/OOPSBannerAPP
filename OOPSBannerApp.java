public class BannerApp {
    public static void main(String[] args) {
        String[][] banner = { getO(), getO(), getP(), getS() };

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("", banner[0][i], banner[1][i], banner[2][i], banner[3][i]));
        }
    }

    public static String[] getO() {
        return new String[] {" *** ", "* *", "* *", "* *", "* *", "* *", " *** "};
    }

    public static String[] getP() {
        return new String[] {"**** ", "* *", "**** ", "* ", "* ", "* ", "* "};
    }

    public static String[] getS() {
        return new String[] {" **** ", "* *", " **** ", "     *", "* *", " **** "};
    }
}
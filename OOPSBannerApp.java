public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = {
                String.join(" ", "    ***    ", "    ***    ", " ******* ", "  ****** "),
                String.join(" ", "  **   **  ", "  **   **  ", " **   ** ", " **    **"),
				String.join(" ", " **     ** ", " **     ** ", " **   ** ", " **      "),
				String.join(" ", " **     ** ", " **     ** ", " ******* ", "  ****** "),
				String.join(" ", " **     ** ", " **     ** ", " **      ", "       **"),
				String.join(" ", "  **   **  ", "  **   **  ", " **      ", " **    **"),
				String.join(" ", "    ***    ", "    ***    ", " **      ", "  ****** "),
            String.join("  ", getOTop(), getOTop(), getPTop(), getSTop()),
            String.join("  ", getOMid(), getOMid(), getPMid(), getSMid1()),
            String.join("  ", getOMid(), getOMid(), getPMid(), getSTop()),
            String.join("  ", getOMid(), getOMid(), getPTop(), getSMid2()),
            String.join("  ", getOMid(), getOMid(), getPFoot(), getSMid2()),
            String.join("  ", getOMid(), getOMid(), getPFoot(), getSMid2()),
            String.join("  ", getOTop(), getOTop(), getPFoot(), getSTop())
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
    public static String getOTop() { return " *** "; }
    public static String getOMid() { return "*   *"; }

    public static String getPTop() { return "**** "; }
    public static String getPMid() { return "*   *"; }
    public static String getPFoot() { return "*    "; }

    public static String getSTop() { return " ****"; }
    public static String getSMid1() { return "*    "; }
    public static String getSMid2() { return "    *"; }
}
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
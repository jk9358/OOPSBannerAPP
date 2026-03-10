public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = {
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

    static class CharacterPatternMap {
        private String[] patterns;

        public CharacterPatternMap(String[] patterns) {
            this.patterns = patterns;
        }

        public String getLine(int index) {
            return patterns[index];
        }
    }
    public static String getOTop() { return " *** "; }
    public static String getOMid() { return "*   *"; }

    public static String getPTop() { return "**** "; }
    public static String getPMid() { return "*   *"; }
    public static String getPFoot() { return "*    "; }
    public static void main(String[] args) {

        CharacterPatternMap charO = new CharacterPatternMap(new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPatternMap charP = new CharacterPatternMap(new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

    public static String getSTop() { return " ****"; }
    public static String getSMid1() { return "*    "; }
    public static String getSMid2() { return "    *"; }
        CharacterPatternMap charS = new CharacterPatternMap(new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(
                charO.getLine(i) + "  " +
                charO.getLine(i) + "  " +
                charP.getLine(i) + "  " +
                charS.getLine(i)
            );
        }
    }
}
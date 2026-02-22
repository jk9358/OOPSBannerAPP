
public class OOPSBannerApp {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int lineIndex) {
            return pattern[lineIndex] + " ";
        }
    }

    public static void main(String[] args) {
        CharacterPattern oPattern = new CharacterPattern('O', 
            new String[]{"  ***", " * *", " * *", " * *", " * *", " * *", "  ***"});
        CharacterPattern pPattern = new CharacterPattern('P', 
            new String[]{" ****", " * *", " * *", " ****", " * ", " * ", " * "});
        CharacterPattern sPattern = new CharacterPattern('S', 
            new String[]{" ****", " * ", " * ", " ****", "     *", "     *", " **** "});

        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(oPattern.getLine(i));
            sb.append(oPattern.getLine(i));
            sb.append(pPattern.getLine(i));
            sb.append(sPattern.getLine(i));
            System.out.println(sb.toString());
        }
    }
}
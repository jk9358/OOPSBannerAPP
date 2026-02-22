import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class CharacterPattern {
        private String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String getLine(int lineIndex) {
            return pattern[lineIndex] + " ";
        }
    }

    public static void main(String[] args) {
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern(new String[]{"  ***", " * *", " * *", " * *", " * *", " * *", "  ***"}));
        patternMap.put('P', new CharacterPattern(new String[]{" ****", " * *", " * *", " ****", " * ", " * ", " * "}));
        patternMap.put('S', new CharacterPattern(new String[]{" ****", " * ", " * ", " ****", "     *", "     *", " **** "}));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(c);
                if (cp != null) {
                    sb.append(cp.getLine(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 * UC8: Use Map for Character Patterns and Render via Function
 */
public class OOPSBannerApp {

    /**
     * Returns the pattern for O
     * @return String array for O
     */
    public static String[] getOPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    /**
     * Returns the pattern for P
     * @return String array for P
     */
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*       ",
            "*       ",
            "*       "
        };
    }

    /**
     * Returns the pattern for S
     * @return String array for S
     */
    public static String[] getSPattern() {
        return new String[] {
            " ******",
            "*     *",
            "*     *",
            "****** ",
            "*     *",
            "*     *",
            "****** "
        };
    }

    /**
     * Creates and returns the character pattern map
     * @return Map of character to pattern
     */
    public static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', getOPattern());
        patternMap.put('P', getPPattern());
        patternMap.put('S', getSPattern());

        return patternMap;
    }

    /**
     * Displays the banner message
     * @param message the word to display
     * @param patternMap map containing patterns
     */
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = createPatternMap();
        String message = "OOPS";
        displayBanner(message, patternMap);
    }
}
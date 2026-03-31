/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Class
 */
public class OOPSBannerApp {

    /**
     * Inner static class to store a character and its banner pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character
         * @param pattern the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern
         * @return pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Returns the banner pattern for O
     * @return String array pattern for O
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
     * Returns the banner pattern for P
     * @return String array pattern for P
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
     * Returns the banner pattern for S
     * @return String array pattern for S
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
     * Returns the CharacterPatternMap object for a given character
     * @param ch the character to search
     * @param patterns array of CharacterPatternMap objects
     * @return CharacterPatternMap object if found, else null
     */
    public static CharacterPatternMap getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', getOPattern()),
            new CharacterPatternMap('P', getPPattern()),
            new CharacterPatternMap('S', getSPattern())
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                CharacterPatternMap cp = getCharacterPattern(word.charAt(i), patterns);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
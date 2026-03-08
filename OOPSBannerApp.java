/**
 * OOPS Banner Application
 *
 * UC7: Store Character Pattern in a Class
 *
 * Author: Abhijay M
 */

public class OOPSBannerApp {

    /**
     * Static Inner Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character the character
         * @param pattern the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create patterns for characters
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Array of objects for OOPS
        CharacterPatternMap[] word = {
                oPattern, oPattern, pPattern, sPattern
        };

        String[] banner = new String[7];

        // Build banner using StringBuilder
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            banner[i] = line.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

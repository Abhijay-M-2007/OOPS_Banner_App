/**
 * OOPS Banner Application
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * Author: Abhijay M
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        renderBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns the character pattern map
     *
     * @return Map of character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /**
     * Displays banner for the given word
     *
     * @param word text to display
     * @param map character pattern map
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}

/**
 * OOPS Banner Application
 *
 * UC6: Refactor Banner Logic into Functions
 *
 * Author: Abhijay M
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build banner lines
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}

/**
 * OOPS Banner App
 *
 * UC4: Render OOPS banner using String Array and Loop
 *
 * Refactors UC3 by storing banner lines in a String array
 * and printing them using an enhanced for loop.
 *
 * @author Abhijay
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] bannerLines = {

            String.join(" ",
                    " ***** ", "  ***** ", "  ***** ", "  ***** "),

            String.join(" ",
                    "*     *", " *     *", " *     *", " *      "),

            String.join(" ",
                    "*     *", " *     *", " *     *", " *      "),

            String.join(" ",
                    "*     *", " *     *", " *****  ", "  ***** "),

            String.join(" ",
                    "*     *", " *     *", " *      ", "       *"),

            String.join(" ",
                    "*     *", " *     *", " *      ", "       *"),

            String.join(" ",
                    " ***** ", "  ***** ", " *      ", "  ***** ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
/**
 * OOPS Banner App
 *
 * UC3: Render OOPS banner using String.join()
 *
 * @author Abhijay
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ", "  ***** ", "  ***** ", "  ***** "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *     *", " *      "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *     *", " *      "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *****  ", "  ***** "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *      ", "       *"));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *      ", "       *"));

        System.out.println(String.join(" ",
                " ***** ", "  ***** ", " *      ", "  ***** "));
    }
}
/**
 * UC5: Render OOPS as Banner using Inline Array Initialization
 * 
 * @author Abhijay M
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization
        String[] banner = {
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *      ",
            "*     * *     * *     * *      ",
            "*     * *     * *****    ***** ",
            "*     * *     * *            * ",
            "*     * *     * *            * ",
            " *****   *****   *        ***** "
        };

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

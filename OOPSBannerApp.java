public class OOPSBannerApp {

    public static void main(String[] args) {
        // UC5: Combine array declaration and initialization with String.join()
        String[] bannerLines = new String[] {
        String.join("", "    *    " , "    *    " , " ***    "   , "    *** "),
        String.join("", "  *   *  " , "  *   *  " , " *     *  "   , "  **      "),
        String.join("", " *     * " , " *     * " , " *      * "   , "**        "),
        String.join("", " *     * " , " *     * " , " *     *  "   , " **       "),
        String.join("", " *     * " , " *     * " , " ***    "   , "   *    "),
        String.join("", " *     * " , " *     * " , " *         "   , "      *  "),
        String.join("", " *     * " , " *     * " , " *         "   , "       * "),
        String.join("", "  *   *  " , "  *   *  " , " *         "   , "     *   "),
        String.join("", "    *    " , "    *    " , " *         "   , "**     ")
        };

        // Enhanced for-loop to iterate through the array and display the pattern
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
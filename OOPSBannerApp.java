/**
 * OOPSBannerApp
 * UC4: Print OOPS Banner using Array and Loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create array
        String[] banner = {

            String.join(" ", " *** ", " *** ", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*****", "****"),
            String.join(" ", "*   *", "*   *", "*", "*"),
            String.join(" ", "*   *", "*   *", "*", "*"),
            String.join(" ", "*   *", "*   *", "*", "*"),
            String.join(" ", " *** ", " *** ", "*", "*****")

        };

        // Step 2: Loop and print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
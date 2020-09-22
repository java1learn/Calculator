public class Checker {
    public static boolean isNumeric(String num) {
        try {
            int i = Integer.parseInt(num);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isBetween(int num) {
        return num > 0 && num <= 10;
    }
}

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int initialNumber = number;
        int reverse = 0;
        while (number != 0) {
            reverse = number % 10;
            number /= 10;
        }
        if (initialNumber == reverse) {
            return true;
        }
        return false;
    }
}

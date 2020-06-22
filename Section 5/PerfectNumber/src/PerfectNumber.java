public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number >= 1) {
            int i = 1, sum = 0;
            while (i < number) {
                if (number % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}

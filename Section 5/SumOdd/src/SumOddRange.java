public class SumOddRange {
    public static boolean isOdd (int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
        if (start <= end && end > 0 && start > 0) {
            for (start = start; start <= end; start++) {
                if (isOdd(start)) {
                    sum += start;
                }
            }
        } else {
            return -1;
        } return sum;
    }
}

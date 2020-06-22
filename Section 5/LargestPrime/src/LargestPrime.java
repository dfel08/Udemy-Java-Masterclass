public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        } else {
            int largestPrime = 2;
            boolean flag = false;

            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    for (int j = 2; j <= i/2; j++) {
                        if (i % j == 0) {
                            flag = true;
                            break;
                        }
                    } if (!flag) {
                        largestPrime = i;
                    }
                }
            } return largestPrime;
        }
    }
}

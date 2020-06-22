public class NumberToWords {
    public static void numberToWords(int number) {
        if (number > 0) {
            int reversed = reverse(number);
            int digit = 0;
            int digitCountReversed = getDigitCount(reversed);
            int digitCount = getDigitCount(number);
            while (reversed > 0) {
                digit = reversed % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversed /= 10;
            }
            if (digitCount != digitCountReversed) {
                for (int i = 0; i < digitCount - digitCountReversed; i++) {
                    System.out.println("Zero");
                }
            }
        }
        else if (number == 0) System.out.println("Zero");
        else System.out.println("Invalid Value");
    }

    public static int reverse(int number) {
        int temp = 0;
        while (number != 0){
            temp = (temp * 10) + (number % 10);
            number /= 10;
        }
        return temp;
    }

    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        if (number >= 0) {
            int counter = 0;
            while (number > 0) {
                number /= 10;
                counter++;
            }
            return counter;
        }
        return -1;
    }
}


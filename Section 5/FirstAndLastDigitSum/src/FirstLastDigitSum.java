public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int firstNumber = number % 10;
            while (number >= 10) {
                number = number / 10;
            }
            return firstNumber + (number % 10);
        }
        return -1;
    }
}

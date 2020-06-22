public class SharedDigit {
    public static boolean hasSharedDigit (int numOne, int numTwo) {
        if ((numOne < 10 || numOne > 99) || (numTwo < 10 || numTwo > 99)) {
            return false;
        } else {
            int numOneDigitOne = numOne % 10;
            int numOneDigitTwo = numOne / 10;
            int numTwoDigitOne = numTwo % 10;
            int numTwoDigitTwo = numTwo / 10;
            if ((numOneDigitOne == numTwoDigitOne || numOneDigitOne == numTwoDigitTwo) || (numOneDigitTwo == numTwoDigitOne || numOneDigitTwo == numTwoDigitTwo)) {
                return true;
            } else {
                return false;
            }
        }
    }
}

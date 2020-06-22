public class LastDigitChecker {
    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree) {
        if (!isValid(numOne) || !isValid(numTwo) || !isValid(numThree)) {
            return false;
        } else {
            int leftNumOne = numOne % 10;
            int leftNumTwo = numTwo % 10;
            int leftNumThree = numThree % 10;
            if (leftNumOne == leftNumTwo || leftNumOne == leftNumThree || leftNumTwo == leftNumThree) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isValid (int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }
}

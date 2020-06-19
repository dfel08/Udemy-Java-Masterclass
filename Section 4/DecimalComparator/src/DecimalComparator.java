public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
        numOne = (int) (numOne * 1000);
        numTwo = (int) (numTwo * 1000);
        if (numOne == numTwo) {
            return true;
        } else {
            return false;
        }
    }
}

public class TeenNumberChecker {
    public static boolean hasTeen (int ageOne, int ageTwo, int ageThree) {
        if (isTeen(ageOne) == true || isTeen(ageTwo) == true || isTeen(ageThree) == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen (int age) {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }
}

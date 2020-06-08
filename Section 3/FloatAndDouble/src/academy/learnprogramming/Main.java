package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //floats take 32 bits, or 4 bytes
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        //double is 64 bits, or 8 bytes
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("Int value = " + myIntValue);
        System.out.println("Float Value = " + myFloatValue);
        System.out.println("Double value = " + myDoubleValue);

        //Challenge: Convert a given number of pounds to kilograms
        //STEP ONE: Create a variable with the appropriate type to store the number of pounds
        double myPounds = 200.00d;
        //STEP TWO: Calculate the result
        double toKilos = myPounds * 0.45359237d;
        //STEP THREE: Print
        System.out.println("200 pounds = " + toKilos + " kilograms.");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}

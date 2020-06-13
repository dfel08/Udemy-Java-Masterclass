package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char /*char can only store a single character*/ myChar = 'D';
        /*occupies 2 bytes of memory, or 16 bits*/
        /*The reason for this is it allows for Unicode*/
        char myUnicodeChar = '\u0044';
        System.out.println("This char = " + myChar);
        System.out.println("This UnicodeChar = " + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println("To print the copyright symbol, go to Unicode-Table.com, find the Unicode, and voila! " + myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}

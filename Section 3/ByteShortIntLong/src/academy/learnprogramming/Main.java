package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
	    System.out.println("Integer minimum value is " + myMinIntValue);
	    System.out.println("Integer maximum value is " + myMaxIntValue);
	    System.out.println("Busted max = " + (myMaxIntValue + 1));
	    System.out.println("Busted min = " + (myMinIntValue - 1));

    	int myMaxIntTest = 2_147_483_647;

    	byte myMinByteValue = Byte.MIN_VALUE;
    	byte myMaxByteValue = Byte.MAX_VALUE;
    	System.out.println("Byte Min Value = " +myMinByteValue);
    	System.out.println("Byte Max Value = " + myMaxByteValue);

    	byte myMaxByteTest = 127;

    	short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Min Value = " +myMinShortValue);
		System.out.println("Short Max Value = " + myMaxShortValue);

		short ShortLiteralValue = 32767;

		//A byte occupies 8 bits. A short, 16 bits. An integer, 32 bits. A long, 64 bits.

		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Min Value = " +myMinLongValue);
		System.out.println("Long Max Value = " + myMaxLongValue);

		//long myMaxLongTest = 9223372036854775807

		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);



		int myTotal = (myMinIntValue / 2);

		byte myNewByteValue = (byte)/*this is a cast!*/ (myMinByteValue / 2);

		short myNewShortValue = (short) (myMinShortValue / 2);


	}
}

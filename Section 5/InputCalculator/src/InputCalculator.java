import java.util.Scanner;



public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;

        int avg = 0;

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            sum += scanner.nextInt();

            count ++;

            avg = (int) Math.round((double) sum / count);

            scanner.nextLine();

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();

    }

}

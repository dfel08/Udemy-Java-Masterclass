public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int greatestCommonDivisor = 0;
        int i = 1;
        while(i <= first && i <= second){
            if(first % i == 0 && second % i == 0)
                greatestCommonDivisor = i;
            i++;
        }
        return greatestCommonDivisor;
    }
}
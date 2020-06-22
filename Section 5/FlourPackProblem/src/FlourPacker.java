public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountKilo = 5 * bigCount;
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if (goal > bigCountKilo + smallCount) {
            return false;
        }
        if (goal % 5 > smallCount) {
            return false;
        }
        return true;
    }
}


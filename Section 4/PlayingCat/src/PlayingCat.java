public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (temperature <= 35 && temperature >= 25 && summer == false) {
            return true;
        } else if (temperature <= 45 && temperature >= 25 && summer == true) {
            return true;
        } else {
            return false;
        }
    }
}

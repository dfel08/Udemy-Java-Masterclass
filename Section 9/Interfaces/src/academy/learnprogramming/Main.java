package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone dansPhone;
        dansPhone = new DeskPhone(123456);
        dansPhone.powerOn();
        dansPhone.callPhone(123456);
        dansPhone.answer();
    }
}

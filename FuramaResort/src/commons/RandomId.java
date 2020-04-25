package commons;

import java.util.Random;

public class RandomId {
    public  static String generaRandomId(){
        Random random= new Random();
        return String.format("%d", random.nextInt(10000));
    }
}

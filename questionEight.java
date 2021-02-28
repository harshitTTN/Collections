package Collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class questionEight {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        String stringDate = DateFor.format(date);
        System.out.println("Date  : "+stringDate);
    }
}

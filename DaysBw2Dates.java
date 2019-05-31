import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class DaysBw2Dates {
    public static void main(String[] args) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String inputString1 = "01 10 2017";
        String inputString2 = "22 10 2017";

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDate today = LocalDate.now();
        LocalDate ExpireDay = LocalDate.of(2018, Month.JANUARY, 12);
        long daysBetween = DAYS.between(today, ExpireDay);
        System.out.println(daysBetween);


    }
}


package pojo.javaprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEg {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
       String dateTx = sdf.format(date);
       System.out.println(dateTx);

        Calendar cal =Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
      
    }
}

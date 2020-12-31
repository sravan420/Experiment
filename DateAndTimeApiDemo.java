import java.time.*;

public class DateAndTimeApiDemo {

    public static void main(String[] args){

        LocalDate date= LocalDate.now();
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy=date.getYear();
        LocalDate dob=date.minusYears(31);
        System.out.println(+mm+"-"+dd+"-"+yyyy);
        System.out.println(dob.getMonth());

        LocalTime time= LocalTime.now();
        int h= time.getHour();
        int min=time.getMinute();
        System.out.println(+h+"-"+min);


        LocalDateTime dt= LocalDateTime.now();
        int d=dt.getDayOfMonth();
        int m=dt.getMonthValue();
        int yy=dt.getYear();
        System.out.println(+m+"-"+d+"-"+yy);


        LocalDateTime dt1=LocalDateTime.of(1989,Month.AUGUST,07,9,9);
        System.out.println(dt1.minusMonths(3));

        /*calculate Age*/
        LocalDate ldt= LocalDate.now();
        LocalDate gdt= LocalDate.of(1992,Month.MAY,5);
        Period period=Period.between(ldt,gdt);
        System.out.println(period);

        Year y= Year.of(2021);
        if (y.isLeap()){
            System.out.println("y");
        } else{
            System.out.println("n");
        }

        ZoneId zid= ZoneId.systemDefault();
        System.out.println(zid);

        ZoneId z=ZoneId.of("India");
        ZonedDateTime zdt=ZonedDateTime.now(z);
        System.out.println(zdt);
    }
}

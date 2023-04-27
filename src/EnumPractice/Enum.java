package EnumPractice;

import java.time.LocalDate;

public class Enum {

    public static void main(String[] args){
        int year = 2000;
        int mouth = 6;
        int day = 1;
        DayOfWeek dayOfWeek = DayOfWeek.GetDayOfWeek(year,mouth,day);
        System.out.println(year+"年 "+mouth+"月 "+day+"日 "+dayOfWeek.getDayOfWeek()+"です");
    }
}

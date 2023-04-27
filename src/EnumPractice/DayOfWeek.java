package EnumPractice;

import java.time.LocalDate;

public enum DayOfWeek {
    //Enum型
    MON("月曜日"),TUES("火曜日"),WEDNES("水曜日"),THURS("木曜日"),FRI("金曜日"),SATUR("土曜日"),SUN("日曜日");

    //定数 文字列
    private final String dayOfWeek;

    //Enumインスタンスを行うと 今回は7回呼ばれる
    DayOfWeek(String dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    //Enumの文字列を返す
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    //クラスから処理を呼ぶ
    public static DayOfWeek GetDayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek;
        switch (date.getDayOfWeek()) {
            case MONDAY -> dayOfWeek = DayOfWeek.MON;
            case TUESDAY -> dayOfWeek = DayOfWeek.TUES;
            case WEDNESDAY -> dayOfWeek = DayOfWeek.WEDNES;
            case THURSDAY -> dayOfWeek = DayOfWeek.THURS;
            case FRIDAY -> dayOfWeek = DayOfWeek.FRI;
            case SATURDAY -> dayOfWeek = DayOfWeek.SATUR;
            default -> dayOfWeek = DayOfWeek.SUN;


        }
        return dayOfWeek;
    }
}

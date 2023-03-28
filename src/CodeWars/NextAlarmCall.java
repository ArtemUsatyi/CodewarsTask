package CodeWars;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class NextAlarmCall {
    public static void main(String[] args) {
        String[] arrayAlarm = {"23:00","04:22","18:05","06:24"}; // 09:10
        Arrays.sort(arrayAlarm);
        LocalTime timeDifference = LocalTime.parse("00:00");

        for (int i = 0; i < arrayAlarm.length - 1; i++) {
            LocalTime dt1 = LocalTime.parse(arrayAlarm[i + 1]);
            dt1 = dt1.minus(LocalTime.parse(arrayAlarm[i]).getMinute(), ChronoUnit.MINUTES);
            dt1 = dt1.minus(LocalTime.parse(arrayAlarm[i]).getHour(), ChronoUnit.HOURS);
            System.out.println(dt1);
            if (dt1.compareTo(timeDifference) == 1) timeDifference = dt1;
        }
        timeDifference = timeDifference.minus(1,ChronoUnit.MINUTES);
        LocalTime dt2 = LocalTime.parse("23:59");
        dt2 = dt2.minus(LocalTime.parse(arrayAlarm[arrayAlarm.length - 1]).getMinute(), ChronoUnit.MINUTES);
        dt2 = dt2.minus(LocalTime.parse(arrayAlarm[arrayAlarm.length - 1]).getHour(), ChronoUnit.HOURS);
        dt2 = dt2.plus(LocalTime.parse(arrayAlarm[0]).getMinute(), ChronoUnit.MINUTES);
        dt2 = dt2.plus(LocalTime.parse(arrayAlarm[0]).getHour(), ChronoUnit.HOURS);

        if (dt2.compareTo(timeDifference) == 1) timeDifference = dt2;
        System.out.println("Итог - " + timeDifference);
    }
}

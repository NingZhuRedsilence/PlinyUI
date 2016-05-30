package model;
import java.time.*;
/**
 * Created by chenhaozhang on 5/28/16.
 */
public class Schedule {
    //Java Calendar Class? Java.time?
    //http://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html
    private LocalDate date;
    private LocalTime time;

    public Schedule(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }
    //necessary? Have "unscheduled" category after all
//    public Schedule() {
//        this.date = LocalDate.now();
//        this.time = LocalTime.now();
//    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }

    public void setTime(LocalTime time) {
        this.time = LocalTime.from(time);
    }

    public String toString(){
        return date.toString() + " " + time.toString();
    }
}

public class Time{
    int hours ;
    int minutes ;
    int seconds ;
    public Time()
    {
        this.hours=0;
        this.minutes=0;
        this.seconds=0;
    }
    public Time(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
        timeDisplay(hours,minutes,seconds);
    }
    public void timeDisplay(int hours , int minutes , int seconds ){
        String AmPm = "AM";
        if(hours>12){
             AmPm = "PM";
             hours = hours - 12;
        }
        if(minutes>60){
            hours += 1 ;
            minutes = minutes-60;
        }
        if(seconds>60){
            minutes += 1 ;
            seconds = seconds-60;
        }
        System.out.println(hours + ":" + minutes + ":" + seconds + AmPm);
    }
    public static Time addTime(Time t1 , Time t2){
        int hours;
        int minutes;
        int seconds;
        t1.hours = (t1.hours*60)*60;
        t1.minutes = t1.minutes*60;
        t2.hours = (t2.hours*60)*60;
        t2.minutes = t2.minutes*60;
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;
        seconds = t1.seconds + t2.seconds;
        hours = (hours/60)/60;
        minutes = minutes/60;
        return new Time(hours , minutes , seconds);
    }
public static void main(String[] args){
        Time t1 = new Time(10,40,50);
        Time t2 = new Time(13,30,30);
        Time.addTime(t1,t2);

}
}

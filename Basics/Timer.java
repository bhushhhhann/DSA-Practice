import java.lang.*;
public class Timer extends Thread{
    @Override
    public void run(){
        int seconds = 00;
        int minutes = 00;
        int hours = 00;
        while(true)
            try{
            System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
            Thread.sleep(1000);
            seconds ++;

            if(minutes==60){
                hours++;
                seconds=0;
                minutes=0;
            }
            if (seconds==60){
                minutes++;
                seconds=0;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Timer t=new Timer();
        t.start();
    }
}

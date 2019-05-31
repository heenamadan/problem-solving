import java.util.Timer;

/**
 * Created by heena.madan on 27/07/17.
 */
public class SchedulerTest  {
    public static void main(String args[]){
        SchedulerTest test = new SchedulerTest();
        ScheduledTask st = new ScheduledTask();
        Timer timer = new Timer();
        timer.schedule(st,0,6000);
    }
}

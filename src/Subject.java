import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Function;
public class Subject extends Observable{
    Timer timer = new Timer();
    private int time;

    int getState(){
        return time;
    }

    public void setState(int t){
        this.time = t;
        System.out.println("The time shown in decimal is "+ getState());

        setChanged();
        notifyObservers(this.time);
    }

    public void run() {
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                setState((getState()+1)%60);
                System.out.println("****************");}

            };
        timer.schedule(task, 0,1000);
    }

}

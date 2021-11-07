import java.util.Observable;



public class Binary  extends mainObserver {
    private int time;

    public void setTime(int time) {
        this.time = Integer.parseInt(Integer.toBinaryString(time)) ;
    }

    public String getTime() {
        return  Integer.toString(time);
    }

    @Override
    public void update(Observable o, Object arg) {

        this.setTime(((Subject) o).getState());
        System.out.println("Binary observer: "+ getTime());
        }

    }


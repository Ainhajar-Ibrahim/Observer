
import java.util.Observable;

public class Hexa  extends mainObserver{
        private String time;

        public void setTime(int time) {
            this.time = (Integer.toHexString(time)) ;
        }

        public String getTime() {
            return time;
        }

        @Override
        public void update(Observable o, Object arg) {

            this.setTime(((Subject) o).getState());
            System.out.println("Hexadecimal observer: "+ getTime());


        }


    }

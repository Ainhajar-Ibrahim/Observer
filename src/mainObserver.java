import java.util.Observable;
import java.util.Observer;
public class mainObserver  implements Observer{
        private String time;
        boolean isattached=true;

        void attach(){
            this.isattached = !isattached;

        }
        public String getTime() {
            return time;
        }
        public void setTime(int time) {
            this.time =  Integer.toString(time);
        }

        @Override
        public void update(Observable o, Object arg) {
            this.setTime(((Subject) o).getState());
            System.out.println("decimal observer : "+ getTime());
        }
}

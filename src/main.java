public class main  {

    public static void main(String[] args) {

        Subject minuterie=new Subject();
        minuterie.setState(0);
        mainObserver observer=new mainObserver();
        Binary binaire = new Binary();
        Octal octal = new Octal();
        Hexa hexa = new Hexa();
        //binaire.attach();
        minuterie.run();

        if(binaire.isattached){
            minuterie.addObserver(binaire);
        }else {
            minuterie.deleteObserver(binaire); }
        //octal
        if(octal.isattached){
            minuterie.addObserver(octal);
        }else {
            minuterie.deleteObserver(octal); }
        //hexa
        if(hexa.isattached){
            minuterie.addObserver(hexa);
        }else {
            minuterie.deleteObserver(hexa); }
        minuterie.addObserver(observer);

    }
}

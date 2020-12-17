public class Kare extends Hesaplama {
private double kenarA;

    public Kare(double kenarA) {
        this.kenarA = kenarA;
    }
    @Override
    double alan() {
      return (kenarA*kenarA);
    }

    public double getKenarA() {
        return kenarA;
    }

    public void setKenarA(double kenarA) {
        this.kenarA = kenarA;
    }
    
}

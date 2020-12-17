package vasita;

/*
class Otomobil {
    String marka;
    int model;
    String renk;
    double fiyat;

    public void goster(){
        System.out.println("Marka: "+marka+
                "\nModel: "+model+
                "\nRenk: "+renk+
                "\nFiyat: "+fiyat);
    }
}
*/

public class Vasita{
    public static void main(String[] args){

        Otomobil oto1 = new Otomobil();
        oto1.marka = "Volvo";
        oto1.model = 2020;
        oto1.renk = "Gümüş";
        oto1.fiyat = 1000000;

        oto1.goster();
}
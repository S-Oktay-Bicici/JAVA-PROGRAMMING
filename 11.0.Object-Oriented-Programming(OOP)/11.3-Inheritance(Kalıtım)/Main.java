public class Main{
    public static void main(String[] args){

        Vasıta v1 = new Vasıta();

        v1.setMarka("Toyota");
        v1.setModel(2011);
        v1.setRenk("Gümüş");
        v1.setFiyat(39000);
        v1.goster();

        Kamyon k1 = new Kamyon();

        //kamyon sınıfında bu özellikleri tanıtmasak da kullanabiliyoruz
        k1.setMarka("Scıana");
        k1.setModel(2017);
        k1.setRenk("Bordo");
        k1.setFiyat(300000);
        k1.setKapasite(40000);
        k1.goster();
    }
}
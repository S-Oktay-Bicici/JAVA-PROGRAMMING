public class Kamyon extends Vasıta{
	
	Kamyon(){
	}

    //Vasıta sınıfında bulunan değişkenler ve tüm metodalrı bu sınıfta kullanabiliyoruz

    //kendine özgü fonksiyon ya da değişken de atanabilit
    private  int kapasite;

	@Override
    public void goster(){
        System.out.println(getMarka()+" "+getModel()+" "+getRenk()+" "+getFiyat()+" "+getKapasite());
    }


    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
}

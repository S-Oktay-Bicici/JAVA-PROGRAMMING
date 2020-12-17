public class Yolcu {
	
    private static int yolcu_sayisi=0;
    private String yolcu_adi;
    private String durak_adi;

    public static int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

    public static void setYolcu_sayisi(int yolcu_sayisi) {
        Yolcu.yolcu_sayisi = yolcu_sayisi;
    
    }

    public String getYolcu_adi() {
        return yolcu_adi;
    }

    public void setYolcu_adi(String yolcu_adi) {
        this.yolcu_adi = yolcu_adi;
    }

    public String getDurak_adi() {
        return durak_adi;
    }

    public void setDurak_adi(String durak_adi) {
        this.durak_adi = durak_adi;
    }

    public Yolcu(String yolcu_adi, String durak_adi) {
        this.yolcu_adi = yolcu_adi;
        this.durak_adi = durak_adi;
            yolcu_sayisi++;
    }
    public void cikti(){
        String yolcu_bilgisi=yolcu_adi+" otobüsümüze "+durak_adi+" durağında bindi.";
            System.out.println(yolcu_bilgisi);
    }
   
}

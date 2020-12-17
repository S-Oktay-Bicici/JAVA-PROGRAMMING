
public class Noroloji extends Isgucu{
	private String diploma_aldigi_kurum;
	
    public Noroloji(String ad, String soyad, int kimlikNo,String diploma_aldigi_kurum) {
        super(ad, soyad, kimlikNo);
        this.diploma_aldigi_kurum=diploma_aldigi_kurum;
    }
	
    void uyku_bozuklugu() throws InterruptedException{
		System.out.println("Doktor "+getAd()+" tarafından uyku bozukluğuna yönelik tedavi uygulanıyor...");
        Thread.sleep(3000);
		System.out.println("Tedavi başarıyla gerçekleşti");    
    }
	
    void bas_agrisini() throws InterruptedException{
        System.out.println("Doktor "+getAd()+" tarafından baş ağrısına yönelik tedavi uygulanıyor...");
        Thread.sleep(3000);
		System.out.println("Tedavi başarıyla gerçekleşti");
    }

    @Override
    void yaka_karti_oku() {
        super.yaka_karti_oku(); 
        System.out.println("Diploma aldığı Yüksek Öğretim Kurumu:"+diploma_aldigi_kurum);
    }
}

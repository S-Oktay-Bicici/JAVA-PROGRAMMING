public class Bashekim extends Isgucu{
    private String unvan;
    private String uzmanlik_alani;
    private int hizmet_suresi;
    
    public Bashekim(String ad, String soyad, int kimlikNo,String unvan,String uzmanlik_alani,int hizmet_suresi) {
        super(ad, soyad, kimlikNo);
        this.unvan=unvan;
        this.uzmanlik_alani=uzmanlik_alani;
        this.hizmet_suresi=hizmet_suresi;    
    }
	
    void calis() throws InterruptedException{
        String s1="Başhekim "+getAd()+" doktorların yıllık izinlerini denetliyor...";
        Thread.sleep(3000);
        String s2="Başhekim "+getAd()+" laboratuvar hizmetlerini denetliyor...";
        Thread.sleep(3000);
        System.out.println(s1);
        System.out.println(s2);    
    }

    @Override
    void yaka_karti_oku() {
        super.yaka_karti_oku(); 
        System.out.println("Unvan:"+unvan);
        System.out.println("Uzmanlık Alanı:"+uzmanlik_alani);
        System.out.println("Hizmet Süresi:"+hizmet_suresi);
    }
    
    
}

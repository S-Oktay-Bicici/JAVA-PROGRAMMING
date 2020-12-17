package alistirma;

public class YatakOdasi extends Bolum{

	public YatakOdasi(int en, int boy, int yukseklik, String duvarRengi) {
		super(en, boy, yukseklik, duvarRengi);
	}

	@Override
	void bilgileriGoster() {
		System.out.println("Yatak odasý bilgileri: \nGeniþlik: "+getEn()+
				"\nUzunluk: "+getBoy()+"\nYükleklik: "+getYukseklik()+"\nDuvar Rengi: "+getDuvarRengi());
		
	}

}

package alistirma;

public class Banyo extends Bolum{

	public Banyo(int en, int boy, int yukseklik, String duvarRengi) {
		super(en, boy, yukseklik, duvarRengi);
	}

	@Override
	void bilgileriGoster() {
		System.out.println("Banyo bilgileri: \nGeniþlik: "+getEn()+
				"Uzunluk: "+getBoy()+"\nYükleklik: "+getYukseklik()+"\nDuvar Rengi: "+getDuvarRengi());
		
	}

}

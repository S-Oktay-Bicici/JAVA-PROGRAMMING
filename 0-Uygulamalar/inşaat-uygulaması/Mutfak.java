package alistirma;

public class Mutfak extends Bolum{

	public Mutfak(int en, int boy, int yukseklik, String duvarRengi) {
		super(en, boy, yukseklik, duvarRengi);
		// TODO Auto-generated constructor stub
	}

	@Override
	void bilgileriGoster() {
		System.out.println("Mutfak bilgileri: \nGeniþlik: "+getEn()+
				"Uzunluk: "+getBoy()+"\nYükleklik: "+getYukseklik()+"\nDuvar Rengi: "+getDuvarRengi());
		
	}

}

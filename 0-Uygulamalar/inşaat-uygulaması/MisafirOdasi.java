package alistirma;

public class MisafirOdasi extends Bolum{

	public MisafirOdasi(int en, int boy, int yukseklik, String duvarRengi) {
		super(en, boy, yukseklik, duvarRengi);
		// TODO Auto-generated constructor stub
	}

	@Override
	void bilgileriGoster() {
		System.out.println("Misafir odasý bilgileri: \nGeniþlik: "+getEn()+
				"Uzunluk: "+getBoy()+"\nYükleklik: "+getYukseklik()+"\nDuvar Rengi: "+getDuvarRengi());
		
	}

}

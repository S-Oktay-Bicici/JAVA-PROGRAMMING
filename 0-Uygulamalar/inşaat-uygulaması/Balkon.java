package alistirma;

public class Balkon extends Bolum{

	public Balkon(int en, int boy, int yukseklik, String duvarRengi) {
		super(en, boy, yukseklik, duvarRengi);
		// TODO Auto-generated constructor stub
	}

	@Override
	void bilgileriGoster() {
		System.out.println("Balkon bilgileri: \nGenişlik: "+getEn()+
				"Uzunluk: "+getBoy()+"\nYükleklik: "+getYukseklik()+"\nDuvar Rengi: "+getDuvarRengi());
		
	}

}

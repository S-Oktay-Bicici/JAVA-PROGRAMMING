package alistirma;

public class Main {
	public static void main(String[] args) {
		
		/*
		  
		 	2+1 (yatak odasý, oturma odasý, salon, mutfak, banyo - balkon)
		 	3+1 (yatak odasý, oturma odasý, çocuk odasý, salon, mutfak, banyo - balkon)
		 	4+1 (yatak odasý, oturma odasý, çocuk odasý, misafir odasý, mutfak, banyo - balkon)
		 
		 */
		OturmaOdasi oturmaOdasi=new OturmaOdasi(5, 6, 3, "Beyaz");
		YatakOdasi yatakOdasi=new YatakOdasi(6, 6, 3, "Bej");
		Salon salon=new Salon(8, 7, 3, "Beyaz");
		Mutfak mutfak=new Mutfak(2, 5, 3, "Sarý");
		Banyo banyo=new Banyo(3, 3, 3, "Turuncu");
		
		Balkon balkon=new Balkon(3, 5, 3, "Kýrmýzý");
		CocukOdasi cocukOdasi=new CocukOdasi(3, 4, 3, "Mavi");
		
		
		Daire daire=new Daire(yatakOdasi, oturmaOdasi, salon, mutfak, banyo,balkon);
		
		Daire daire2=new Daire(yatakOdasi, oturmaOdasi, salon, mutfak, banyo, cocukOdasi);
		
		daire.getMutfak().bilgileriGoster();
		daire.getOturmaOdasi().bilgileriGoster();
	}
}

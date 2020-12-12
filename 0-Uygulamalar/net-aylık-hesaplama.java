
public class Main {
	public static void main(String[] args) {
		
		/*
		
		Kullanýcýnýn çalýþtýðý gün ile günlük ücretine göre o kiþinin net aylýk ücretini hesaplayýn.
		
		- Aylýk brüt gelir = (günlük ücret* çalýþýlan gün sayýsý)
		- Gelir vergisi = (aylýk brüt gelir * vergi oraný)
		- Net aylýk ücret = (Aylýk brüt gelir – Gelir vergisi)
		
		*/
		
		netAylik(150, 25);
		
	}
	
	public static int aylikBrut(int calisilanGun,int ucret) {
		System.out.println("aylikBrut Metodu");
		
		int aylikBrut=calisilanGun*ucret;
		
		return aylikBrut;
	}
	
	public static double gelirVergisi(int aylikBrutGelir) {
		System.out.println("gelirVergisiMetodu");
		
		double gelirVergisi=aylikBrutGelir*0.18;
		
		return gelirVergisi;
	}
	
	public static void netAylik(int ucret,int calisilanGun) {
		System.out.println("NetAylik Metodu");
		
		int aylikBrut=aylikBrut(calisilanGun, ucret);
		
		double gelirVergi=gelirVergisi(aylikBrut);
		
		System.out.println("Net maaþýnýz: "+(aylikBrut-gelirVergi));
		
	}
	
	
	
}

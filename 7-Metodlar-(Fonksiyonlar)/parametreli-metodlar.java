
public class Main {
	public static void main(String[] args) {
		
		/*
		
		Eriþim Belirleyicisi= public, private, protected
		Ekstra Özellik= static, final
		Geri Dönüþ Tipi= void, int..., String, boolean, char, 
		
		*/
		
		//EriþimBelirleyicisi ekstraÖzellik ekstraÖzellik geriDönüþTipi isim(parametre){ } 
		/*
		topla(18,5);
		
		topla(34,10);
		
		topla(78,14);
		
		carp(5,4);*/
		/*
		
		yasSoyle("Muhammed",45);
		yasSoyle("Ümit", 29);
		yasSoyle("Emin", 28);*/
		/*
		int a=10+cikarma(38, 9);
		
		System.out.println("a: "+a);
		
		String isim=isimSoyle("Ümit");
		System.out.println(isim);
		*/
		
		int sonuc=cikarma(20, 4)+bolme(20, 4);
		System.out.println(sonuc);
	}
	
	
	public static int bolme(int sayi1,int sayi2) {
		
		return sayi1/sayi2;
		
	}
	
	
	
	public static int cikarma(int sayi1,int sayi2) {
		
		int sonuc=sayi1-sayi2;
		
		//System.out.println("Sonuç: "+sonuc);
		
		return sonuc;
	}
	
	public static String isimSoyle(String isim) {
		
		String mesaj="Merhaba, "+isim;
		
		return mesaj;
	}
	
	
	
	public static void topla(int sayi,int sayi2) {
		
		//System.out.println("Girdiðiniz sayý ile 10'un toplamý: "+(sayi+10));
		
		System.out.println("Toplamlarý: "+(sayi+sayi2));
		
	}
	
	private static void carp(int sayi1,int sayi2) {
		
		System.out.println("Sayýlarýn Çarpýmý: "+(sayi1*sayi2));
		
	}
	
	public static void yasSoyle(String isim,int yas) {
		
		System.out.println("Merhaba, "+isim+"\nYaþýnýz: "+yas);
		
	}
	
	
}

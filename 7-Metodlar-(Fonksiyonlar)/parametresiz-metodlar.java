import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		
		Eriþim Belirleyicisi= public, private, protected
		Ekstra Özellik= static, final
		Geri Dönüþ Tipi= void, int..., String, boolean, char, 
		
		*/
		
		//EriþimBelirleyicisi ekstraÖzellik ekstraÖzellik geriDönüþTipi isim(parametre){ } 
		
		topla();
		
		carpma();
		
	}
	
	public static void topla() {
		
		/*
		System.out.println("Merhaba, topla metodunu kullandýnýz.");
		
		System.out.println("A+B: "+(14+15));*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Birinci sayýyý giriniz: ");
		int sayi1=scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		int sayi2=scan.nextInt();
		
		System.out.println("Toplamlarý: "+(sayi1+sayi2));
		
	}
	
	
	public static void carpma() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Birinci sayýyý giriniz: ");
		int sayi1=scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		int sayi2=scan.nextInt();
		
		System.out.println("Çarpýmlarý: "+(sayi1*sayi2));
	}
	
	
	
}

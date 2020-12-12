import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Vize notu ve final notu girilen öðrencinin yýlsonu harf notunu hesaplayýnýz. (Vize %40, Final %60)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Vize notunuzu giriniz: ");
		double vizeNotu=scan.nextDouble();

		System.out.print("Final notunuzu giriniz: ");
		double finalNotu=scan.nextDouble();
		
		
		double ortalama=vizeNotu*0.4+finalNotu*0.6;
		
		if(ortalama>=90) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz AA");
		}else if(ortalama>=85) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz BA");
		}else if(ortalama>=80) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz BB");
		}else if(ortalama>=75) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz CB");
		}else if(ortalama>=70) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz CC");
		}else if(ortalama>=65) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz DC");
		}else if(ortalama>=60) {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Harf Notunuz DD");
		}else {
			System.out.println("Ortalamanýz: "+ortalama);
			System.out.println("Dersi tekrar alacaksýnýz.");
		}
		
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		//Final notu, vize notu ve proje notu girilen öðrencinin yýlsonu notunu hesaplayýn. (Vize %30, Proje %20, Final %50)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen Vize notunuzu giriniz: ");
		double vizeNotu=scan.nextDouble();
		
		System.out.print("Lütfen final notunuzu giriniz: ");
		double finalNotu=scan.nextDouble();

		System.out.print("Lütfen proje notunuzu giriniz: ");
		double projeNotu=scan.nextDouble();
		
		
		System.out.println("Öðrencinin yýlsonu notu: "+(vizeNotu*0.3+finalNotu*0.5+projeNotu*0.2));
		
	}
}

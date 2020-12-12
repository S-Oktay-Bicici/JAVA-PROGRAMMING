import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Yükekliði ve taban uzunluðu verilen üçgenin alanýný hesaplayýnýz. Formul: (yükseklik x taban uzunluðu)/2
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Üçgenin yüksekliðini giriniz: ");
		double yukseklik=scan.nextDouble();
		
		System.out.print("Üçgenin taban uzunluðunu giriniz: ");
		double tabanUzunlugu=scan.nextDouble();
		
		double alan=yukseklik*tabanUzunlugu/2;
		
		System.out.println("Üçgenin alaný: "+alan);
		
		
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Klavyeden girilen sayýnýn tek mi çift mi olduðunu belirleyiniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {
			System.out.println("Sayý: "+sayi+" çift bir sayýdýr.");
		}else {
			System.out.println("Sayý: "+sayi +" tek bir sayýdýr.");
		}
		
		
	}
}

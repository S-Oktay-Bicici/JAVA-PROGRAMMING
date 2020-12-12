import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Kenar uzunluklarý girilen üçgenin çeþidini belirleyiniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Üçgenin birinci kenarýný giriniz: ");
		int a=scan.nextInt();

		System.out.print("Üçgenin ikinci kenarýný giriniz: ");
		int b=scan.nextInt();

		System.out.print("Üçgenin üçüncü kenarýný giriniz: ");
		int c=scan.nextInt();
		
		
		if(a==b && b==c) {
			System.out.println("Üçgen Eþkenar bir üçgendir.");
		}else if(a==b || b==c || a==c) {
			System.out.println("Üçgen ikizkenar bir üçgendir.");
		}else {
			System.out.println("Üçgen çeþit kenar üçgendir.");
		}
		
		
	}
}

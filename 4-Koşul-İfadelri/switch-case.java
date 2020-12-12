import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Yaþýnýzý giriniz: ");
		int yas=scan.nextInt();
		
		
		switch(yas) {
		
		case 25:
			System.out.println("Yaþýnýz 25");
		break;
		
		case 20:
			System.out.println("Yaþýnýz 20");
		break;
		
		case 18:
			System.out.println("Yaþýnýz 18");
		break;
		
		default:
			System.out.println("Yaþýnýz bilinemedi.");
		break;
		}
		
		
	}
}

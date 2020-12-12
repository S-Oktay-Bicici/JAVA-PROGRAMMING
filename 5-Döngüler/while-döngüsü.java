import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int i=0;
		while(i<=15) {
			
			//System.out.println("Merhaba");
			System.out.println("i: "+i);
			
			i++;
		}
		
		
		int a=10;
		
		Scanner scan=new Scanner(System.in);
		
		while(a>5) {
			
			System.out.print("isminizi giriniz: ");
			String isim=scan.nextLine();
			System.out.println("Ýsminiz: "+isim);
			a--;
		}
		
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Klavyeden girilen sayýya kadar olan sayýlardan çift olanlarýn toplamýný bulun...
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Sayý giriniz: ");
		int sayi=scan.nextInt();
		int toplam=0;
		
		/*
		int i=0;
		
		while(i<=sayi) {
			
			if(i%2==0) {
				System.out.println("i: "+i);
				toplam+=i;
			}
			
			i++;
			
		}
		System.out.println("Toplamlarý: "+toplam);
		*/
		
		
		
		
		while(sayi>0) {
			
			if(sayi%2==0) {
				System.out.println("Sayý: "+sayi);
				toplam+=sayi;
			}
			sayi--;
		}
		System.out.println("Toplam: "+toplam);
		
	}
}

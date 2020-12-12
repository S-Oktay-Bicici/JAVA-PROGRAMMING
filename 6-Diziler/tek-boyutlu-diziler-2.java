import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		int [] sayilar=new int[5];
		
		sayilar[0]=10;
		sayilar[1]=9;
		sayilar[4]=18;
		//sayilar[5]=10;
		System.out.println(sayilar[4]);
		System.out.println(sayilar[0]);*/
		
		//int [] a= {14,13,5,9,85,29,19};
		
		//System.out.println(a[6]);
		
		String [] isimler=new String[5];
		/*
		for(int i=0;i<5;i++) {
			
			isimler[i]="eleman: "+i;
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(isimler[i]);
		}*/
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("Ýsim giriniz: ");
			String isim=scan.nextLine();
			isimler[i]=isim;
		}
		for(int i=0;i<5;i++) {
			System.out.println(isimler[i]);
		}
		
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Yarıçapı girilen dairenin çevresini hesapla. (PI= 3.14) Formul: 2πr
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Yarıçapı giriniz: ");
		double yaricap=scan.nextDouble();
		
		double cevre=2*Math.PI*yaricap;
		
		System.out.println("Dairenin çevresi: "+cevre);
		
	}
}

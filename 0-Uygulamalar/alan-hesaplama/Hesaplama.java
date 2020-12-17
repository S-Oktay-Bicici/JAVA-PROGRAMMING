
import java.util.Scanner;

public abstract class Hesaplama {
    abstract double alan();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		
        System.out.print("Lütfen karenin bir kenarının uzunluğunu giriniz:");
        double kenar=scanner.nextDouble();
		
		Hesaplama kare=new Kare(kenar);
		System.out.println("Karenin alanı="+kare.alan());
		 
		System.out.println("");
			
		System.out.print("Lütfen dairenin yarıçapını giriniz:");
		double yaricap=scanner.nextDouble();
			
		Hesaplama daire=new Daire(yaricap);
		System.out.println("Dairenin alanı="+daire.alan());
            
    }
  
}

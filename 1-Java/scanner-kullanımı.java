
import java.util.Scanner;

public class Veri {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);   
		
        // System.out.print("Lütfen yaşınızı giriniz:");
		//  int yas= scanner.nextInt();
        //  System.out.println("Girilen yaş değeri="+yas);
		
        System.out.println("");
        System.out.print("Lütfen adınızı giriniz:"); 
		String ad=scanner.nextLine();
		
        System.out.println("Kulanıcının adı="+ad);
		
        System.out.print("Lütfen bir sayı giriniz:");
		byte sayi=scanner.nextByte();
		
        System.out.println("Girilen sayı="+sayi);
        System.out.println("Lütfen boyunuzu giriniz(metre cinsinden):");
        double boy=scanner.nextDouble();
		
        System.out.println("Kullanıcının boyu(metre cinsinden)="+boy);
    }
}

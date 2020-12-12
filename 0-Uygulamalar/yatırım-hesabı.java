
import java.util.Scanner;

public class Hesaplama {
	public static void main(String[] args) {
		double faiz_orani=24;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Yatırmak istediğiniz para tutarını giriniz:");    
		double anapara=scanner.nextDouble();
		
		System.out.println("Vade süresini giriniz:(Yıl cinsinden)");
		int vade_suresi=scanner.nextInt();
		
		double faiz_getirisi=(anapara)*(faiz_orani/100)*vade_suresi;
		double toplam_getiri=anapara+faiz_getirisi;
		
        System.out.println("Faiz getirisi:"+faiz_getirisi+" TL'dir");
        System.out.println("Faiziyle beraber alınan tutar:"+toplam_getiri+" TL'dir");    
	}
}

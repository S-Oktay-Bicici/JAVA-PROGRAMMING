
import java.util.Scanner;

/*
x altıgenin bir kenarın uzunluğu ve r dairenin yarıçapı olmak üzere
Altıgenin Alanı-->Alan=6*((x² * √3) / 4
Dairenin Alanı--> Π.r²

*/public class GeometrikAlanHesapla {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
        System.out.print("Altıgenin bir kenar uzunluğunu giriniz:");
        int kenar=s.nextInt();
		
        System.out.print("Dairenin yarıçapını giriniz:");     
        int yaricap=s.nextInt();
		
        System.out.println("Altıgenin Alanı="+6*((kenar*kenar*Math.sqrt(3))/4));
        System.out.println("Dairenin Alanı="+Math.PI*yaricap*yaricap);
        
    }
}

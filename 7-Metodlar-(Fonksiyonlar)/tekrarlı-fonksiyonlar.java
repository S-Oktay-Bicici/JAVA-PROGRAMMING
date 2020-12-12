
import java.util.Scanner;

public class Faktoriyel {
	//4!=4.3.2.1=24
    static int faktoriyel_hesapla(int a){
        if(a<=1){
            return (1);
        }
        else {
            return(a*faktoriyel_hesapla(a-1));
        } 
    }
	
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
        System.out.print("Lütfen faktöriyelini hesaplamak istediğiniz sayıyı giriniz:");
        int sayi=scanner.nextInt();
		
        faktoriyel_hesapla(sayi);
            if(sayi<0){
                System.out.println("Lütfen 0 veya 0'dan büyük bir sayı giriniz");
            }
            else {
                System.out.println(sayi+"!= "+faktoriyel_hesapla(sayi));
            }
    }
}

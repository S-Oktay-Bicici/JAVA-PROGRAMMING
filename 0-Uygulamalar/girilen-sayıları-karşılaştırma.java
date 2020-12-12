
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        int x=scanner.nextInt();
		
        System.out.print("İkinci sayıyı giriniz:");    
        int y=scanner.nextInt();
		
        System.out.print("Üçüncü sayıyı giriniz:");    
        int z=scanner.nextInt();
		
		System.out.println("Üç sayı arasından en küçük sayı="+Math.min(Math.min(x, y),Math.min(y, z)));
		System.out.println("Üç sayı arasından en büyük sayı="+Math.max(Math.max(x, y),Math.max(y, z)));

        }
}

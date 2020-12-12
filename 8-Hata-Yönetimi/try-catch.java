import javax.swing.*;
import java.util.Scanner;

public class hata{
	public static void main(String[] args){
		int i = 0;
		while(i<5){
			Scanner nesen = new Scanner(System.in);
			try{
				System.out.println("Sayı1: ");
				int sayi1 = nesne.nextInt();
				
				System.out.println("Sayı2: ");
				int sayi2 = nesne.nextInt();
				
				System.out.println("bölüm: "+sayi1/sayi2);
				i++;
			}catch(ArithmeticException e){
				System.out.println("Sayı sıfıra bölünmez. ");
			}
		}	
	}
}
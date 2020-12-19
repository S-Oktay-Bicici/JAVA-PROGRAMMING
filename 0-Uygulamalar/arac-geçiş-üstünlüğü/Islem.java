
import java.util.PriorityQueue;
import java.util.Scanner;

public class Islem {
    public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
    PriorityQueue<Arac> a=new PriorityQueue<>();
	
    String s="Sürücü adı ve araç türünü giriniz\n"
              + "Araç Türleri:Kargo,Polis,Itfaiye veya Ambulans olabilir";
    System.out.println(s);
    while(a.size()<4){
        System.out.print("Sürücü adı:");
        String ad=scanner.nextLine();
		
        System.out.print("Araç türü:");
        System.out.println("");
		
        String arac_turu=scanner.nextLine();
         a.add(new Arac(ad, arac_turu));        
    }
	
    int b=1;
    while(!a.isEmpty()){
        System.out.println("");
		System.out.println("Aracın trafikteki geçiş üstünlüğü sıralaması:"+b);
        System.out.println(a.poll());
		b++;
    }
}
}

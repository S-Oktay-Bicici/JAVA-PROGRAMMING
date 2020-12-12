
import java.util.Scanner;

public class Rezervasyon {
    public static void main(String[] args) {
		String [] a=new String[12];
		a[9]="Ersin TAN";
		a[2]="Kazım CAN";
		a[3]="Nur GÜL";
		a[7]="Zekari TAN";
		a[8]="Akif CAN";
		a[4]="Ali KAHRAMAN";
		
        String giris="Pansiyomuza Hoş Geldiniz\n"
                + "Pansiyonumuzda 12 adet 1'den 12'ye kadar numaralı odalar bulunmaktadır\n";
        String bilgiler="Lütfen pansiyonumuzda kalmak için adınızı,soyadınızı ve\n"
                + "kalmak istediğiniz oda numarasını giriniz.";
        System.out.println(giris+bilgiler);
		
        System.out.println("");
        System.out.println(""); 
		
        Scanner scanner=new Scanner(System.in);
		
        System.out.print("Adınız:");
        String ad=scanner.nextLine();
		
        System.out.print("Soyadınız:");
        String soyad=scanner.nextLine();
		
        while(true){
			System.out.print("Hoş geldiniz "+ad+" Bey/Hanım"+" lütfen kalmak istediğiniz oda numarasını giriniz:");
			int oda=scanner.nextInt();
            for(int i=0;i<a.length;i++){
                if(a[oda]!=null){
                    System.out.println("Resepsiyonist'e uyarı mesajı-->"+(oda)+" numaralı odada "+a[oda]+" bulunuyor");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(ad+" Bey/Hanım "+oda+" numaralı odamız doludur.Lütfen farklı bir oda seçiniz");
                    break;
                }
                else {
                    System.out.println(ad+" Bey/Hanım "+(oda)+" numaralı odamız boş.Odanıza yerleşebilirsiniz");
                    return;
                }
            }
        }
	}
}

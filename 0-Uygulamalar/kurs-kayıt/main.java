import java.util.Scanner;

	public class Islem {
        public static void main(String[] args) throws InterruptedException {
			Sekreter s=new Sekreter("Nurgül");
			Scanner scanner =new Scanner(System.in);
			String giris="Kurs kayıt birimine hoş geldiniz\n"
				+ "Ben bu kurstta sekreter biriminden sorumlu "+s.getAd()+"\n"
				+ "Genel olarak kurs hakkında bilgi vermek gerekirse\n"
				+ "Java,Kotlin ve Scala olmak üzere üç tür kursumuz bulunmaktadır\n"
				+ "Kurs ücretleri sabit olup 3.000 TL'dir\n"
				+ "Kursumuza kabul edilmeniz için ücreti peşin ödemeniz gerekmektedir";
            System.out.println("////////////////////");
			
            System.out.println(giris);
			
            System.out.println("////////////////////");
			
            System.out.print("Lütfen kaydolmak istediğiniz kurs adını giriniz:");
      
            String kurs_adi=scanner.nextLine();
            System.out.print("Lütfen kursa kaydolmak için muhasebeye yatıracağınız parayı giriniz:");
			
            int yatirilacak_ucret=scanner.nextInt();
            if(yatirilacak_ucret==s.getUcret()){
                System.out.println("");
                s.islem_sonucu();
				Muhasebe m=new Muhasebe("Mehmet");
                m.degerlendirme(s);
             }
            else {
                System.out.println("Ücretin tamamını ödemediğiniz için başvurunuz reddedildi.");
                return;
            }            
        }
    }

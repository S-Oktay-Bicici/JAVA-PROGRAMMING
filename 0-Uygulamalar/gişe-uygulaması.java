
import java.util.Scanner;

public class GiseUygulamasi {
    public static int toplam_maliyet_hesapla(int toplamGecirilenDakika){
        int havaalaniGirisUcreti=50;
        int dakikaMaliyeti=2;
            return(toplamGecirilenDakika*dakikaMaliyeti+havaalaniGirisUcreti);
        
    }
    public static int toplam_maliyet_hesapla(int toplamGecirilenDakika,int otoparktaGecenSure){
        int havaalaniGirisUcreti=50;
        int dakikaMaliyeti=2;
        int otoparkUcreti=3;
        return((toplamGecirilenDakika*dakikaMaliyeti)+(otoparktaGecenSure*otoparkUcreti)+havaalaniGirisUcreti);
         
    }
    public static void main(String[] args) throws InterruptedException {
Scanner scanner=new Scanner(System.in);
    String message="Havaalanımıza Hoş Geldiniz\n"
            + "Havaalanı giriş ücreti 50 TL'dir\n"
            + "Havaalanına araçsız girişler için A kapısından araçlı girişler "
            + "için ise B kapısındandır\n"
            + "Havaalanında geçirdiğiniz her dakika boyunca ücrete tabi tutulacaksınız "
            + "ve bu ücreti çıkışta ödeyeceksiniz\n"
            + "Havaalanında geçirdiğiniz her dakika için 2 TL ücret alınır\n"
            + "Havaalanında aracınızla geçirdiğiniz her dakika için 2 TL ve ek olarak"
            + " otoparkta geçirdiğiniz her dakika için 3 TL ücret alınır";
        System.out.println(message);
            System.out.println("");
            System.out.println("");
        System.out.print("Lütfen kapıyı seçiniz:");    
        String kapiSecimi=scanner.nextLine();
       
        while(true){
            if(kapiSecimi.equals("A")){
                String c1="Havaalanı çıkış gişesine hoş geldiniz\n"
                        + "Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz";
                System.out.println(c1);
                int toplamGecirilenDakika=scanner.nextInt();
                System.out.println("Toplam Ödeme Miktarı:"+toplam_maliyet_hesapla(toplamGecirilenDakika));   
                System.out.println("Ödeme işlemeniz gerçekleşiyor...");
                Thread.sleep(2000);
                System.out.println("Ödeme işleminiz başarıyla gerçekleşti.İyi günler dileriz");
                        return;
                        
            }
            else if(kapiSecimi.equals("B")){
            String c2="Havaalanı çıkış gişesine hoş geldiniz\n"
                    + "Havaalanında geçirdiğiniz toplam dakikayı giriniz";
                System.out.println(c2);
                int toplamGecirilenDakika=scanner.nextInt();
                System.out.print("Aracınızın otoparkta kaldığı süreyi giriniz:");
                int otoparktaGecenSure=scanner.nextInt();
                System.out.println("Toplam Ödeme Miktarı:"+toplam_maliyet_hesapla(toplamGecirilenDakika, otoparktaGecenSure));
                System.out.println("Ödeme işleminiz gerçekleşiyor...");
                Thread.sleep(2000);
                System.out.println("Ödeme işlemeniz başarıyla gerçekleşti.İyi günler dileriz");
                    return;
            }
            else {
                System.out.println("Geçersiz bir seçim yaptınız");
                   break;
                   
            }
        }
}
    
}

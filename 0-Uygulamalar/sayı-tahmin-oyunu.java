
import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
		
        short tahmin_hakki=6;
		String message="Sayı Tahmin Oyununa Hoşgeldiniz\n"
        + "Oyunumuzda tahmin edilecek sayı 0 ile 20 arasındadır\n"
        + "Toplam 6 tahmin hakkınız bulunmaktadır\n"
        + "Tahmin hakkınız bitince oyun sonlanır\n"
        + "Oyun başladı\nBaşarılar\n"
        + "Tahmini sayıyı giriniz";
		
		while(true){
			System.out.println(message);
			Random random=new Random();
			
			int tahmin_edilecek_sayi=random.nextInt(20);
			Scanner scanner=new Scanner(System.in);
			
			for(int i=tahmin_hakki;i>0;i--){
				int tahmin_edilen_sayi=scanner.nextInt();
				if(tahmin_edilecek_sayi==tahmin_edilen_sayi){
					String message2="Tebrikler sayıyı doğru tahmin ettiniz\n"
                    + "Tekrar oynamak için 1'e\n"
                    + "Çıkmak için 0'ye basınız";
                    System.out.println(message2);
                    int cevap=scanner.nextInt();
                    if(cevap==0){
                        System.out.println("Çıkış yapılıyor...");
                        return;
                    }
                    else{
                        break;
                    }
				}
				else if(tahmin_edilecek_sayi!=tahmin_edilen_sayi){
					System.out.println("Hatalı bir tahmin yaptınız."+"Kalan tahmin hakkı:"+(i-1));
					if(i==1){
						String message3="Tahmin hakkınız bitti\n"
						+ "Tekrar oynamak için 1'e\n"
						+ "Çıkmak için 0'a basınız";
						System.out.println(message3);
						int cevap=scanner.nextInt();
                        if(cevap==0){
                            System.out.println("Çıkış yapılıyor...");
                            return;
                        }
                        else {
                            break;
                        }
					}
					tahminOrani(tahmin_edilen_sayi, tahmin_edilecek_sayi);
				}
			}
		}
}

	static void tahminOrani(int tahmin_edilen_sayi,int tahmin_edilecek_sayi){
        int f=tahmin_edilen_sayi-tahmin_edilecek_sayi;
        if(f<=0 && f>-2|| f>=0 && f<2){
            System.out.println("Sayıya çok yaklaştınız");
        }
        else if(f<=-2 && f>-4 || f>=2 &&f<4){       
            System.out.println("Sayıya yaklaşıyorsunuz");
        }
        else if(f<=-4 &&f>-14 || f>=4 &&f< 14){
            System.out.println("Sayıdan uzaklaşıyorsunuz");
        }
        else if(f<=-15 && f>-19 || f>=15 && f<=19){
            System.out.println("Sayıdan çok uzaklaştınız");
        }
    }
}

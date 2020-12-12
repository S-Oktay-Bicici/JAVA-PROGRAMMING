import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int tutar=0;
		
		while(true) {
			
			String giris="Hangi iþlemi yapmak istersiniz?\n1-Alýþveriþ Yap\n2-Tutar Hesapla";
			System.out.println(giris);
			int secim=scan.nextInt();
			
			if(secim==1) {
				
				String urunler="Ürün Seçiniz.\n1-Ekmek - 2 TL\n2-Süt - 4 TL\n3-Çikolata - 1 TL\n";
				System.out.println(urunler);
				int urunSecim=scan.nextInt();
				
				if(urunSecim==1) {
					tutar+=2;
				}else if(urunSecim==2) {
					tutar+=4;
				}else if(urunSecim==3) {
					tutar+=1;
				}else {
					System.out.println("Hatalý giriþ yaptýnýz.");
				}
				
			}else {
				break;
			}
			
		}
		System.out.println("Toplam Tutar: "+tutar+" TL");
		
	}
}

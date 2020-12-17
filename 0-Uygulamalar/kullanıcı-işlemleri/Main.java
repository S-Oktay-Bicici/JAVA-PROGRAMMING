import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		VBKullanici vbKullanici=new VBKullanici();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1-)Kullanýcý Ekle\n2-)Kullanýcý Sil\n3-)Kullanýcý Güncelle\n4-)Tüm Kullanýcýlar\n5-)Çýkýþ");
			int islem=scan.nextInt();
			scan.nextLine();
			
			if(islem==1) {
				
				System.out.print("Kullanýcý Adý giriniz: ");
				String kulAdi=scan.nextLine();
				System.out.print("Kullanýcý parola giriniz: ");
				String parola=scan.nextLine();
				System.out.print("Kullanýcý isim giriniz: ");
				String isim=scan.nextLine();
				System.out.print("Kullanýcý soyisim giriniz: ");
				String soyisim=scan.nextLine();
				System.out.print("Kullanýcý mail giriniz: ");
				String mail=scan.nextLine();
				
				
				Kullanici kullanici=new Kullanici(kulAdi, parola, isim, soyisim, mail);
				
				vbKullanici.kullaniciKaydet(kullanici);
			}else if(islem==2) {
				System.out.print("Silmek istediðniiz kullanýcýnýn numarasýný giriniz: ");
				int id=scan.nextInt();
				scan.nextLine();
				
				vbKullanici.kullaniciSil(id);
				
			}else if(islem==3) {
				
				System.out.print("Kullanýcý Adý giriniz: ");
				String kulAdi=scan.nextLine();
				System.out.print("Kullanýcý parola giriniz: ");
				String parola=scan.nextLine();
				System.out.print("Kullanýcý isim giriniz: ");
				String isim=scan.nextLine();
				System.out.print("Kullanýcý soyisim giriniz: ");
				String soyisim=scan.nextLine();
				System.out.print("Kullanýcý mail giriniz: ");
				String mail=scan.nextLine();
				
				System.out.print("Hangi kullanýcýyý güncellemek istersiniz: ");
				int id=scan.nextInt();
				scan.nextLine();
				
				
				Kullanici kullanici=new Kullanici(kulAdi, parola, isim, soyisim, mail);
				vbKullanici.kullaniciGuncelle(id, kullanici);
				
			}else if(islem==4) {
				vbKullanici.kullaniciGoruntule();
			}else if(islem==5) {
				System.out.println("Program sonlandýrýldý.");
				break;
			}
			
		}
		
		
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		KitapIslemleri kitapIslemleri=new KitapIslemleri();
		
		while(true) {
			System.out.println("Hangi iþlemi yapmak istersiniz? \n1-)Kitap Ekle\n2-)Kitap Sil\n3-)Kitap Güncelle"
					+ "\n4-)Tüm Kitaplarý Görüntüle\n5-)Programý Sonlandýr");
			int cevap=scan.nextInt();
			scan.nextLine();
			
			if(cevap==1) {
				
				System.out.print("Kitap Ýsmi giriniz");
				String kitapAdý=scan.nextLine();

				System.out.print("Kitap ISBN no giriniz");
				String kitapIsbn=scan.nextLine();

				System.out.print("Kitap açýklamasý giriniz");
				String kitapAciklama=scan.nextLine();
				
				
				System.out.print("Yazar Ýsmi giriniz");
				String yazarAdi=scan.nextLine();

				System.out.print("Yazar yaþý giriniz");
				int yas=scan.nextInt();
				scan.nextLine();

				System.out.print("Yazar memleketi giriniz");
				String memleket=scan.nextLine();
				

				System.out.print("Yayýnevi Ýsmi giriniz");
				String yayineviAdi=scan.nextLine();
				
				System.out.print("Yayýnevi adresi giriniz");
				String adres=scan.nextLine();
				
				Yazar yazar=new Yazar(yazarAdi, yas, memleket);
				Yayinevi yayinevi=new Yayinevi(yayineviAdi, adres);
				Kitap kitap=new Kitap(kitapAdý, kitapIsbn, yazar, yayinevi, kitapAciklama);
				
				kitapIslemleri.kitapEkle(kitap);
				
			}else if(cevap==2) {
				System.out.print("Silmek istediðniiz kitabýn numarasýný giriniz: ");
				int index=scan.nextInt();
				scan.nextLine();
				kitapIslemleri.kitapSil(index);
				
			}else if(cevap==3) {
				System.out.print("Hangi kitabý güncellemek istersiniz: ");
				int index=scan.nextInt();
				scan.nextLine();
				
				System.out.print("Kitap Ýsmi giriniz");
				String kitapAdý=scan.nextLine();

				System.out.print("Kitap ISBN no giriniz");
				String kitapIsbn=scan.nextLine();

				System.out.print("Kitap açýklamasý giriniz");
				String kitapAciklama=scan.nextLine();
				
				
				System.out.print("Yazar Ýsmi giriniz");
				String yazarAdi=scan.nextLine();

				System.out.print("Yazar yaþý giriniz");
				int yas=scan.nextInt();
				scan.nextLine();

				System.out.print("Yazar memleketi giriniz");
				String memleket=scan.nextLine();
				

				System.out.print("Yayýnevi Ýsmi giriniz");
				String yayineviAdi=scan.nextLine();
				
				System.out.print("Yayýnevi adresi giriniz");
				String adres=scan.nextLine();
				
				Yazar yazar=new Yazar(yazarAdi, yas, memleket);
				Yayinevi yayinevi=new Yayinevi(yayineviAdi, adres);
				Kitap kitap=new Kitap(kitapAdý, kitapIsbn, yazar, yayinevi, kitapAciklama);
				
				kitapIslemleri.kitapGuncelle(index, kitap);
			}else if(cevap==4) {
				kitapIslemleri.tumKitaplar();
			}else if(cevap==5) {
				System.out.println("Program sonlandýrýldý.");
				break;
			}
			System.out.println("_________________________________________________________");
		}
		
		
		
		
	}
}

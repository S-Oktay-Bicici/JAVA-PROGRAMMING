import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Hangi iþlemi yapmak istersiniz?\n1-)Öðrenci Kaydet\n2-)Öðrenci Sil\n3-)Öðrencileri Görüntüle\n4-)Çýkýþ");
			
			int islem=scan.nextInt();
			scan.nextLine();
			if(islem==1) {
				
				System.out.print("Öðrenci ismi girin: ");
				String isim=scan.nextLine();
				System.out.print("Öðrenci soyismi girin: ");
				String soyisim=scan.nextLine();
				System.out.print("Öðrenci numarasý girin: ");
				int numara=scan.nextInt();
				scan.nextLine();
				System.out.print("Öðrenci ortalamasý girin: ");
				double ortalama=scan.nextDouble();
				scan.nextLine();
				
				Ogrenci ogrenci=new Ogrenci(numara, isim, soyisim, ortalama);
				
				ogrenciler.add(ogrenci);
				
			}else if(islem==2) {
				
				System.out.println("Hangi öðrencisi silmek istersiniz?");
				String isim=scan.nextLine();
				Ogrenci ogrenci=null;
				
				for(Ogrenci ogr:ogrenciler) {
					
					if(ogr.getAdi().equals(isim)) {
						ogrenci=ogr;
					}
				}
				ogrenciler.remove(ogrenci);
				
			}else if(islem==3) {
				
				if(ogrenciler.isEmpty()) {
					System.out.println("Þuan listede kayýtlý öðrenci bulunmamaktadýr.\n-------------------");
				}
				
				for(Ogrenci ogrenci:ogrenciler) {
					System.out.println("Öðrencinin Adý: "+ogrenci.getAdi()+
							"\nÖðrencinin Soyadý: "+ogrenci.getSoyadi()+"\nNumarasý: "+ogrenci.getNumarasi()+
							"\nÖðrencinin Ortalamasý: "+ogrenci.getOrtalama()+"\n-----------------------------");
				}
				
			}else if(islem==4) {
				System.out.println("Program sonlandýrýldý.");
				break;
			}
			
			
			
			
		}
		
		
	}
}

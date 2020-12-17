import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		MatematikOgretmeni matematikOgretmeni=new MatematikOgretmeni("Ýsmail", "Çetinkaya", 45);
		EdebiyatOgretmeni edebiyatOgretmeni=new EdebiyatOgretmeni("Nurhayat", "Örencik", 55);
		IngilizceOgretmeni ingilizceOgretmeni=new IngilizceOgretmeni("Esra", "Önay", 37);
		while(true) {
		
		System.out.println("Bir ders seçiniz:\n1-)Matematik\n2-)Edebiyat\n3-)Ýngilizce");
		
		
		int ders=scan.nextInt();
		scan.nextLine();
		
		if(ders==1) {
			System.out.println("Bir seçenek seçiniz: \n1-)Ders dinle\n2-)Sýnav ol\n3-)Quiz ol");
			int secim=scan.nextInt();
			scan.nextLine();
			
			if(secim==1) {
				dersDinle(matematikOgretmeni);
			}else if(secim==2) {
				sinavOl(matematikOgretmeni);
			}else if(secim==3) {
				matematikOgretmeni.quizYap();
			}else {
				System.out.println("Hatalý seçim yaptýnýz. ");
			}
		}else if(ders==2) {
			System.out.println("Bir seçenek seçiniz: \n1-)Ders dinle\n2-)Sýnav ol");
			int secim=scan.nextInt();
			scan.nextLine();
			if(secim==1) {
				dersDinle(edebiyatOgretmeni);
			}else if(secim==2) {
				sinavOl(edebiyatOgretmeni);
			}else {
				System.out.println("Hatalý bir seçin yaptýnýz.");
			}
		}else if(ders==3) {
			System.out.println("Bir seçenek seçiniz: \n1-)Ders dinle\n2-)Sýnav ol\n3-)Sözlü yap");
			int secim=scan.nextInt();
			scan.nextLine();
			if(secim==1) {
				dersDinle(ingilizceOgretmeni);
			}else if(secim==2) {
				sinavOl(ingilizceOgretmeni);
			}else if(secim==3) {
				ingilizceOgretmeni.sozluYap();
			}
			else {
				System.out.println("Hatalý bir seçin yaptýnýz.");
			}
		}else {
			System.out.println("Hatalý bir seçim yaptýnýz.");
		}
		
		}
	}
	
	public static void dersDinle(Ogretmen ogretmen) {
		ogretmen.dersAnlat();
	}
	
	public static void sinavOl(Ogretmen ogretmen) {
		ogretmen.sinavYap();
	}
	
}

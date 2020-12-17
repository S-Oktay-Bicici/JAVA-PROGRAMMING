
import java.util.Scanner;

public class Islem {
    public static void main(String[] args) throws InterruptedException {
		Bashekim b=new Bashekim("Hakan", "Yurt", 8877, "Profesör", "İç Hastalıkları", 20);
		Kardiyoloji k=new Kardiyoloji("Gülhan", "Tan", 8876, "Doçent");
		Noroloji n=new Noroloji("Ceylin", "Gül", 8875, "Ankara Üniversitesi");
		
		Scanner scanner=new Scanner(System.in);
		String komut="Hastane Sistemeni Hoş Geldiniz...\n"
			+ "Yapılabilecek İşlemler\n"
			+ "Başhekim birimiyle ilgili işlemler için 1'e\n"
			+ "Kardiyoloji birimiyle ilgili işlemler için 2'ye\n"
			+ "Nöroloji birimiyle ilgili işlemler için 3'e \n"
			+ "Sistemden çıkmak için 0'a basınız ";
        while(true){
            System.out.println("/////////////////////////////");
            System.out.println(komut);
            System.out.println("/////////////////////////////");
            System.out.println("");
            System.out.print("Lütfen yapmak istediğiniz işlemi giriniz:");
            String secim=scanner.nextLine();
            while(true){
                if(secim.equals("0")){
                    System.out.println("Sistemden çıkılıyor...");
                    Thread.sleep(3000);
                    return;
                }
                else if(secim.equals("1")){
                    System.out.println("Başhekim birimine hoş geldiniz."
						+ " Başhekim bilgileri tanımlanıyor...");
                    b.yaka_karti_oku();
                    b.calis();
                    System.out.println("Başhekim çalışmasını bitirdi");
                    break;
                }
                else if(secim.equals("2")){
                    System.out.println("Kardiyoloji birimine hoş geldiniz"
						+ " Kardiyoloji doktorunun bilgileri tanımlanıyor...");
                    k.yaka_karti_oku();
					String s="Kalp krizi riski hesaplamak için 1'e\n"
                        + "EKG çektirmek için 2'ye basınız";
                    System.out.println(s);
                    String secim2=scanner.nextLine();
                    if(secim2.equals("1")){
                        k.risk_hesapla();
                        break;
                    }
                    else if(secim2.equals("2")){
                        k.ekg_cek();
                        break;
                    }
                    else {
                        System.out.println("Hatalı bir seçim yaptınız");
                    }
                }
                else if(secim.equals("3")){
                    System.out.println("Nöroloji birimine hoş geldiniz."
                        + " Nöroloji doktorunun bilgileri tanımlanıyor...");
                    n.yaka_karti_oku();
					String s="Baş ağrısı tedavisi için 1'e\n"
                        + "Uyku bozukluğu tedavisi için 2'ye basınız";
                    System.out.println(s);
                    String secim3=scanner.nextLine();
                    if(secim3.equals("1")){
                       n.bas_agrisini();
                       break;
                    }
                    else if(secim3.equals("2")) {
                        n.uyku_bozuklugu();
                        break;
                    }
                    else {
                        System.out.println("Hatalı bir işlem yaptınız");
                         break;
                    }       
                }
            }
        }
    }
}

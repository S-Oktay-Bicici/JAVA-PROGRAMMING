
import java.util.Scanner;

public class HesapM {
    public static class Toplama{
        void toplama_yap(int a,int b,int c){
			int sonuc=a+b+c;
            System.out.println(a+"+"+b+"+"+c+"="+sonuc);		   
        }
    }
	
    public static class Cikarma{
        void cikarma_yap(int a,int b,int c){
			int sonuc=a-b-c;
			System.out.println(a+"-"+b+"-"+c+"="+sonuc);
        }  
    }
	
    public static class Carpma{
		void carpma_yap(int a,int b,int c){
			int sonuc=a*b*c;
			System.out.println(a+"*"+b+"*"+c+"="+sonuc);
        }
    }
	
    public static class Bolme{
		void bolme_yap(double a,double b){
			double sonuc=a/b;
			System.out.println(a+"/"+b+"="+sonuc);
		}
    }
	
    public static void main(String[] args) {
		String giris="Toplama işlemi yapmak için 1'e\n"
			+ "Çıkarma işlemi yapmak için 2'ye\n"
			+ "Çarpma işlemi yapmak için 3'e\n"
			+ "Bölme işlemi yapmak için 4 'e\n"
			+ "Çıkış için e'ye basınız";
			while(true){
				System.out.println(giris);
				Scanner scanner=new Scanner(System.in);
				String cevap=scanner.nextLine();
				
				if(cevap.equals("1")){
					System.out.println("Lütfen toplamak istediğiniz sayıları giriniz");
					
					System.out.print("1.Sayı=");
					int s1=scanner.nextInt();
					
					System.out.print("2.Sayı=");    
                    int s2=scanner.nextInt();
					
					System.out.print("3.Sayı=");
					int s3=scanner.nextInt();
					
					HesapM.Toplama t1=new HesapM.Toplama();
                    t1.toplama_yap(s1, s2, s3);
                }
                else if(cevap.equals("2")){
					System.out.println("Lütfen çıkarmak istediğiniz sayıları giriniz");
					
                    System.out.print("1.Sayı=");
                    int s1=scanner.nextInt();
					
					System.out.print("2.Sayı=");    
                    int s2=scanner.nextInt();
					
                    System.out.print("3.Sayı=");
                    int s3=scanner.nextInt();
					
					HesapM.Cikarma t1=new HesapM.Cikarma();
                    t1.cikarma_yap(s1, s2, s3);
                }
                else if(cevap.equals("3")){
					System.out.println("Lütfen çarpmak istediğiniz sayıları giriniz");
					
					System.out.print("1.Sayı=");
					int s1=scanner.nextInt();
					
                    System.out.print("2.Sayı=");    
					int s2=scanner.nextInt();
					
                    System.out.print("3.Sayı=");
					int s3=scanner.nextInt();
					
					HesapM.Carpma t1=new HesapM.Carpma();
                    t1.carpma_yap(s1, s2, s3);
                }
                else if(cevap.equals("4")){
					ystem.out.println("Lütfen bölmek istediğiniz sayıları giriniz");
					
                    System.out.print("1.Sayı=");
                    int s1=scanner.nextInt();
					
                    System.out.print("2.Sayı=");    
                    int s2=scanner.nextInt();
					
					HesapM.Bolme t1=new HesapM.Bolme();
                    t1.bolme_yap(s1, s2);
                }  
                else if(cevap.equals("e")){
                    System.out.println("Hoşcakalın");
                    return;
                }  
                else {
                    System.out.println("Hatalı bir işlem yaptınız");
                    break;
                }
           }
        } 
    }

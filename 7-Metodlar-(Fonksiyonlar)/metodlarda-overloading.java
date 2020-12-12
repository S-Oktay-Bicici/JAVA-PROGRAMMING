
public class Main {
	public static void main(String[] args) {
		
		topla(5,3);
		
		topla(7,8,9,10);
		
		topla(1,5,8);
		
		topla();
		
		topla("Toplama",2,3);
		
	}
	
	public static void topla(int sayi1,int sayi2) {
		
		System.out.println("Ýki parametreli Metot - Toplamlarý: "+(sayi1+sayi2));
	}
	
	public static void topla(int sayi1,int sayi2,int sayi3) {
		
		System.out.println("Üç parametreli metot - Toplamlarý: "+(sayi1+sayi2+sayi3));
	}
	
	public static void topla(int sayi1,int sayi2,int sayi3,int sayi4) {
		
		System.out.println("Dört parametreli metot - Toplamlarý: "+(sayi1+sayi2+sayi3+sayi4));
	}
	
	public static void topla() {
		System.out.println("Toplanacak deðerler yok.");
	}
	
	public static void topla(String islem,int sayi1,int sayi2) {
		
		System.out.println("Ýþlem: "+islem+" Toplamlarý: "+(sayi1+sayi2));
	}
	
}

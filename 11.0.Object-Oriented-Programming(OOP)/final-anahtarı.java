 
public class Main{
	public static void main(String[] args){
		
		//final olatak belirlenmiş değer değiştirilemez
		final int a = 4;
		int b = 3;
		
		a = 5; // hata vericek
		b = 5; //hata vermiyecek
	}
	
	
	void Parametre(final byte c){
		
		//final olatak tanımlanmış bir parametreye o method içerisinde 
		//değer ataması yapulamaz veya atanmış değer değiştirilemez
		
		c = 4; //hata vericek
		
	}
	
	//bir method final olarak tanımlanmışsa override edilmediği gibi 
	//miras olarak da alınamaz
	
	final void final_fonksiyon(){
		System.out.println("Final miras olarak alınamaz ve override edilemez.");
	}
}
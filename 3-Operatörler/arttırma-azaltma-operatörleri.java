public class Degisim {
    public static void main(String[] args) {
      /*"x" ve "y" adında iki tane değişkenimiz olduğunu farz edelim.        
        x+=y veya x=x+y---> x’i y’ye ekle x'i güncelle
        x-=y veya x=x-y---> x'den y'yi çıkar x'i güncelle
        x*=y veya x=x*y --> x ile y'yi çarp ve x'i güncelle
		x/=y veya x=x/y --->x'i y'ye böle ve x'i güncelle 
		x%=y veya x=x%y---->x'in y'ye bölümünden kalanla x'i güncelle
		++x ---> Önden 1 Artırma
		x++ veya x=x+1 ---> Sondan 1 Artırma
		--x ---> Önden 1 Çıkarma
		x-- ---> Son’dan 1 Çıkarma
	*/      
		int x=12;
		int y=5;
		x+=y;
        System.out.println("Güncel x değeri:"+x);
		x=x+y;
        System.out.println("Güncel x değeri-2:"+x);

}
}

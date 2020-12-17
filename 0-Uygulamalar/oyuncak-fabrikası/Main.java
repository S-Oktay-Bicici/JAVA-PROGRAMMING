
public class Main {
	public static void main(String[] args) {
		
		/*Oyuncak fabrikasında üretilen oyuncağın kafa kısmı istenilen kafalarla değiştirilebilsin ve 
		  oyuncağın altına farklı araçlar eklenebilsin. 
		 */
		
		SariKafa sariKafa=new SariKafa("Düz", "Sarı", "Yeşil");
		
		Bisiklet bisiklet=new Bisiklet();
		
		KırmızıKafa kırmızıKafa=new KırmızıKafa("Dalgalı", "Kırmızı", "Siyah");
		
		Motor motor=new Motor();
		
		MaviKafa maviKafa=new MaviKafa("Kıvırcık", "Mavi", "Mavi");
		
		Araba araba=new Araba();
		
		OyuncakBebek bebek=new OyuncakBebek(maviKafa, araba);
		
		bebek.selamla();
		bebek.hareketeGec();
		
		bebek.getArac().hizlan(15);
		
		bebek.getBas().bilgiler();
	}
}

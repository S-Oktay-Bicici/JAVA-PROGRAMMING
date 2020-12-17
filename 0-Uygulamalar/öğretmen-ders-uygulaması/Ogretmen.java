
public class Ogretmen {
	
	private String isim;
	private String soyisim;
	private int yas;
	public Ogretmen(String isim, String soyisim, int yas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	public void dersAnlat() {
		System.out.println(getIsim()+" "+getSoyisim()+ " öðretmenimiz ders anlatýyor.");
	}
	
	public void sinavYap() {
		System.out.println(getIsim()+" "+getSoyisim()+ " öðretmenimiz sýnav yapýyor.");
	}
	
	
	
}


public class Kitap {
	private String kitapAdi;
	private String kitapIsbnNo; 
	private Yazar yazar;
	private Yayinevi yayinevi;
	private String aciklama;
	public Kitap(String kitapAdi, String kitapIsbnNo, Yazar yazar, Yayinevi yayinevi, String aciklama) {
		super();
		this.kitapAdi = kitapAdi;
		this.kitapIsbnNo = kitapIsbnNo;
		this.yazar = yazar;
		this.yayinevi = yayinevi;
		this.aciklama = aciklama;
	}
	
	
	public Kitap(String kitapAdi, String kitapIsbnNo, Yazar yazar, Yayinevi yayinevi) {
		super();
		this.kitapAdi = kitapAdi;
		this.kitapIsbnNo = kitapIsbnNo;
		this.yazar = yazar;
		this.yayinevi = yayinevi;
	}



	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getKitapIsbnNo() {
		return kitapIsbnNo;
	}
	public void setKitapIsbnNo(String kitapIsbnNo) {
		this.kitapIsbnNo = kitapIsbnNo;
	}
	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	public Yayinevi getYayinevi() {
		return yayinevi;
	}
	public void setYayinevi(Yayinevi yayinevi) {
		this.yayinevi = yayinevi;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	public void kitapBilgileri() {
		System.out.println("kitap Adý: "+getKitapAdi()+"\nKitap ISBN: "+getKitapIsbnNo()+
				"\nYazar Adý: "+getYazar().getYazarAdi()+"\nYayýnevi Adý: "+getYayinevi().getYayineviAdi()+"\nAçýklama"+getAciklama()+"\n---------------");
	}
	
	
}

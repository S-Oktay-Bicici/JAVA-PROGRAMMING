
public class Kitap {
	private String kitapAdi;
	private String isbnNo;
	private Yayinevi yayinevi;
	private Yazar yazar;
	private String aciklama;
	public Kitap(String kitapAdi, String isbnNo, Yayinevi yayinevi, Yazar yazar, String aciklama) {
		super();
		this.kitapAdi = kitapAdi;
		this.isbnNo = isbnNo;
		this.yayinevi = yayinevi;
		this.yazar = yazar;
		this.aciklama = aciklama;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	public Yayinevi getYayinevi() {
		return yayinevi;
	}
	public void setYayinevi(Yayinevi yayinevi) {
		this.yayinevi = yayinevi;
	}
	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	
	
}

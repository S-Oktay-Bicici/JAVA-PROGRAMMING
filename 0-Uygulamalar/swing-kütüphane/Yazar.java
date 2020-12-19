
public class Yazar {
	private String yazarAdi;
	private int yazarYasi;
	private String memleket;
	public Yazar(String yazarAdi, int yazarYasi, String memleket) {
		super();
		this.yazarAdi = yazarAdi;
		this.yazarYasi = yazarYasi;
		this.memleket = memleket;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public int getYazarYasi() {
		return yazarYasi;
	}
	public void setYazarYasi(int yazarYasi) {
		this.yazarYasi = yazarYasi;
	}
	public String getMemleket() {
		return memleket;
	}
	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}
	
	
}

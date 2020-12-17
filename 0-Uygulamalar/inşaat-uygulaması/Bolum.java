package alistirma;

abstract class Bolum {
	private int en;
	private int boy;
	private int yukseklik;
	private String duvarRengi;
	
	public Bolum(int en, int boy, int yukseklik, String duvarRengi) {
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
		this.duvarRengi = duvarRengi;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	public int getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	public String getDuvarRengi() {
		return duvarRengi;
	}
	public void setDuvarRengi(String duvarRengi) {
		this.duvarRengi = duvarRengi;
	}
	
	abstract void bilgileriGoster();
	
}

package oop_interface;

public class Bisiklet implements Arac{

	private int vites;
	private int hiz;
	
	
	public int getVites() {
		return vites;
	}

	public void setVites(int vites) {
		this.vites = vites;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	@Override
	public void vitesAt(int vites) {
		this.vites=vites;
		System.out.println("Bisiketin vitesi "+vites+" e atýldý.");
	}

	@Override
	public void hizArttir(int hiz) {
		this.hiz=hiz;
		System.out.println("Bisikletin hýzý "+hiz+" seviyesine çýkarýldý."); 
	}

}

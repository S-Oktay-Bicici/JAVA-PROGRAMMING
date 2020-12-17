package oop_interface;

public class Motor implements Arac{

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
		System.out.println("Motorsikletin vitesi "+vites+" e atýldý");
		
	}

	@Override
	public void hizArttir(int hiz) {
		this.hiz=hiz;
		System.out.println("Motorsikletin hýzý "+hiz+" seviyesine çýkarýldý.");
	}
	
	public void bilgileriGoster() {
		System.out.println("Vites: "+vites+"\nHýz: "+hiz);
	}

}

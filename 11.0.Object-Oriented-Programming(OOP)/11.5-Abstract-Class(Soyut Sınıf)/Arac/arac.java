

abstract class Arac{
	
	private int hiz;
	private int vites;
	
	public Arac(int hiz, int vites){
		this.hiz = hiz;
		this.vites = vites;
	}
	
	public int getHiz(){
		return hiz;
	}
	
	public void setHiz(int hiz){
		this.hiz = hiz;
	}
	
	public int getVites(){
		return vites;
	}
	
	public void setVites(int vites){
		this.vites = vites;
	}
	
	abstract void vitesAt(int vites);
	
	abstract void gizArttir(int hiz);
	
	public void bilgileriGoster(){
		System.out.println("Vites: "+vites+"\nHız: "+hız);
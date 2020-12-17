
public class OyuncakBebek {
	private Bas bas;
	private Arac arac;
	
	
	public OyuncakBebek(Bas bas,Arac arac) {
		this.arac=arac;
		this.bas=bas;
		
	}

	public Bas getBas() {
		return bas;
	}

	public void setBas(Bas bas) {
		this.bas = bas;
	}

	public Arac getArac() {
		return arac;
	}

	public void setArac(Arac arac) {
		this.arac = arac;
	}
	public void selamla() {
		bas.selamla();
	}
	public void hareketeGec() {
		arac.hareketeGec();
	}
	
}

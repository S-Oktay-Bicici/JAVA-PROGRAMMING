
abstract class Bas {
	
	private String sacTipi;
	private String sacRengi;
	private String gozRengi;
	
	public Bas(String sacTipi, String sacRengi, String gozRengi) {
		super();
		this.sacTipi = sacTipi;
		this.sacRengi = sacRengi;
		this.gozRengi = gozRengi;
	}
	public String getSacTipi() {
		return sacTipi;
	}
	public void setSacTipi(String sacTipi) {
		this.sacTipi = sacTipi;
	}
	public String getSacRengi() {
		return sacRengi;
	}
	public void setSacRengi(String sacRengi) {
		this.sacRengi = sacRengi;
	}
	public String getGozRengi() {
		return gozRengi;
	}
	public void setGozRengi(String gozRengi) {
		this.gozRengi = gozRengi;
	}
	
	abstract void selamla();
	
	public void bilgiler() {
		
		System.out.println("Saç Tipi: "+getSacTipi()+"\nSaç Rengi: "+getSacRengi()+"\nGöz Rengi: "+getGozRengi());
		
	}
	
	
}

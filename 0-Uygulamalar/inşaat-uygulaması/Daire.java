package alistirma;

public class Daire {

	private YatakOdasi yatakOdasi;
	private OturmaOdasi oturmaOdasi;
	private Salon salon;
	private Mutfak mutfak;
	private Banyo banyo;
	private CocukOdasi cocukOdasi;
	private MisafirOdasi misafirOdasi;
	private Balkon balkon;
	
	
	
	
	public YatakOdasi getYatakOdasi() {
		return yatakOdasi;
	}

	public void setYatakOdasi(YatakOdasi yatakOdasi) {
		this.yatakOdasi = yatakOdasi;
	}

	public OturmaOdasi getOturmaOdasi() {
		return oturmaOdasi;
	}

	public void setOturmaOdasi(OturmaOdasi oturmaOdasi) {
		this.oturmaOdasi = oturmaOdasi;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public Mutfak getMutfak() {
		return mutfak;
	}

	public void setMutfak(Mutfak mutfak) {
		this.mutfak = mutfak;
	}

	public Banyo getBanyo() {
		return banyo;
	}

	public void setBanyo(Banyo banyo) {
		this.banyo = banyo;
	}

	public CocukOdasi getCocukOdasi() {
		return cocukOdasi;
	}

	public void setCocukOdasi(CocukOdasi cocukOdasi) {
		this.cocukOdasi = cocukOdasi;
	}

	public MisafirOdasi getMisafirOdasi() {
		return misafirOdasi;
	}

	public void setMisafirOdasi(MisafirOdasi misafirOdasi) {
		this.misafirOdasi = misafirOdasi;
	}

	public Balkon getBalkon() {
		return balkon;
	}

	public void setBalkon(Balkon balkon) {
		this.balkon = balkon;
	}

	public Daire(YatakOdasi yatakOdasi, OturmaOdasi oturmaOdasi, Salon salon, Mutfak mutfak, Banyo banyo) {
		
		System.out.println("2+1 Daire oluþturuldu.");
		this.yatakOdasi = yatakOdasi;
		this.oturmaOdasi = oturmaOdasi;
		this.salon = salon;
		this.mutfak = mutfak;
		this.banyo = banyo;
	}

	public Daire(YatakOdasi yatakOdasi, OturmaOdasi oturmaOdasi, Salon salon, Mutfak mutfak, Banyo banyo,Balkon balkon) {
		
		System.out.println("2+1 Daire oluþturuldu. Balkonu var.");
		this.yatakOdasi = yatakOdasi;
		this.oturmaOdasi = oturmaOdasi;
		this.salon = salon;
		this.mutfak = mutfak;
		this.banyo = banyo;
		this.balkon=balkon;
	}
	public Daire(YatakOdasi yatakOdasi, OturmaOdasi oturmaOdasi, Salon salon, Mutfak mutfak, Banyo banyo,
			CocukOdasi cocukOdasi) {
		
		System.out.println("3+1 daire oluþturuldu.");
		this.yatakOdasi = yatakOdasi;
		this.oturmaOdasi = oturmaOdasi;
		this.salon = salon;
		this.mutfak = mutfak;
		this.banyo = banyo;
		this.cocukOdasi = cocukOdasi;
	}
	public Daire(YatakOdasi yatakOdasi, OturmaOdasi oturmaOdasi, Salon salon, Mutfak mutfak, Banyo banyo,
			CocukOdasi cocukOdasi,Balkon balkon) {
		
		System.out.println("3+1 daire oluþturuldu. Balkonu var.");
		this.yatakOdasi = yatakOdasi;
		this.oturmaOdasi = oturmaOdasi;
		this.salon = salon;
		this.mutfak = mutfak;
		this.banyo = banyo;
		this.cocukOdasi = cocukOdasi;
		this.balkon=balkon;
	}
	public Daire(YatakOdasi yatakOdasi, OturmaOdasi oturmaOdasi, Salon salon, Mutfak mutfak, Banyo banyo,
			CocukOdasi cocukOdasi, MisafirOdasi misafirOdasi) {
		
		System.out.println("4+1 daire oluþturuldu.");
		
		this.yatakOdasi = yatakOdasi;
		this.oturmaOdasi = oturmaOdasi;
		this.salon = salon;
		this.mutfak = mutfak;
		this.banyo = banyo;
		this.cocukOdasi = cocukOdasi;
		this.misafirOdasi = misafirOdasi;
	}
	public Daire(YatakOdasi yatakOdasi, OturmaOdasi oturmaOdasi, Salon salon, Mutfak mutfak, Banyo banyo,
			CocukOdasi cocukOdasi, MisafirOdasi misafirOdasi,Balkon balkon) {
		
		System.out.println("4+1 daire oluþturuldu. Balkounu var");
		
		this.yatakOdasi = yatakOdasi;
		this.oturmaOdasi = oturmaOdasi;
		this.salon = salon;
		this.mutfak = mutfak;
		this.banyo = banyo;
		this.cocukOdasi = cocukOdasi;
		this.misafirOdasi = misafirOdasi;
		this.balkon=balkon;
	}
	
	
	
	
}

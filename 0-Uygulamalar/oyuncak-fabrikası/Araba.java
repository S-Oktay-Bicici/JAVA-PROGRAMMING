
public class Araba implements Arac{

	private int hiz;
	
	@Override
	public void hareketeGec() {
		System.out.println("Araba harekete geçti.");
		
	}

	@Override
	public void hizlan(int hiz) {
		this.hiz=hiz;
		System.out.println("Arabanýn hýzý"+hiz+" seviyesine getirildi.");
	}

}

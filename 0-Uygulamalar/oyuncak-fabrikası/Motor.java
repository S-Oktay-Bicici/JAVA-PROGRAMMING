
public class Motor implements Arac{

	private int hiz;
	
	@Override
	public void hareketeGec() {
		System.out.println("Motor harekete geçti.");
		
	}

	@Override
	public void hizlan(int hiz) {
		this.hiz=hiz;
		System.out.println("Motorun hýzý "+hiz+" seviyesine getirildi.");
		
	}

}

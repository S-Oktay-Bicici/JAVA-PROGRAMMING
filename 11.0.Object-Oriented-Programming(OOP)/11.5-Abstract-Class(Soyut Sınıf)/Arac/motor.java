

	public class Motor extends Arac{
		
		public Motor(int hiz, int vites){
			super(hiz, vites);
		}
		
		@Override
		void vitesAt(int vites){
			setVites(vites);
			
			System.out.println("Motorun vitesi: "+getVites()+"e atıldı.");
		}
		
		@Override 
		void hizArttir(int hiz){
			setHiz(hiz);
			
			System.out.println("Motorun hızı: "+getHiz()+"seviyesine çıkarıldı:");
		}
	}
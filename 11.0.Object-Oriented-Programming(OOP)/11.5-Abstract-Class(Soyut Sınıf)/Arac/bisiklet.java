

	
	public class Bisiklet extends Arac{
		
		public Bisiklet(int hiz, int vites){
			super(hiz, vites);
		}
		
		@Override
		void vitesAt(int vites){
			setVites(vites);
			
			System.out.println("Bisikletin vitesi: "+getVites()+"e atıldı.");
		}
		
		@Override 
		void hizArttir(int hiz){
			setHiz(hiz);
			
			System.out.println("Bisikletin hızı: "+getHiz()+"seviyesine çıkarıldı:");
		}
	}

		public class Helikopter implements Arac, HavaAracı{

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
			System.out.println("Helikopter vitesi "+vites+" e atıldı");
			
		}

		@Override
		public void hizArttir(int hiz) {
			this.hiz=hiz;
			System.out.println("Helikopter hızı "+hiz+" seviyesine çıkarıldı.");
		}
		
		public void ucus(){
			System.out.println("Kalkış ve imiş gerçekleşti");
		}
		
		public void bilgileriGoster() {
			System.out.println("Vites: "+vites+"\nHız: "+hiz);
		}

	}

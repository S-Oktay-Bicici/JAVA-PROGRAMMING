
	class Kitap{
		String kitapAdi;
		String yazarAdi;
		int sayfaSayisi;
		
		Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi){
			this.kitapAdi = kitapAdi;
			this.yazarAdi = yazarAdi;
			this.sayfaSayisi = sayfaSayisi;
		}
		
		@Override
		public String toString(){
			return kitapAdi+" v"+yazarAdi+" "+sayfaSayisi;
		}
	}
	
	
	public class Main{
		public static void main(String[] args){
			Kitap kitap1 = new Kitap("1984","George Orwell",450);
			
			System.out.println(kitap1);
		}
	}
			
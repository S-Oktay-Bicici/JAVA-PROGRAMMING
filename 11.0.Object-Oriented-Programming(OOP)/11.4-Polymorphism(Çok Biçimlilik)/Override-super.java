
	class Hayvan{
		public Hayvan(){
		}
		
		publlic void sesCikar(){
			System.out.println("Rrrr ....");
		}
	}
	
	class Kopek extends Hayvan{
		Kopek(){
		}
		
		@Override
		public void sesCikar(){
			//extends edilen bir üs sınıftaki fonksiyonu ifade eder
			super.sesCikar();
			
			System.out.println("Hav Hav ...");
		}
	}
	
	public class Main{
		public static void main(String[] args){
			
			Kopek k = new Kopek();
			
			k.sesCikar();
		]
	]
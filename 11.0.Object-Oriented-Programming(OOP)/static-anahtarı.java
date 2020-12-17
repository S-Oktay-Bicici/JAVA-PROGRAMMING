

	//oluşturdurduğumuz metod sınıfın genelini ilgilendiryorsa metod static
	//nesneleri ilgilendiriyorsa non-static olarak oluşturulacak
	class Ornek{
		static void A(){
			System.out.println("static method");
		}
		
		void B(){
			System.out.println("non static");
		}
	}
	
	public class Main{
		public static void main(String[] args){
			Ornek.A(); // hata vermeyecektir
			
			Ornek.B(); //hata verecektir
			
			Ornek orn1 = new Ornek();
			
			orn1.B(); //hata vermeyecektir
			
		}
	}
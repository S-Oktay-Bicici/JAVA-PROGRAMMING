public class Main{
	public static void main(String[] atgs){
		
		//burda Otomobil() olarak belirlenen constracter oluyor
		Otomobil oto1 = new Otomobil("BMW",2018);
		Otomobil oto2 = new Otomobil();
		
		oto2.marka = "Nissan";
		oto2.model = 2014;
		
		System.out.println(oto1.marka);
		System.out.println(oto2.marka);
		
	}
}
public class Otomobil{
	
	String marka;
	int model;
	
	/*constructor olarak adlandırdığımız alan burdaki fonksiyon oluyor
	- bu fonksiyon class ile aynı isimde olmak zorunda 
	*parametreli veya parametresiz olrak tanımlanabiliyor
	* herhangi bir tanımlama yapılmadığı takdirde kendisi otomatik olarak 
	*tanımlı olmuş oluyor*/
	
	public Otomobil(){
		
	}
	
	public Otomobil(String marka, int model){
		this.marka = marka;
		this.model = model;
	}
}
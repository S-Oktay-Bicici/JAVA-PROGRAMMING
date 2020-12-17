
public class MatematikOgretmeni extends Ogretmen {

	public MatematikOgretmeni(String isim, String soyisim, int yas) {
		super(isim, soyisim, yas);
	}

	@Override
	public void sinavYap() {
		System.out.println("Matematik öðretmeni sýnav yapmaya baþladý.");
	}
	
	public void quizYap() {
		System.out.println("Matematik öðretmeni quiz yapýyor.");
	}
	
	
}

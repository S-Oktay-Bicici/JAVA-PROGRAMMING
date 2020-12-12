package Java;

// kullanıcıdan veri almak eklediğimiz bir hazır kütüphane 
import java.util.Scanner;

public class import_kavramı {
	static void main(final String args[]) {
		// import anahtar kelimesi dahil etmek anlamına gelir
		// sınıfları dağil etmek için ve
		// doğrudan java tarafından tanımlı paketleri dahil etmek için

		final Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yaşınızı giriniz: ");
		final int yas = scanner.nextInt();
		System.out.println("Girilen yaş değeri = " + yas);
	}
}

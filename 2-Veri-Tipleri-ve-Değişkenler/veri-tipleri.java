package Java;

public class Main {

    public static void main(String[] args) {
        // int veri tipi ve ekrana yazdırma yöntemleri
        int numara = 10;
        System.out.println(numara);
        System.out.println("Numara " + numara);

        System.out.println("--------------------------");

        //long veri tipi
        long numara1 = 214783648;
        System.out.println(numara1);
        System.out.println("Numara " + numara1);
		System.out.println("Long alt sınır :"+Long.MAX_VALUE);
		System.out.println("Long ust sınır :"+Long.MIN_VALUE);
		System.out.println("Long ust sınır :"+Long.MIN_VALUE);

        System.out.println("--------------------------");

        //short veri tipi
        short numara2 = 32767;
        System.out.println(numara2);
        System.out.println("Numara " + numara2);
		System.out.println("Short alt sınır :"+Short.MAX_VALUE);
		System.out.println("Short ust sınır :"+Short.MIN_VALUE);

        System.out.println("--------------------------");

        //byte veri tipi
        byte numara3 = 127;
        System.out.println(numara3);
        System.out.println("Numara " + numara3);
		System.out.println("Byte alt sınır :"+Byte.MAX_VALUE);
		System.out.println("Byte ust sınır :"+Byte.MIN_VALUE); 

        System.out.println("--------------------------");

        //bool veri tipi
        boolean numara4 = true; // false
        System.out.println(numara4);
        System.out.println("Numara " + numara4);

        System.out.println("--------------------------");

        //char veri tipi
        char karakter = 'A';
        System.out.println(karakter);
        System.out.println("Karakter" + karakter);

        System.out.println("--------------------------");

        //string veri tipi
        String kelime = "sadık oktay biçici";
        System.out.println(kelime);
        System.out.println("ismim " + kelime);
		System.out.println("Integer alt sınır :"+Integer.MAX_VALUE);
		System.out.println("Integer ust sınır :"+Integer.MIN_VALUE);

        System.out.println("--------------------------");

        //double veri tipi
        double numara5 = 10.4;
        System.out.println(numara5);
        System.out.println("Numara " + numara5);
		System.out.println("Double alt sınır :"+Double.MAX_VALUE);
		System.out.println("Double ust sınır :"+Double.MIN_VALUE);
		
		//float veri tipi
        float numara5 = 10.4;
        System.out.println(numara5);
        System.out.println("Numara " + numara5);
		System.out.println("Float alt sınır :"+Float.MAX_VALUE);
		System.out.println("Float ust sınır :"+Float.MIN_VALUE);
    }
}

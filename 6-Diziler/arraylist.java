import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList<String> isimler=new ArrayList<String>();
		
		ArrayList<String> isimler2=new ArrayList<String>();
		
		isimler.add("Ümit");
		isimler.add("Taylan");
		isimler.add("Sinan");
		isimler.add("Orhan");
		isimler.add("Ahmet");
		isimler.add(1,"Emin");
		isimler.add(1,"Furkan");
		
		//isimler.remove(4);
		//isimler.remove("Ümit");
		
		
		//isimler.clear();
		
		isimler2.add("Ümit");
		isimler2.add("Orhan");
		isimler2.add("Ahmet");
		
		
		//isimler.removeAll(isimler2);
		
		//isimler.set(2, "Muhammed");
		
		Collections.sort(isimler);
		/*
		
		for(int i=0;i<isimler.size();i++) {
			System.out.println(isimler.get(i));
		}
		
		*/
		
		for(String isim:isimler) {
			System.out.println(isim);
		}
		
		
		
	}
}

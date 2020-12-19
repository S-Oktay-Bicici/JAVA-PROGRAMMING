import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
		//HastSet --> elemanlar karýþýk olarak dönüyor
		//TreeSet --> elemanlar küçükten büyüpðe sýralanmýþ dönüyor
		//LinkedHashSet --> girildiði sýra ile döndürüyor
		
		HashSet<Integer> sayilar=new HashSet<Integer>();
		
		sayilar.add(15);
		sayilar.add(14);
		sayilar.add(25);
		sayilar.add(98);
		sayilar.add(17);
		sayilar.add(28);
		sayilar.add(15);
		sayilar.add(25);
		sayilar.add(null);
		//sayilar.add(null);
		//sayilar.remove(15);
		//sayilar.clear();
		System.out.println("HashSet Elemanlarý: "+sayilar.toString());
		
		
		TreeSet<Integer> sayilar2=new TreeSet<Integer>();
		sayilar2.add(15);
		sayilar2.add(14);
		sayilar2.add(25);
		sayilar2.add(98);
		sayilar2.add(17);
		sayilar2.add(28);
		sayilar2.add(18);
		sayilar2.add(110);
		sayilar2.add(10);
		sayilar2.add(110);
		//sayilar2.add(null);
		
		
		System.out.println("TreeSet Elemanlarý: "+sayilar2.toString());
		
		LinkedHashSet<Integer> sayilar3=new LinkedHashSet<Integer>();
		
		sayilar3.add(15);
		sayilar3.add(14);
		sayilar3.add(25);
		sayilar3.add(98);
		sayilar3.add(17);
		sayilar3.add(28);
		sayilar3.add(18);
		sayilar3.add(110);
		sayilar3.add(10);
		sayilar3.add(110);
		sayilar3.add(null);
		System.out.println("LinkedHashSet Elemanlarý: "+sayilar3.toString());
		
	}
}



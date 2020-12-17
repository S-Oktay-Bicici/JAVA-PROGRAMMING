impoer java.util.ArrayList;

public class Main{
	public static void main(String[] argd){
		
		ArrayList<String> isimler =new ArrayList<String>();
		
		isimler.add("a");
		isimler.add("b");
		isimler.add("c");
		isimler.add("d");
		System.out.println(isimler);
		
		System.out.println(isimler.get(2));
		
		isimler.ser(2, "alo");
		System.out.println(isimler.get(2);
		
		isimler.remove(2);
		System.out.println(isimler);
		
		isimler.clear();
		System.out.println(isimler);
		
		System.out.println(isimler.size());
		
	}
}
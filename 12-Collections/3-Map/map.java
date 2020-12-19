package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		//HashMap
		//TreeMap
		//LinkedHashMap
		
		HashMap<String,String> ulkeler=new HashMap<String ,String>();
		
		
		ulkeler.put("TR","Türkiye");
		ulkeler.put("AZ", "Azerbaycan");
		ulkeler.put("KKTC","Kuzey Kýbrýs Türk Cumhuriyeti");
		ulkeler.put("TM", "Türkmenistan");
		
		//ulkeler.clear();
		
		//ulkeler.remove("TR");
		//ulkeler.remove("TM","Türkmenistan");
		
		//System.out.println(ulkeler.get("KKTC"));
		
		//System.out.println(ulkeler.keySet());
		//System.out.println(ulkeler.values());
		System.out.println("HashMap Elemanlarý: "+ulkeler);
		//System.out.println(ulkeler.size());
		
		//ulkeler.clear();
		//System.out.println(ulkeler.isEmpty());
		
		TreeMap<String,String> ulkeler2=new TreeMap<String ,String>();
		ulkeler2.put("TR", "Türkiye");
		ulkeler2.put("AZ","Azerbaycan");
		ulkeler2.put("KKTC", "Kuzey Kýbrýs Türk Cumhuriyeti");
		ulkeler2.put("TM", "Türkmenistan");
		
		System.out.println("TreeMap Elemanlarý: "+ulkeler2);
		
		LinkedHashMap<String, String> ulkeler3=new LinkedHashMap<String,String>();
		
		ulkeler3.put("TR", "Türkiye");
		ulkeler3.put("AZ","Azerbaycan");
		ulkeler3.put("KKTC", "Kuzey Kýbrýs Türk Cumhuriyeti");
		ulkeler3.put("TM", "Türkmenistan");
		
		System.out.println("LinkedHashMap Elemanlarý: "+ulkeler3);
		
	}
}

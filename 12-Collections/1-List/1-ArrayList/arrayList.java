import java.util.List;
import java.util.ArryList;

public class OrnArrayList{

/* 
	array.add("..."); --> ekleme
	array.remove(); --> belirtilen indexdeki elemanı siler
	array.remove("..."); --> verilen değeri siler
	array.clear(); --> tümünü siler
	array.size(); --> eleman sayısını verir
	array.get(,"..."); --> belrtilen indexdeki elemanı getirir 
	array.set(,"..."); --> belirtilen indexdeki elemanı belirtilen değer ile değiştirir 
	Collections.sort(arrayList); --> sbelirtilen list i sıralama yapar
*/
	
	public static void main(String[] args){
		
		List<String> array1 = new List<String>();
		
	//  ArrayList array2 = new ArrayList();
		ArrayList<String> array2 = new ArrayList<String>();
		
		array1.add("C");
		array1.add("C++");
		array1.add("Java");
		array.add("C#");
		array.add("Python");
		array.add("Ruby");
		
		System.out.println(array1);
		
		System.out.println("");
		
		for(String a:array1){
			System.out.println("Diller : "+a);
		}
		
		System.out.println("");
		
		array.remove(4);
		array.remove("Ruby");
		
		for(int i=0;i<array1.size();i++){
			System.out.println("Diller: "+i);
		}
	}
}
		
		
		

import java.util.LinkedList;
import java.util.ListIterator;

/*
next()-->Bir sonraki elemanı döndürür
prevous()-->Bir önceki elemanı döndürür
hasNext()-->Sonraki indexte eleman varsa true yoksa false değeri döndürür
hasPrevious()-->Önceki indexte eleman varsa true yoksa false değeri döndürür

 */
public class JavaKulubu{
    public static void main(String[] args){
		
        LinkedList<String> linked1 = new LinkedList();
		
		linked1.add("C");
		linked1.add("Java");
		linked1.add("C#");
		linked1.add("Pyhton");
		uyeleri_yazdir(linked1);		
    }
	
	
	public static void uyeleri_yazdir(LinkedList<String>linked1){
		ListIterator<String>a = linked1.listIterator();
		while(a.hasNext()){
            System.out.println("Üye-"+a.next());
        }
	}
    
}


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Islem {
    public static void main(String[] args) {
		
        LinkedList<String>l1=new LinkedList();
		
        l1.add("Zafer");
        l1.add("Miray");
        l1.add("Gül");
        l1.add("Ahmet");
		
        Collections.sort(l1);
		
        for(String s:l1){
            System.out.println("Değer:"+s);
         }
		 
        LinkedList<Integer>l2=new LinkedList();
		
        l2.add(7);
        l2.add(3);
        l2.add(4);
        l2.add(8);
		
        //Collections.sort(l2);
        Collections.sort(l2,new Siralama());
		
        System.out.println("");
		
        for(Integer s:l2){
            System.out.println("Değer-2:"+s);  
         }
	}
}

class Siralama implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
        
    }
    
}

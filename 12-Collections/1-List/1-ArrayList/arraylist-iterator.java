import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaKulubu {
    public static void main(String[] args) {
		
        ArrayList<String>arrayList1=new ArrayList<String>();
		
        arrayList1.add("Ali KAHRAMAN");
        arrayList1.add("Kazım TANYÜREK");
        arrayList1.add("Merve KARAKUM");
        arrayList1.add("Burak KUŞ");
		
        Iterator<String> i1=arrayList1.iterator();
            while(i1.hasNext()){
                System.out.println("Üye-"+i1.next());
            }
			
        System.out.println("");
        System.out.println("");
		
        ListIterator i2=arrayList1.listIterator();
            while(i2.hasNext()){
                Object o1=i2.next();
                i2.set(o1+"/");
                i1=arrayList1.iterator();
            }
            
            while(i1.hasNext()){
                System.out.println("Üye-"+i1.next());
            }
            
            System.out.println("");
            System.out.println("");
			
            while(i2.hasPrevious()){
                System.out.println("Üye-"+i2.previous());
            }
    }
}
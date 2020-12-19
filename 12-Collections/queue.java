
import java.util.LinkedList;
import java.util.Queue;

/*
offer()-->Eleman ekleme işlevini yerine getirir.Bu işlev başarılı olursa
"true" başarısız olursa "false" değeri döndürür.

add()---->Eleman ekleme işlevini yerine getirir.Elaman eklenmemesi durumunda 
Java tarafından hata fırlatılır ve program durur.

clear()-->Kuyruğa eklenen tüm verileri temizler.

size()---> Kuyrukta depolanan eleman sayısını verir.

remove()->Depolanan elamanı "first in first out" yapısına uygun olarak kuyruktan 
siler.Ancak kuyrukta herhangi bir eleman yoksa Java tarafından hata fırlatılır.

poll()--->Depolanan elemanı "first in first out" yapısına uygun olarak kuyruktan
siler.Kuyrukta herhangi bir eleman yoksa "null" değeri döner.

element()> Depolanan ilk elemanı döndürür.Herhangi bir eleman olmaması durumunda
Java tarafındna hata fırlatırlır.

peek()---> Depolanan ilk elemanı döndürür.Herhangi bir eleman olmaması durumunda 
"null" değeri döner.

isEmpty()->Kuyrukta eleman olup olmadığını kontrol eder.Eğer eleman bulunursa 
true;bulunmazsa false değeri döndürür.

*/
public class Islem {
    public static void main(String[] args) {
		
        Queue<String> q1=new LinkedList();
		
		q1.offer("a");
		q1.offer("b");
        q1.offer("c");
        q1.offer("d");
		
        System.out.println("q1 kuyruğunun boyu:"+q1.size());
        System.out.println("q1 kuyruğunda depolanan ilk eleman:"+q1.element());
		
        System.out.println("");
        System.out.println("");
		
        while(!q1.isEmpty()){
            System.out.println("q1 kuyruğundaki eleman siliniyor:"+q1.poll());
		}
		
        System.out.println("");
		
        System.out.println("Depolanan ilk veri:"+q1.peek());
        System.out.println("Depolanan ilk veri:"+q1.element());
        
    }
}


import java.util.Stack;

/*
push-->Eleman eklemek için kullanılır
peek-->Son eklenen elemanı döndürür.
pop--->Son eklenen elemanı döndürür ve siler.
remove->Stack içindeki elemanı siler
empyt-->Stack içinde eleman olup olmadığını kontrol eder.Eğer eleman varsa true; eleman yoksa "false" değeri döndürür.
*/
public class Islem {
    public static void main(String[] args) {
		
        Stack<String> s1=new Stack<String>();
		
        s1.push("a");
        s1.push("b");
        s1.push("c");
        s1.push("d");
		
        for(String s2:s1){
            System.out.println("Değer:"+s2);
        }
		
        System.out.println("");
        System.out.println("");
		
        System.out.println("Son depolanan eleman:"+s1.peek());
		
        System.out.println("");
        System.out.println("");
		
        System.out.println("Eleman çıkarıldı:"+s1.pop());
        for(String s2:s1){
			System.out.println("Değer:"+s2);
        }
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Eleman çıkarıldı:"+s1.pop());
		for(String s2:s1){
			System.out.println("Değer:"+s2);
        }
    }
}

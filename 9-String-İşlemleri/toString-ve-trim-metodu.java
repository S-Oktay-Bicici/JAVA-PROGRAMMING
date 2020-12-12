import java.util.ArrayList;

public class Class4 {
    public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(4);
		String s=list.toString();
        System.out.println("String'e dönüştürülen değer-1:"+s);
		Integer i=1923;
		String s2=i.toString();
        System.out.println("String'e dönüştürülen değer-2:"+s2);
		String s3=" Giriş";
        System.out.println("Trim metodu kullanılmadan çıktı:"+s3);
        System.out.println("Trim metodu kullanıldıktan sonra çıktı:"+s3.trim());
        
    }
}

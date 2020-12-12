/*
Index:Harflerin baştan dizimine veya sıra numaralarına denir.Her index sıfırdan 
başlar(java)
Stringlerde önemli metodlar:
String x="Java";
x bir değişken veya referans olmak üzere;
•Bir metinde kaç karakter oluduğunu yani String'in uzunluğunu bulma
--->x.length;

    •...ile başlıyor mu ?(java)
--->x.starsWith("...");true/false

    •...ile bitiyor mu ?
--->x.endsWith("...");true/false



•String'in index değerinin bulma
--->x.charAt(index);


•String içinde index arama
--->x.indexOf('...');


•String'in tüm değerlerinin büyük harfe çevrilme
-->x.toUpperCase();



•String'in tüm değerlerinin küçük harfe çevirmek
-->x.toLowerCase();""


•String değerinin int(Integer) değerine çevirmek
-->String a="sayıdeğeri" veya ->int b=Integer.parseInt(a) 

-int(Integer) değerinin String değerine çevrilmesi
-->int b=sayıdeğeri veya -->String a=String.valueOf(b); */

public class Class3 {
    public static void main(String[] args) {
		
		
		/*String a="String";
		String b="Sınıfında";
		String c="Metodlar";
        System.out.println(a+" "+b+" "+c);*/
		
		
		String x="String sınıfında metodlar";
        System.out.println("String'in uzunluğu:"+x.length());
        System.out.println("S harfi ile başlıyor mu ? "+x.startsWith("S"));
        System.out.println("A harfi ile başlıyor mu ? "+x.startsWith("A"));
        System.out.println("r harfi ile bitiyor mu ? "+x.endsWith("r"));
        System.out.println("k harfi ile bitiyor mu ? "+x.endsWith("k"));
        System.out.println("x'te depolanan değerin 1.index'teki karşılığı:"+x.charAt(1));
        System.out.println("t harfi baştan kaçıncı index ? "+x.indexOf('t'));
        System.out.println("Küçük harfler büyük harfelere dönüştü-->"+x.toUpperCase());
        System.out.println("Büyük harfler küçük harfelere dönüştü-->"+x.toLowerCase());
       
    }
}

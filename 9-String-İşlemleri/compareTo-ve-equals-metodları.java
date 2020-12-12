public class Str {
    public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		String s3="Kotlin";
		
		int sonuc=s1.compareTo(s2);
		int sonuc2=s2.compareTo(s3);
        System.out.println(sonuc);
        System.out.println(sonuc2);
		
		String m1="Kullanıcı A";
		String m2="Kullanıcı A";
		boolean cikti= m1.equals(m2);
        System.out.println("m1 ve m2 denk mi ? "+cikti);
		
		String m3="Parola A";
		String m4="Parola B";
		boolean cikti2=m3.equals(m4);
        System.out.println("m3 ve m4 denk mi ? "+cikti2);
    }
}

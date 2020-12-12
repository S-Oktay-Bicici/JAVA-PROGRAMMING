public class Class6 {
    public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("StringBuffer,String sınıfına alternatif olarak oluşturulmuştur.");
		s1.delete(0, 13);
        System.out.println("Son durumda s1:"+s1);
		
		
		StringBuilder s2=new StringBuilder("StringBuilder,String sınıfına alternatif olarak geliştirilmiş");
		s2.append(" bir sınıftır.");
        System.out.println("Son durumda s2:"+s2);
	}
}

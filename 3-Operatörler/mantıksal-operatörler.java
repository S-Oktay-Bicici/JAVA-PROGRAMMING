public class Mantiksal {
/*
Mantıksal Operatörler
!--->not(değil) Operatörü
&&-->and(ve) Operatörü   
||-->or(veya)Operatörü    
    */
public static void main(String[] args) {
	boolean a=true;
    System.out.println("İşlem sonucu:"+!a);
	
	int x=5;    
	int y=6;
	int z=7;
	int k=8;
	
    System.out.println((x<y)&&(z>k));
    System.out.println((x<y)||(z>k));
    System.out.println((8==9 && 8!=9) || (10>9 && 14>=14));   
 
    
}
}

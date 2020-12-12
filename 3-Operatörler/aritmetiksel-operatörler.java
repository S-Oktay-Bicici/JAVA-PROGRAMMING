/* 
+ -->Toplama Operatörü
- -->Çıkarma Operatörü
* -->Çarpma Operatörü
/ -->Bölme Operatörü
% -->Kalan Operatörü
*/
public class Operator {
        public static void main(String[] args) {
    int a=12;
    int b=6;
    int c=3;
    System.out.println("(a+b+c)="+(a+b+c));
    System.out.println("(a-b)+(c)="+((a-b)+c));
	
	
    int x=8;
    int y=9;
    System.out.println("(a*b)="+(a*b));
			
			
    int m=4;
    int n=2;
    System.out.println("m/n="+(m/n));
			
			
    double k=5;
    int    l=2;
    System.out.println("k/l="+(k/l));
			
			
    int aa=5;
    int bb=2;
    System.out.println("aa/bb="+(aa/bb));
			
			
    double pp=10;
    double ll=4;
    System.out.println("10'un 4'e bölümünden kalan değer="+(pp%ll));
    }
    
}

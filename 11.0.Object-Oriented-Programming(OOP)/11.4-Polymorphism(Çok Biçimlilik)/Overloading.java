
public class Main{
	
	static int topla(int a, int b){return a+b;}
	
	@Overloading
	static int topla(int a, int b,int c){return a+b+c;}
	
	@Overloading
	static double topla(double a, double b){return a+b;}
	
	public static void main(String[] args){
		
		System.out.println(topla(3,5));
		
		System.out.println(topla(3,5,6));
		
		System.out.println(topla(3.4,5));
		
		System.out.println(topla(3,5.5));
		
		
	}
}
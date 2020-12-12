public class KosulluYapi {
    public static void main(String[] args) {
		
		byte x=2;
		byte y=3;
		if(x<y){
			System.out.println(x+" sayısı "+y+" sayısından küçüktür.");        
		}
		else {
			System.out.println(x+" sayısı "+y+" sayısından büyüktür.");   
		}    
	
	
		int k=5;
		int m=6;
		if(k>m){
			System.out.println(k+" sayısı "+m+" sayısından büyüktür.");
		}
		else {
			System.out.println(k+" sayısı "+m+" sayısından küçüktür.");
		}
		
		int a=3;
		if(a==4){
			System.out.println("a sayısı 4'e eşittir.");
		}
		else if(a==2){
			System.out.println("a sayısı 2'ye eşittir."); 
		}
		else if(a==3){
			System.out.println("a sayısı 3'e eşittir."); 
		}
		else {
			System.out.println("Hiçbir koşul sağlanmadı.");
		}
    
    }
}

public class Dongu {
public static void main(String[] args) {
	
	for(int i=0;i<6;i++){
        System.out.println("i="+i);    
    }
	
	for(int x=0,y=0;x<10;x++,y++){
		x+=y;
        System.out.println("x değeri:"+x+" y değeri:"+y); 
	}
	
    System.out.println("");
	
	for(int a=0,b=0;a<20&&b<6;a++,b++){
		a*=b;
        System.out.println("a değeri:"+a+" b değeri:"+b);
    } 
	
    System.out.println("");
	
    for(int a=0,b=0;a<20||b<6;a++,b++){
		a*=b;
        System.out.println("a değeri:"+a+" b değeri:"+b);
          
    }

	}
}

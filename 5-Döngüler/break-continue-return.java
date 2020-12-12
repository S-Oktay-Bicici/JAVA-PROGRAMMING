public class Anahtar {
 public static void main(String[] args) {
	 
    for(int i=10;i>0;i--){
        if(i==5){
			break;
        }
        System.out.println("i:"+i);
    }
	
     System.out.println("");
	 
     System.out.println("");
     
    for(int i2=10;i2>0;i2--){
        if(i2==5){
            continue;
        }
        System.out.println("i2:"+i2);  
    }
	
     System.out.println("");
	 
     System.out.println("");
	 
     
	 
	for(int a=0;a<10;a++){
        System.out.println("a:"+a);
        if(a==5){
			return;
        }
     }
	 
     System.out.println("Buradaki kodlar çalışmaz");
 
 }
}

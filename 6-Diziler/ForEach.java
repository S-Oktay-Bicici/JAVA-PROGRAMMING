import java.util.Arrays;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
		byte [] b={5,2,5,1,2,4};
		for(byte k:b){
			System.out.println("Döngü değerleri="+k);
		}
 
        System.out.println("");
        System.out.println("");
		
        String [] c={"dd","aa","kk","mm"};
        Arrays.sort(c);
        for(String dd:c){
            System.out.println("String dizisinde depolanan değerler="+dd);   
        }
		
        System.out.println("");
        System.out.println("");
		
		int [] f=new int[6];
		for(int i=0;i<f.length;i++){
			Random random=new Random();
            Integer rand=random.nextInt(16);
            f[i]=rand;           
		}
		for(Integer nn:f){
            System.out.println("Sonuç:"+nn);
        }
    }
}

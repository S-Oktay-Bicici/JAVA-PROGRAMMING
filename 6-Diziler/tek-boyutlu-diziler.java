
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
		int [] a=new int[10];
		int []d1;
        d1=new int[4];
        d1[0]=2;
        d1[1]=4;
        d1[2]=6;
        d1[3]=3;
		
		int []d2={2,4,6,12};
        System.out.println("d2 dizisinin 0.indexi="+d2[0]);  
		
		int [] b=new int[6];
        System.out.println("b dizinin boyu="+b.length);
		
        System.out.println("");
        System.out.println("");
		
		int [] k1={6,2,4};
		String [] k2={"Gül","Mehmet","Kemal"};
		Arrays.sort(k1);
		Arrays.sort(k2);
		
        System.out.println("");
        System.out.println("");
		
        System.out.println("k1 0.index-->"+k1[0]);
        System.out.println("k1 1.index-->"+k1[1]);
        System.out.println("k1 2.index-->"+k1[2]);
		
        System.out.println("");
        System.out.println("");
		
        System.out.println("k2 0.index-->"+k2[0]);
        System.out.println("k2 1.index-->"+k2[1]);
        System.out.println("k2 2.index-->"+k2[2]);
		
		int [] m1={1,4,13};
		int [] m2={1,4,13};
		if(Arrays.equals(m1, m2)){
			System.out.println("Bu diziler birbirine eşittir");
		}
		else {
        System.out.println("Bu diziler birbirine eşit değildir");
		}
    }
}

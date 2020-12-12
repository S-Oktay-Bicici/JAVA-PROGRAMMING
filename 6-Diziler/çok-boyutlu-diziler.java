
import java.util.Random;

public class Array {
    public static void main(String[] args) {
		int [][] ikiBoyutlu= new int [2][2];
		
		ikiBoyutlu [0][0]=5;
		ikiBoyutlu [0][1]=3;
		ikiBoyutlu [1][0]=2;
		ikiBoyutlu [1][1]=7;
		
        int [] [] a=new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				Random random=new Random();
                int rDegeleri=random.nextInt(10);
				dortBoyutlu[i][j]=rDegeleri;
			}	   
		}
		
		for(int i2=0;i2<4;i2++){
			for(int j2=0;j2<4;j2++){
				System.out.print(dortBoyutlu[i2][j2]+" ");
			}
			System.out.println(""); 
		}
		
        System.out.println("");
        System.out.println("");
  
		for(int i2=0;i2<2;i2++){
			for(int j2=0;j2<2;j2++){
				System.out.print(ikiBoyutlu[i2][j2]+" ");
			}
			System.out.println(""); 
		}
	}
}


import java.util.Random;

public class Array { 
    public static void main(String[] args) {
        int sayilar[]= new int[5];
            for(int i=0;i<sayilar.length;i++){
                Random random=new Random(); 
                int a =random.nextInt(1000);
                sayilar[i]=a;
            }
			
            for(int k:sayilar){
                System.out.println("Değerler: "+k);
            }
			
            int ekucuk;
            int ebuyuk;
            ekucuk=sayilar[0];
            ebuyuk=sayilar[0];
			
            for(int i=1;i<sayilar.length;i++){
                if(sayilar[i]<ekucuk){
                    ekucuk=sayilar[i]; 
                }
                if(sayilar[i]>ebuyuk){
                    ebuyuk=sayilar[i];
                } 
            }
			
            System.out.println("5 sayı arasından en küçük sayı:"+ekucuk);
            System.out.println("5 sayı arasından en büyük sayı:"+ebuyuk);
	}
}


import java.util.PriorityQueue;
import java.util.Queue;

public class Islem {
    public static void main(String[] args) {
		
        Queue<String> q1=new PriorityQueue<>();
		
        q1.offer("d");
        q1.offer("b");
        q1.offer("a");
        q1.offer("c");
		
        for(int i=0;i<4;i++){
            System.out.println("Veri siliniyor:"+q1.poll());      
        }
		
        Queue<Integer> q2=new PriorityQueue<>();
		
        q2.offer(44);
        q2.offer(34);
        q2.offer(45);
         q2.offer(12);
		 
        System.out.println("");
		
        for(int i=0;i<4;i++){
             System.out.println("Veri siliniyor:"+q2.poll());
        }
		
        PriorityQueue<Integer> q3=new PriorityQueue<>();
		
        q3.offer(6);
        q3.offer(5);
        q3.offer(4);
        q3.offer(3);
		
        System.out.println("");
		
        System.out.println("8 sayısı q3 içinde depolandı mı ? "+q3.contains(8));
        System.out.println("3 sayısı q3 içinde depolandı mı ? "+q3.contains(3));
    }    
}

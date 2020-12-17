
	class Yonetici{
		public void maasGoster(){System.out.println(10000);}
	}
	class Calisan extends Yonetici{
		@Override
		public void maasGoster(){System.out.println(5000);}
	}
	
	public class Main{
		public static void main(String[] args){
			
			Yonetici y = new Yonetici();
			Calisan c = new Calisan();
			
			y.maasGoster();
			c.maasGoster();
		}
	}
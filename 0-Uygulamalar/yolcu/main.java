public class Calistir {
    public static void main(String[] args) {
		Yolcu o=new Yolcu("Ali KAHRAMAN", "MÜLKİYE");
		Yolcu o2=new Yolcu("Mehtap YURT", "KIZILAY");
		Yolcu o3=new Yolcu("Ceyda GÜNEŞ", "KÖPRÜ");
        Yolcu o4=new Yolcu("Necati KAYA", "ÇEŞME");

		o.cikti();
		o2.cikti();
		o3.cikti();
		o4.cikti();
		
        System.out.println("Otobüsteki yolcu sayısı="+Yolcu.getYolcu_sayisi());
        
}
}
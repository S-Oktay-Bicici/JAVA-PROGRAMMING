package oop_interface;

public class Main {
	public static void main(String[] args) {
		
		Motor motor=new Motor();
		
		motor.hizArttir(100);
		
		//System.out.println(motor.getHiz());
		
		motor.vitesAt(4);
		
		motor.bilgileriGoster();
		
		
		Bisiklet bisiklet=new Bisiklet();
		
		bisiklet.vitesAt(6);
		bisiklet.hizArttir(40);
		
		Arac arac=new Bisiklet();
		
		vitesArttýr(10,bisiklet);
		
	}
	
	public static void vitesArttýr(int sayi,Arac arac) {
		arac.vitesAt(sayi);
	}
	
}

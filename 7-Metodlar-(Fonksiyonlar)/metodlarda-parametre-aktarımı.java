public class Parametre {
    static void yazdir(int x,int y){
        System.out.println("Parametre x'in ilk değeri-->"+x+" Parametre y'nin ilk değeri-->"+y);
		x=5;
		y=4;
		System.out.println("Parametre x'in ikinci değeri-->"+x+" Parametre y'nin ikinci değeri-->"+y);
    }
	
    public static void main(String[] args) {
		int a=2;
		int b=3;
        System.out.println("Değişken a'nın ilk değeri="+a+" Değişken b'nin ilk değeri="+b);
        yazdir(a, b);
        System.out.println("Değişken a'nın ikinci değeri="+a+" Değişken b'nin ikinci değeri="+b);   
	}
}

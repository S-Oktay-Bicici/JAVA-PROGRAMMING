public class Kopyalama {
    public static void main(String[] args) {
        byte [] a;
        byte [] b;
        a=new byte[]{4,5,7};
        b=a;
        diziyi_bastir(b);
}
        static void diziyi_bastir(byte [] b){
            for(byte i:b){
                System.out.println("Dizideki değerler:"+i);
            }
        }
}

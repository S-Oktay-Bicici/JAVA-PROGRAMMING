import java.util.Scanner;

public class Kosul {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.print("1,2 veya 3 numaralı işlemlerden birisini seçiniz:");
        int islem=scanner.nextInt();
		switch(islem){
			case 1:
				System.out.println("Kullanıcı tarafından 1 numaralı işlem seçildi.");
			break;
			case 2:
				System.out.println("Kullanıcı tarafından 2 numaralı işlem seçildi.");
			break;
			case 3:
				System.out.println("Kullanıcı tarafından 3 numaralı işlem seçildi.");
			break;
			default:
				System.out.println("1,2 ve 3 numaralı işlemlerden herhangi birisi seçilmedi.");
		}
    }
}

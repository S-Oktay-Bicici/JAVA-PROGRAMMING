import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //createFile();
        //getFileInfo();



    }

    //dosya oluşturma
    public static void createFile(){
        File file = new File("hello-world.txt");

        try{
            if(file.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }else {
                System.out.println("Dosya zaten mevcut.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("hello-world.txt");

        if(file.exists()){
            //dosya ismini veriyor
            System.out.println("Dosya adı: "+ file.getName());

            //dosyanın yolunu veriyor
            System.out.println("Dosya yolu: "+ file.getAbsolutePath());

            //dosya yazılabilri mi
            System.out.println("Dosya yazılabilit mi: "+ file.canWrite());

            //dosya okubabilir mi
            System.out.println("Dosya okunabilir mi: "+ file.canRead());

            //dosya boyutu
            System.out.println("Dosya boyutu: "+ file.length());
        }
    }

    //dosya okuma
    public static void readFile(){
        File file = new File("hello-world.txt");

        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //dosua yazam
    public static void writeFile(){
        try {
            FileWriter writer = new FileWriter("hello-world.txt");
            writer.write("oktaybcici");
            System.out.println("Dosyaya yazdırıldı.");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

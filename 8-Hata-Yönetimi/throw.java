import javax.swing.*;
import java.util.Scanner;

public class hata{
	public static void main(String[] args){
		String username;
		String parola;
		
		username =JOptionPane.showInputDialog(null,"Kulllanıcı Adı: ");
		parola = JOptionPane.showInputDialog(null,"Parola: ");
		
		if(username.lenght()<8){
			throw new SecurityException("Kulllanıcı Adı en az 8 karakter olmalı.");
		}
	}
}
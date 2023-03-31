package freiwillige_uebungen;
import java.util.Scanner;

public class uebung2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char [] chars = new char[10];
		char I = 'I';
		
		for(int i = 0; i<input.length(); i++) {
			char currentChar = input.charAt(i);
			if(input == "Hallo") {
				System.out.println("correct!");
			}
			else {
				System.out.println("Invalid Input!");
			}

		}
	}

}

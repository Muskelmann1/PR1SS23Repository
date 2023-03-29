package pflichtuebung1;
import java.util.Scanner;

public class Summe {

	public static void main(String[] args) {
		
		// Benötigte Variablen deklarieren
		int sum = 0;
		int input = 0;
		
		// Für die Eingabe von der Tastatur
		Scanner sc = new Scanner(System.in);
		
		// Eingabe der ersten Zahl der Addition
		System.out.println("Geben sie die erste ganze Zahl ein:");
		input = sc.nextInt();
		
		// Berechnungsschleife die durch die Eingabe von einer negativen Zahl verlassen wird
		while(input>= 0) {
				//Eingabe wird zur Summe addiert
				sum+=input;
				// Für die Eingabe der nächsten Zahl von der Tastatur
				System.out.println("Geben sie die nächste Zahl ein:");
				input = sc.nextInt();
			}
		
		// Ausgabe der Summe
		System.out.println("Das Ergebnis der Addition ist:" + sum);
		sc.close();
		}
	}

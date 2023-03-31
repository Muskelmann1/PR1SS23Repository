package pflichtuebung1;
import java.util.Scanner;

public class Summe {

	public static void main(String[] args) {
		
		// Benötigte Variablen deklarieren
		int sum = 0;
		int input = 0;
		int counter = 0;
		
		// Für die Eingabe von der Tastatur
		Scanner sc = new Scanner(System.in);
		
		// Anleitung
		System.out.println("Beenden der Eingabe durch eine negative Zahl, nur ganze Zahlen sind als Eingabe möglich und nur gerade Zahlen werden zur Summe addiert.");
		// Eingabe der ersten Zahl der Addition
		System.out.println("Geben sie die erste ganze Zahl ein:");
		input = sc.nextInt();
		
		// Berechnungsschleife die durch die Eingabe von einer negativen Zahl verlassen wird
		while(input>= 0) {
			//
			counter++;
			//Überprüfung ob die eingegebene Zahl gerade ist
			if(input%2 == 0) {
				//Eingabe wird zur Summe addiert
				sum+=input;
			}
				// Für die Eingabe der nächsten Zahl von der Tastatur
				System.out.println("Geben sie die nächste ganze Zahl ein Zahl ein:");
				input = sc.nextInt();
			}
		
		// Ausgabe der Summe und der Anzahl der eingegebenen positiven Zahlen
		System.out.println("Das Ergebnis der Addition ist: " + sum);
		System.out.println("Insgesamt wurden " + counter + " positive Zahlen eingegeben");
		sc.close();
		}
	}

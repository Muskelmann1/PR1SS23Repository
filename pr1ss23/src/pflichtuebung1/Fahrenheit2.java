package pflichtuebung1;

import java.util.Scanner;

public class Fahrenheit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Benötigte Variablen deklarieren
				double epsilon = 0.005;
				double f = 0.0, c;
				double exit = 0.0;
				
				// Für die Eingabe von der Tastatur
				Scanner in = new Scanner(System.in);
				
				// Berechnungsschleife
					do {
						// Anleitung
						System.out.println("Programm endet durch Eingabe von 1");
						System.out.println("Eingabe der Fahrenheit-Temperatur: ");
						// Eingabe, Double-Wert einlesen
						f = in.nextDouble();
						// Umrechnen in Celsius
						c = (f -32)*5.0/9.0;
						// Ausgabe des Ergebnis
						System.out.println("... in Celsius: " + c + " Grad \n");
						
						//exit = f-1;
						
						// Schleife durch Eingabe von 0 verlassen?
						} while (Math.abs(f-1) > epsilon);
					
						System.out.println("... und tschüss");
						in.close();
			}

		}


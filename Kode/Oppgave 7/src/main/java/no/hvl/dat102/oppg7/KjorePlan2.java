package no.hvl.dat102.oppg7;

import java.util.Scanner;

import no.hvl.dat102.oppg7.OrdnetListe.KjedetOrdnetListe;

// Algoritmen implementert med ordnet liste
public class KjorePlan2 {

	public static void main(String[] args) {
		// Tømmer konsollvindu
		System.out.print("\033[H\033[2J");
		System.out.flush();

		// Initialiserer Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv inn filnavn");
		System.out.print("> ");
		String filnavn = sc.nextLine();

		System.out.println("Kjøring med kø");

		// 1 | Opprett Jobbsamling og les en fil inn i køen
		Jobbsamling<Jobb, KjedetOrdnetListe<Jobb>> samling = new Jobbsamling<Jobb, KjedetOrdnetListe<Jobb>>();

		System.out.println("Leser inn CPU-jobber fra fil");
		samling.lesFraFil(filnavn);


		sc.close();
		System.exit(0);
	}
}

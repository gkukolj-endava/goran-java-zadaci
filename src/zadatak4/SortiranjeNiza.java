package zadatak4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK4: Za uneti niz celih brojeva duzine n (koja se takodje
 *         unosi), sortirati niz, ispitati da li sadrzi broj x, i ispisati prvih
 *         5 clanova niza na standardni izlaz.
 */
public class SortiranjeNiza {

	private static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		// inicijalizujemo niz i dodeljujemo mu velicinu pozivom metode za unos velicine
		// od korisnika
		int[] niz = new int[unosBrojaZaVelicinuNiza()];

		// kroz petlju dodajemo clanove u niz
		for (int brojac = 0; brojac < niz.length; brojac++) {
			System.out.println("Unesite " + (brojac + 1) + ". broj niza: ");
			niz[brojac] = unosBroja();
		}

		// sortiramo niz
		Arrays.sort(niz);

		// pozivamo metodu za proveru broja u nizu
		proveraBrojaUNizu(niz);

		// pozivamo metodu da nam ispise prvih 5 clanova niza
		ispisiNiz(niz);

		// zatvaramo skener
		unos.close();
	}

	// metod za unos broja od strane korisnika
	private static int unosBroja() {
		while (!unos.hasNextInt()) {
			unos.next();
			System.out.println("Unesite ceo broj, a ne karakter ili decimalni broj");
		}
		return unos.nextInt();
	}

	// metoda za proveru broja u nizu
	private static void proveraBrojaUNizu(int[] niz) {
		// dodeljujemo broj koji korisnik unese varijabli za proveru
		System.out.println("Unesite broj koji hocete da proverite da li se nalazi u nizu");
		int brojZaProveru = unosBroja();

		boolean sadrzi = false;
		// proveravamo da li se broj nalazi u nizu
		for (int brojac : niz) {
			if (brojac == brojZaProveru)
				sadrzi = true;
		}

		// ispisujemo poruku da li niz sadrzi ili ne sadrzi broj
		if (sadrzi) {
			System.out.println("Niz sadrzi broj " + brojZaProveru);
		} else
			System.out.println("Niz ne sadrzi broj " + brojZaProveru);
	}

	// metoda za ispis prvih 5 clanova niza
	private static void ispisiNiz(int[] niz) {
		System.out.print("Prvih pet clanova niza su: ");
		for (int brojac = 0; brojac < 5; brojac++) {
			System.out.print(niz[brojac] + " ");
		}
	}

	// upit za korisnika da unese broj za velicinu niza i vracamo taj broj
	private static int unosBrojaZaVelicinuNiza() {
		boolean dobarUnos = false;
		int velicinaNiza = 0;
		while (!dobarUnos) {
			System.out.println("Unesite broj za velicinu niza, da nije manji od 5: ");
			velicinaNiza = unosBroja();
			if (velicinaNiza >= 5) {
				dobarUnos = true;
			}
		}
		return velicinaNiza;
	}
}

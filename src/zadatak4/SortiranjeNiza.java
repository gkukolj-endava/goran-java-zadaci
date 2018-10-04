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

		// kreiramo random objekat da bi kreirali random brojeve
		boolean sadrzi = false;

		// upit za korisnika da unese broj i cuvamo taj broj u varijabli
		System.out.println("Unesite broj za velicinu niza: ");
		int velicinaNiza = Math.abs(unosBroja());

		// inicijalizujemo niz
		int[] niz = new int[velicinaNiza];

		// kroz petlju dodajemo random clanove u niz
		for (int brojac = 0; brojac < niz.length; brojac++) {
			System.out.println("Unesite broj niza: ");
			niz[brojac] = unosBroja();
		}

		// sortiramo niz
		Arrays.sort(niz);

		// dodeljujemo broj koji korisnik unese varijabli za proveru
		System.out.println("Unesite broj koji hocete da proverite da li se nalazi u nizu");
		int brojZaProveru = unosBroja();

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

		// ispisujemo prvih 5 clanova niza, ako je niz manji onda samo koliko ima
		// clanova
		if (velicinaNiza > 4) {
			for (int brojac = 0; brojac < 5; brojac++) {
				System.out.print(niz[brojac] + " ");
			}
		} else
			for (int brojac = 0; brojac < niz.length; brojac++) {
				System.out.print(niz[brojac] + " ");
			}
		unos.close();
	}

	// metod za unos broja od strane korisnika
	private static int unosBroja() {
		while (!unos.hasNextInt()) {
			unos.next();
			System.out.println("Unesite ceo broj, a ne karakter ili decimalni broj");
		}
		int unosKorisnika = unos.nextInt();

		return unosKorisnika;
	}

}

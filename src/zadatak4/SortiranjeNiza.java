package zadatak4;

import java.util.Arrays;
import java.util.Random;
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

	public static void main(String[] args) {

		// kreiramo random objekat da bi kreirali random brojeve
		Random random = new Random();
		boolean sadrzi = false;

		// upit za korisnika da unese broj i cuvamo taj broj u varijabli
		System.out.println("Unesite broj za velicinu niza: ");
		int velicinaNiza = unosBroja();

		// inicijalizujemo niz
		int[] niz = new int[velicinaNiza];

		// kroz petlju dodajemo random clanove u niz
		for (int brojac = 0; brojac < niz.length; brojac++) {
			niz[brojac] = random.nextInt(100);
		}

		// sortiramo niz
		Arrays.sort(niz);

		// proveravamo da li sadrzi u ovom slucaju broj 16
		for (int brojac : niz) {
			if (brojac == 16)
				sadrzi = true;
		}

		// ispisujemo poruku da li niz sadrzi ili ne sadrzi broj
		if (sadrzi) {
			System.out.println("Niz sadrzi broj 16");
		} else
			System.out.println("Niz ne sadrzi broj 16");

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

	}

	// metod za unos broja od strane korisnika
	public static int unosBroja() {
		Scanner unos = new Scanner(System.in);
		while (!unos.hasNextInt()) {
			unos.next();
			System.out.println("Unesite ceo broj...");
		}
		int unosKorisnika = unos.nextInt();

		unos.close();
		return unosKorisnika;
	}

}

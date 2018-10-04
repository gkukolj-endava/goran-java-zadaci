package zadatak3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK3: Napisati program koji ce predstavljati jednostavan
 *         digitron. Program treba da radi tako sto korisnik unese dva cela
 *         broja, zatim kod operacije koju zeli da izvrsi (‘s’ – sabiranje, ‘o’
 *         – oduzimanje, ‘m’ – mnozenje, ‘d’ – deljenje). Kao rezultat se
 *         ocekuje ispisivanje rezultata te operacije nad unetim operandima. Sve
 *         operacije smestiti u posebne metode. Vrteti se u petlji, sve dok se
 *         za kod operacije ne unese nepostojeci kod.
 */
public class Digitron {

	private static Scanner unos;

	public static void main(String[] args) {

		unos = new Scanner(System.in);

		// korisnik unosi prvi broj i dodeljujemo varijabli prvi broj
		System.out.println("Unesite prvi broj: ");
		long prviBroj = unosBroja();

		// korisnik unosi drugi broj i dodeljujemo varijabli drugi broj
		System.out.println("Unesite drugi broj: ");
		long drugiBroj = unosBroja();

		// korisnik unosi karakter kao opciju i dodeljujemo je varijabli
		System.out.println("unesite s za sabiranje,ili o za oduzimanje,ili m za mnozenje,ili d za deljenje");
		String operacija = unosKaraktera();

		// petlja koja se ponavlja dok korisnik ne unese karakter razlicit od s,o,m,d
		do {
			switch (operacija) {
			case "s":
				System.out.println("Rezultat sabiranja je: " + sabiranje(prviBroj, drugiBroj));
				break;
			case "o":
				System.out.println("Rezultat oduzimanja je: " + oduzimanje(prviBroj, drugiBroj));
				break;
			case "m":
				System.out.println("Rezultat mnozenja je: " + mnozenje(prviBroj, drugiBroj));
				break;
			case "d":
				if (drugiBroj == 0) {
					System.out.println("Ne moze se deliti sa nulom");
					break;
				} else
					System.out.println("Rezultat deljenja je: " + deljenje(prviBroj, drugiBroj));
				break;
			}
			// ponovo dajemo mogucnost korisniku za izbor opcije da bi mogao da izadje iz
			// petlje
			System.out.println("izaberite ponovo s, o, m ili d, za izlaz unesite neki drugi karakter");
			operacija = unosKaraktera();
		} while (operacija.matches("^[somd]$"));

		System.out.println("Hvala sto ste koristili program");
		unos.close();
	}

	// metod za unos broja od strane korisnika
	private static long unosBroja() {
		long unetiBroj = 0;
		while (!unos.hasNextLong()) {
			unos.next();
			System.out.println("Morate da unesete broj, a ne karakter");
		}
		try {
			unetiBroj = unos.nextLong();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		return unetiBroj;
	}

	// metod za unos operacije od strane korisnika
	private static String unosKaraktera() {
		while (!unos.hasNext()) {
			unos.next();
			System.out.println("Unesite samo jedan karakter...");
		}
		String unetiKarakter = unos.next();
		return unetiKarakter;
	}

	// metod za sabiranje
	private static long sabiranje(long prviBroj, long drugiBroj) {
		return prviBroj + drugiBroj;
	}

	// metod za oduzimanje
	private static long oduzimanje(long prviBroj, long drugiBroj) {
		return prviBroj - drugiBroj;
	}

	// metod za mnozenje
	private static long mnozenje(long prviBroj, long drugiBroj) {
		return prviBroj * drugiBroj;
	}

	// metod za deljenje
	private static double deljenje(long prviBroj, long drugiBroj) {
		return prviBroj / drugiBroj;
	}
}

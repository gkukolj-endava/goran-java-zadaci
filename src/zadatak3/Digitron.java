package zadatak3;

import java.util.Scanner;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK3: Napisati program koji ce predstavljati jednostavan
 *         digitron. Program treba da radi tako sto korisnik unese dva cela
 *         broja, zatim kod operacije koju zeli da izvrsi (�s� � sabiranje, �o�
 *         � oduzimanje, �m� � mnozenje, �d� � deljenje). Kao rezultat se
 *         ocekuje ispisivanje rezultata te operacije nad unetim operandima. Sve
 *         operacije smestiti u posebne metode. Vrteti se u petlji, sve dok se
 *         za kod operacije ne unese nepostojeci kod.
 */
public class Digitron {

	private static Scanner unos;

	public static void main(String[] args) {

		unos = new Scanner(System.in);

		boolean nastaviIgru = true;

		// korisnik unosi prvi broj i dodeljujemo varijabli prvi broj
		System.out.println("Unesite prvi broj: ");
		long prviBroj = unosBroja();

		// korisnik unosi drugi broj i dodeljujemo varijabli drugi broj
		System.out.println("Unesite drugi broj: ");
		long drugiBroj = unosBroja();

		// petlja koja se ponavlja dok korisnik ne unese karakter razlicit od s,o,m,d
		do {
			// korisnik unosi karakter kao opciju i dodeljujemo je varijabli
			System.out.println("unesite s za sabiranje,ili o za oduzimanje,ili m za mnozenje,ili d za deljenje "
					+ "\n ili bilo sta drugo da izadjete iz programa");
			String operacija = unosKaraktera();

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
			default:
				nastaviIgru = false;
				break;
			}
			// ponovo dajemo mogucnost korisniku za izbor opcije da bi mogao da izadje iz
			// petlje

		} while (nastaviIgru);

		System.out.println("Hvala sto ste koristili program");
		unos.close();
	}

	// metod za unos broja od strane korisnika
	private static int unosBroja() {
		while (!unos.hasNextInt()) {
			unos.next();
			System.out.println("Morate da unesete ceo broj do maximum 2.000.000.000, i da nije karakter");
		}
		return unos.nextInt();
	}

	// metod za unos operacije od strane korisnika
	private static String unosKaraktera() {
		return unos.next();
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
		return (double) prviBroj / drugiBroj;
	}
}

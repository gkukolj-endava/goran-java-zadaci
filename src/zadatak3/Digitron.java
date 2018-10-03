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

	public static void main(String[] args) {

		// korisnik unosi prvi broj i dodeljujemo varijabli prvi broj
		System.out.println("Unesite prvi broj: ");
		int prviBroj = unosBroja();

		// korisnik unosi drugi broj i dodeljujemo varijabli drugi broj
		System.out.println("Unesite drugi broj: ");
		int drugiBroj = unosBroja();

		// korisnik unosi karakter kao opciju i dodeljujemo je varijabli
		System.out.println("unesite s za sabiranje,ili o za oduzimanje,ili m za mnozenje,ili d za deljenje");
		String operacija = unosKaraktera();

		// petlja koja se ponavlja dok korisnik ne unese karakter razlicit od s,o,m,d
		do {
			switch (operacija) {
			case "s":
				sabiranje(prviBroj, drugiBroj);
				break;
			case "o":
				oduzimanje(prviBroj, drugiBroj);
				break;
			case "m":
				mnozenje(prviBroj, drugiBroj);
				break;
			case "d":
				deljenje(prviBroj, drugiBroj);
				break;
			}
			// ponovo dajemo mogucnost korisniku za izbor opcije da bi mogao da izadje iz
			// petlje
			System.out.println("izaberite ponovo s, o, m ili d, za izlaz unesite neki drugi karakter");
			operacija = unosKaraktera();
		} while (operacija.matches("^[somd]$"));
	}

	// metod za unos broja od strane korisnika
	public static int unosBroja() {
		Scanner unos = new Scanner(System.in);
		int brojKorisnika = 0;
		while (!unos.hasNextInt()) {
			unos.next();
			System.out.println("Unesite ceo broj...");
		}
		try {
			brojKorisnika = unos.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		return brojKorisnika;
	}

	// metod za unos operacije od strane korisnika
	public static String unosKaraktera() {
		Scanner unos = new Scanner(System.in);
		while (!unos.hasNext()) {
			unos.next();
			System.out.println("Unesite karakter...");
		}
		String unosKorisnika = unos.next();
		return unosKorisnika.substring(0, 1);
	}

	// metod za sabiranje
	public static void sabiranje(int prviBroj, int drugiBroj) {
		System.out.println(prviBroj + drugiBroj);
	}

	// metod za oduzimanje
	public static void oduzimanje(int prviBroj, int drugiBroj) {
		System.out.println(prviBroj - drugiBroj);
	}

	// metod za mnozenje
	public static void mnozenje(int prviBroj, int drugiBroj) {
		System.out.println(prviBroj * drugiBroj);
	}

	// metod za deljenje
	public static void deljenje(int prviBroj, int drugiBroj) {
		try {
			System.out.println(prviBroj / drugiBroj);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}

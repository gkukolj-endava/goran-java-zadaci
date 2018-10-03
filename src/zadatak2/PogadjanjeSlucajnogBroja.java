package zadatak2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK2: Napisati program za pogadjanje slucajno generisanog broja u
 *         opsegu od 1 do 50. Program treba da radi na sledeci nacin: Korisnik
 *         preko standardnog ulaza unosi jedan ceo broj. Broj koji treba
 *         pogoditi generisati “random” u opsegu od 1 do 50. Vrteti se u petlji
 *         dok ne pogodimo broj, ili budemo barem blizu (ako je razlika izmedju
 *         brojeva 5 ili manja). Taj deo sa proverom pogotka izdvojiti u zasebnu
 *         metodu, kojoj se kao argument prosledjuje broj koji tipujemo, a
 *         povratna vrednost metode je 0 – ako smo pogodili, 1 – ako smo bili
 *         blizu, 2 – ako smo promasili. U zavisnosti od rezultata pogadjanja
 *         ispisati i odgovarajucu poruku. Nakon odigrane partije proveriti da
 *         li korisnik zeli da prekine ili da nastavi igru.
 */
public class PogadjanjeSlucajnogBroja {

	public static void main(String[] args) {

		// kreiramo random objekat da dobijemo random zamisljeni broj
		Random random = new Random();
		System.out.println("Dobrodosli u igru pogadjanja");
		boolean novaIgra = true;

		// pocinje igra u petlji i ponavlja se koliko hocemo puta
		while (novaIgra) {

			// kreiramo slucajan broj izmedju 1 i 50
			int slucajanBroj = random.nextInt(49) + 1;
			int brojKorisnika = 0;
			boolean nijeBlizu = false;

			// korisnik unosi broj i dodeljujemo taj broj varijabli
			System.out.println("Unesite broj od 1 - 50");
			brojKorisnika = unosBroja();

			// petlja same igre, ponavlja se dok ne pogodi broj ili bude blizu zamisljenog
			// broja +/-5
			do {
				if (proveraPogotka(brojKorisnika, slucajanBroj) == 2) {
					System.out.println("Promasili ste, probajte drugi broj...");
					brojKorisnika = unosBroja();
				} else if (proveraPogotka(brojKorisnika, slucajanBroj) == 1) {
					System.out.println("Bili ste blizu!");
					System.out.println("Zamisljeni broj je bio: " + slucajanBroj);
					nijeBlizu = true;
				} else if (proveraPogotka(brojKorisnika, slucajanBroj) == 0) {
					System.out.println("Pogodili ste!");
					nijeBlizu = true;
				}
			} while (!nijeBlizu);

			// provera da li korisnik zeli ponovo da igra
			System.out.print("Unesite \'ne\' za exit,a bilo sta drugo da ponovo igrate");
			String ponovoIgrati = unosOdgovora();
			if (ponovoIgrati.equalsIgnoreCase("ne")) {
				novaIgra = false;
				System.out.println("Hvala sto ste igrali nasu igru");
			}
		}
	}

	// metod za unos broja od strane korisnika
	public static int unosBroja() {
		Scanner unos = new Scanner(System.in);
		while (!unos.hasNextInt()) {
			unos.next();
			System.out.println("Unesite ceo broj izmedju 1 i 50...");
		}
		return unos.nextInt();
	}

	// metod za unos odgovora od strane korisnika
	public static String unosOdgovora() {
		Scanner unos = new Scanner(System.in);
		String unosKorisnika = "";
		while (!unos.hasNext()) {
			unos.next();
			System.out.println("Unesite da ili ne...");
		}
		try {
			unosKorisnika = unos.next();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		return unosKorisnika;
	}

	// proverava da li je broj pogodjen
	public static int proveraPogotka(int unetBroj, int slucajanBroj) {

		if (unetBroj == slucajanBroj) {
			return 0;
		} else if ((unetBroj - slucajanBroj <= 5 && unetBroj - slucajanBroj > 0)
				|| (slucajanBroj - unetBroj <= 5 && slucajanBroj - unetBroj > 0)) {
			return 1;
		} else
			return 2;
	}
}

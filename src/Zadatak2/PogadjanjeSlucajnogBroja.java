package zadatak2;

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

	private static Scanner unos;
	private static final String LOS_UNOS = "Niste uneli ceo broj izmedju 1 i 50, pokusajte ponovo";

	public static void main(String[] args) {

		// kreiramo random objekat da dobijemo random zamisljeni broj
		System.out.println("Dobrodosli u igru pogadjanja");
		unos = new Scanner(System.in);
		// pozivamo metodu za generisanje random broja i dodeljujemo varijabli
		int slucajanBroj = generisanjeRandomBroja();
		boolean nijeBlizu = false;

		// petlja same igre, ponavlja se dok ne pogodi broj ili bude blizu zamisljenog
		// broja +/-5
		do {

			// korisnik unosi broj i dodeljujemo taj broj varijabli
			System.out.println("Unesite broj od 1 - 50");
			int brojKorisnika = unosBroja();

			// varijabli dodeljujemo rezultat metode
			int rezultatProverePogotka = proveraPogotka(brojKorisnika, slucajanBroj);

			if (rezultatProverePogotka == 2) {
				System.out.println("Promasili ste, probajte drugi broj...");
			} else if (rezultatProverePogotka == 1) {
				System.out.println("Bili ste blizu! \n Zamisljeni broj je bio: " + slucajanBroj);
				nijeBlizu = true;
			} else if (rezultatProverePogotka == 0) {
				System.out.println("Pogodili ste!");
				nijeBlizu = true;
			}
			if (nijeBlizu) {
				// provera da li korisnik zeli ponovo da igra
				System.out.print("Unesite \'ne\' za exit,a bilo sta drugo da ponovo igrate");
				String ponovoIgrati = unosOdgovora();
				if (ponovoIgrati.equalsIgnoreCase("ne")) {
					System.out.println("Hvala sto ste igrali nasu igru");
				} else {
					slucajanBroj = generisanjeRandomBroja();
					nijeBlizu = false;
				}
			}
		} while (!nijeBlizu);

		unos.close();
	}

	private static int unosBroja() {
		// metod za unos broja od strane korisnika
		int a = 0;
		boolean logic = true;
		while (logic) {
			if (!unos.hasNextInt()) {
				unos.next();
				System.out.println(LOS_UNOS);
			}
			a = unos.nextInt();
			if (a < 0 || a > 50) {
				System.out.println(LOS_UNOS);
			} else
				logic = false;
		}
		return a;
	}

	// metod za unos odgovora od strane korisnika
	private static String unosOdgovora() {
		return unos.next();
	}

	// proverava da li je broj pogodjen
	private static int proveraPogotka(int unetBroj, int slucajanBroj) {

		if (unetBroj == slucajanBroj) {
			return 0;
		} else if (Math.abs(unetBroj - slucajanBroj) <= 5) {
			return 1;
		} else
			return 2;
	}

	private static int generisanjeRandomBroja() {
		Random random = new Random();
		return random.nextInt(50) + 1;
	}
}

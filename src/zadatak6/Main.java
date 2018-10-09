package zadatak6;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK6: Kreirati projekat Nekretnina na sledeci nacin: Apstraktna
 *         klasa Nekretnina koja od atributa ima adresu, zonu, kvadraturu i
 *         podatke o vlasniku/instancu klase Vlasnik. Vlasnik ima puno ime i
 *         prezime, JMBG i broj licne karte. Izvedene klase, Stan i Kuca imaju
 *         toString() metod gde se ispisuju sve informacije o nekretnini
 *         ukljucujuci Vlasnika i cenu Cena se racuna po principu kvadratura X
 *         zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500 €) Kuca
 *         ima dodatno polje povrsinaOkucnice. U cenu kuce ulazi i cena okucnice
 *         koja se racuna po principu (povrsinaOkucnice X zona X 15%) Stan ima
 *         dva dodatna polja , povrsinaPodruma i povrsinaTerase. U cenu Stana
 *         ulazi i cena podruma i terase ((povrsinaPodruma+povrsinaTerase) X
 *         Zona X 33%) Napraviti Main klasu i u njoj kreirati instance klase
 *         Nekretnina i napraviti objekte izvedenih klasa sa proizvoljnim
 *         argumentima.
 */
public class Main {

	public static void main(String[] args) {

		try {
			// kreiramo vlasnike
			Vlasnik vlasnik1 = new Vlasnik("Jan", "Petar", "1234561234561", "123456770");
			Vlasnik vlasnik2 = new Vlasnik("Mia", "Minic", "1200044234561", "166254890");
			Vlasnik vlasnik3 = new Vlasnik("Sava", "Lu+ic", "4532227405651", "794979450");
			Vlasnik vlasnik4 = new Vlasnik("Vlada", "Ilic", "9994521'34761", "400141450");

			// kreiramo nekretnine
			Nekretnina kuca1 = new Kuca("Vareska 35", "4", 160, vlasnik1, 1);
			Nekretnina kuca2 = new Kuca("Somborska 2", "3", 250, vlasnik2, 536);
			Nekretnina stan1 = new Stan("Beogradska 26", "1", 69, vlasnik3, 15, 22);
			Nekretnina stan2 = new Stan("Zicka 221", "4", 53, vlasnik4, 4, 18);

			// ispisujemo podatke o vlasnicima i nekretninama
			System.out.println(kuca1);
			System.out.println(kuca2);
			System.out.println(stan1);
			System.out.println(stan2);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}

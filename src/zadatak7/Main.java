package zadatak7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK7: Napisati program koji omogucava unos imena i prezimena
 *         studenata i broj poena osvojenih na testu preko standardnog ulaza
 *         (sve dok se ne unese odredjeni znak/komanda za prekid unosa podataka
 *         npr. “stampaj”). Broj poena sme da bude od 0 do 100. Kao rezultat
 *         programa, ocekuje se izlazni fajl “ocene.txt” u kojem ce se nalaziti
 *         lista svih studenata, sortirana po poenima, od najvise ka najmanje, i
 *         gde ce se osim imena studenta i broja poena nalaziti i ocena koju je
 *         dobio na ispitu. Ocena 10 ako je imao vise od 90 poena, 9 ako je imao
 *         izmedju 81 i 90... Sve do 5 ako je imao manje od 51 poen.
 */
public class Main {

	private static Scanner unos;
	private static final String LOS_UNOS_IMENA = "Rec mora da sadrzi samo slova";
	private static final String LOS_UNOS_POENA = "Broj poena sme da bude od 0 do 100";
	private static final String REG_EXP_1 = "^[\\-'\\s]?[a-zA-Z]+";

	public static void main(String[] args) {

		unos = new Scanner(System.in);
		boolean unesiNovogStudenta = false;

		// kreiramo listu studenata
		ArrayList<Student> studenti = new ArrayList<>();

		do {
			// unosimo podatke o studentima
			Student student = new Student();
			System.out.println("Unesite ime studenta: ");
			student.setIme(unosReci());
			System.out.println("Unesite prezime studenta: ");
			student.setPrezime(unosReci());
			student.setBrojPoena(unosBroja());

			// dodajemo studente u listu
			studenti.add(student);

			// provera da li zelimo da unosimo jos podataka
			System.out.println("Ako ne zelite da unosite vise studenata upisite \'stampaj\'");
			if (unosReci().equalsIgnoreCase("stampaj")) {
				unesiNovogStudenta = true;
				System.out.println("Upis je sacuvan!");
			}
		} while (!unesiNovogStudenta);

		// sortiramo listu studenata
		Collections.sort(studenti);

		// okrecemo redosled liste da bi upisivali od najvise ka najmanje
		Collections.reverse(studenti);

		// kreiramo fajl gde upisujemo studente i poene
		File file = new File("ocene.txt");

		// upis u fajl
		try (PrintWriter upis = new PrintWriter(file)) {
			for (Student student : studenti) {
				upis.println(student);
			}
			upis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		unos.close();
	}

	private static String unosReci() {
		boolean logic = true;
		String ime = "";
		while (logic) {
			ime = unos.next();
			if (ime.matches(REG_EXP_1)) {
				logic = false;
			} else
				System.out.println(LOS_UNOS_IMENA);
		}
		return ime;
	}

	private static int unosBroja() {
		// metod za unos broja od strane korisnika
		int a = -1;
		do {
			System.out.println("Unesite broj poena sa testa: ");
			if (!unos.hasNextInt()) {
				unos.next();
				System.out.println(LOS_UNOS_POENA);
			} else
				a = unos.nextInt();
		} while (!(a >= 0 && a <= 100));
		return a;
	}
}

package zadatak7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
	private static final String LOS_UNOS_IMENA = "Ime mora da pocne velikim slovom,sve ostalo mala slova, i da sadrzi samo slova";
	private static final String LOS_UNOS_PREZIMENA = "Prezime mora da pocne velikim slovom,sve ostalo mala slova, i moze da sadrzi apostrof";
	private static final String LOS_UNOS_POENA = "Pogresno ste uneli broj poena, ";
	private static final String REG_EXP_1 = "^[A-Z][a-z]+";
	private static final String REG_EXP_2 = "^[A-Z]['\\sA-Z]*?[a-z]+$";

	public static void main(String[] args) {

		unos = new Scanner(System.in);
		boolean unesiNovogStudenta = false;

		// kreiramo fajl gde upisujemo studente i poene
		File file = new File("ocene.txt");

		// kreiramo listu studenata
		List<Student> studenti = new ArrayList<>();

		do {
			// unosimo podatke o studentima
			Student student = new Student();
			System.out.println("Unesite ime studenta: ");
			student.setIme(unosReci("ime"));
			System.out.println("Unesite prezime studenta: ");
			student.setPrezime(unosReci("prezime"));
			student.setBrojPoena(unosBroja());

			// dodajemo studente u listu
			studenti.add(student);

			// provera da li zelimo da unosimo jos podataka
			System.out.println(
					"Student je unet, ako ne zelite da unosite vise studenata i sacuvate fajl upisite \'stampaj\',\n"
							+ " u suprotnom upisite bilo koji karakter za nastavak unosa");
			if (unosOdgovoraZaNastavak().equalsIgnoreCase("stampaj")) {
				unesiNovogStudenta = true;
				try {
					System.out.println("Upis je sacuvan u fajlu \"ocene.txt\", koji se nalazi na lokaciji "
							+ file.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (!unesiNovogStudenta);

		// sortiramo listu studenata i okrecemo od najvise ka najmanje poena
		studenti.sort(Comparator.comparing(Student::getBrojPoena).reversed());

		// upis u fajl
		try (PrintWriter upis = new PrintWriter(file)) {
			for (Student student : studenti) {
				upis.print(student.getIme() + " ");
				upis.print(student.getPrezime() + " ");
				upis.print(student.getBrojPoena() + " ");
				upis.println(student.ocenaStudenta());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		unos.close();
	}

	private static String unosReci(String rec) {
		boolean logic = true;
		String ime = "";
		while (logic) {
			ime = unos.nextLine();
			if (rec.equals("ime")) {
				if (ime.matches(REG_EXP_1)) {
					logic = false;
				} else
					System.out.println(LOS_UNOS_IMENA);
			} else {
				if (ime.matches(REG_EXP_2)) {
					logic = false;
				} else
					System.out.println(LOS_UNOS_PREZIMENA);
			}
		}
		return ime;
	}

	private static int unosBroja() {
		// metod za unos broja od strane korisnika
		int a = -1;
		do {
			System.out.println("Unesite broj poena od 0 do 100: ");
			if (!unos.hasNextInt()) {
				unos.next();
				System.out.println(LOS_UNOS_POENA);
			} else {
				a = unos.nextInt();
				if (a < 0 || a > 100) {
					System.out.println(LOS_UNOS_POENA);
				}
			}
		} while (!(a >= 0 && a <= 100));
		return a;
	}

	private static String unosOdgovoraZaNastavak() {
		return unos.next();
	}
}

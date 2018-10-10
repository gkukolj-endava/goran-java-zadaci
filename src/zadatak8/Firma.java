package zadatak8;

import java.util.ArrayList;
import java.util.List;

public class Firma {
	private double kapitalFirme;
	private List<PrehrambeniProizvod> listaProizvoda = new ArrayList<>();

	public Firma(double kapitalFirme, List<PrehrambeniProizvod> listaProizvoda) {
		this.kapitalFirme = kapitalFirme;
		this.listaProizvoda = listaProizvoda;
	}

	public double getKapitalFirme() {
		return kapitalFirme;
	}

	public void setKapitalFirme(double kapitalFirme) {
		this.kapitalFirme = kapitalFirme;
	}

	public List<PrehrambeniProizvod> getListaProizvoda() {
		return listaProizvoda;
	}

	public void setListaProizvoda(List<PrehrambeniProizvod> listaProizvoda) {
		this.listaProizvoda = listaProizvoda;
	}

	public void porudzbina() {
		double vrednostPorudzbine = 0;
		// prolazom kroz listu proizvoda uzimamo cenu sa pdv-om svakog proizvoda i
		// sabiramo ih u jednu varijablu
		for (PrehrambeniProizvod proizvodi : listaProizvoda) {
			vrednostPorudzbine += proizvodi.cenaProizvodaSaPdv();
		}
		// uporedjujemo vrednost svih proizvoda porudzbine sa kapitalom firme
		// da bi utvrdili jel moguce napraviti porudzbinu
		if (kapitalFirme >= vrednostPorudzbine) {
			System.out.println(new StringBuilder("Vasa porudzbina je uspesno kreirana.\nVrednost porudzbine je ")
					.append(vrednostPorudzbine).toString());
			// ako je porudzbina uspesno kreirana brisemo sve iz liste
			listaProizvoda.clear();
		} else {
			System.out.println(new StringBuilder("Vrednost vase porudzbine je ").append(vrednostPorudzbine)
					.append("\nNazalost firma nema dovoljno sredstava za ovu porudzbinu").toString());
		}
	}
}

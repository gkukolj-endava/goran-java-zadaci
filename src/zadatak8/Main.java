package zadatak8;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK8: Napisati program koji opisuje sledeci scenario: Firma se
 *         bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po
 *         sledecim kategorijama proizvoda: Mlecni proizvodi Kafe, Sokovi Meso O
 *         svim proizvodima cuvamo informacije: ime proizvoda, cena proizvoda i
 *         rok trajanja. Kod mlecnih proizvoda cuvamo i poreklo mleka. Kod kafe
 *         da li je u zrnu ili je samlevena. O Sokovima cuvamo od cega je sok.
 *         Kod mesa cuvamo od koje zivotinje je meso. Kod cene mlecnih proizvoda
 *         i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8% Firma ima
 *         polje kapital, listu proizvoda i metodu porudzbina() koja izracuna,
 *         proverava da li ima dovoljno sredstava za porudzbinu na osnovu liste
 *         proizvoda. Nakon uspesne porudzbine lista ostaje prazna.
 * 
 */
public class Main {

	public static void main(String[] args) {

		// kreiramo listu proizvoda
		List<PrehrambeniProizvod> listaProizvoda = new ArrayList<>();

		// kreiramo specificne proizvode
		PrehrambeniProizvod mlecniProizvod1 = new MlecniProizvod("mleko", 110, "05.12.2020", "kozje");
		PrehrambeniProizvod kafaProizvod1 = new Kafa("espreso", 1500, "12.11.2021", TipKafe.ZRNO);
		PrehrambeniProizvod mesniProizvod1 = new Meso("batak", 260, "25.10.2018", "piletina");
		PrehrambeniProizvod sokPproizvod1 = new Sok("next", 136, "14.08.2019", "breskva");
		PrehrambeniProizvod kafaproizvod2 = new Kafa("domaca", 220, "05.02.2021", TipKafe.MLEVENA);
		PrehrambeniProizvod mesniProizvod2 = new Meso("butkica", 550, "01.12.2018", "svinjetina");
		PrehrambeniProizvod sokProizvod2 = new Sok("nectar", 184, "22.04.2019", "borovnica");

		// dodajemo proizvode u listu
		listaProizvoda.add(mlecniProizvod1);
		listaProizvoda.add(kafaProizvod1);
		listaProizvoda.add(mesniProizvod1);
		listaProizvoda.add(sokPproizvod1);
		listaProizvoda.add(kafaproizvod2);
		listaProizvoda.add(mesniProizvod2);
		listaProizvoda.add(sokProizvod2);

		// kreiramo prvu firmu
		Firma firma1 = new Firma(1000, listaProizvoda);

		// kreiramo prvu porudzbinu
		firma1.porudzbina();

		System.out.println("\n    *************\n");

		// dodajemo jos proizvoda u listu da bi se razlikovala porudzbina za drugu firmu
		listaProizvoda.add(mesniProizvod1);
		listaProizvoda.add(sokPproizvod1);
		listaProizvoda.add(kafaproizvod2);
		listaProizvoda.add(mesniProizvod2);
		listaProizvoda.add(sokProizvod2);

		// kreiramo drugu firmu
		Firma firma2 = new Firma(15000, listaProizvoda);

		// kreiramo drugu porudzbinu
		firma2.porudzbina();
	}
}

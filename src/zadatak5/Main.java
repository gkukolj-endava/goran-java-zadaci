package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 *         ZADATAK5: Kreirati projekat Geometrijske slike na sledeci nacin:
 *         Apstraktna klasa Geometrijska Slika Tri osnovne klase Krug, Kvadrat,
 *         Trougao Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni
 *         Trougao Klase imaju preklopnjenu metodu toString() u kojoj se
 *         ispisuju obim i povrsina Svaka klasa treba da sadrzi po 3
 *         konstruktora Klasa Trougao definise jednakostranicni Trougao Obim
 *         elipse se racuna aPI(9-koren od 35)/2 , a povrsina abPI Napraviti
 *         Main klasu i u njoj kreirati instance klase Geometrijska slika i
 *         napraviti objekte svih osnovnih i izvedenih klasa sa proizvoljnim
 *         argumentima. Ispisati String reprezentaciju objekata – toString()
 */
public class Main {

	public static void main(String[] args) {

		// kreiramo instance izvedenih i osnovnih klasa
		GeometrijskaSlika krug = new Krug(5);
		GeometrijskaSlika kvadrat = new Kvadrat(5);
		GeometrijskaSlika trougao = new Trougao(5);
		GeometrijskaSlika pravougaonik = new Pravougaonik(5, 4);
		GeometrijskaSlika nejednakostranicniTrougao = new NejednakostranicniTrougao(4, 7, 9);
		GeometrijskaSlika elipsa = new Elipsa(4, 9);

		// ispisujemo povrsinu i obim za sve instance
		System.out.println(elipsa);
		System.out.println(krug);
		System.out.println(kvadrat);
		System.out.println(trougao);
		System.out.println(pravougaonik);
		System.out.println(nejednakostranicniTrougao);
	}

}

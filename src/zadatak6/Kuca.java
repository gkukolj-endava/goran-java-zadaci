package zadatak6;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Kuca extends Nekretnina {

	// kreiramo varijablu
	private double povrsinaOkucnice;

	protected Kuca() {
		super();
	}

	protected Kuca(double povrsinaOkucnice) {
		super();
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaOkucnice > 0) {
			this.povrsinaOkucnice = povrsinaOkucnice;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine okucnice, unesite broj veci od nule");
	}

	protected Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
		super(adresa, zona, kvadratura, vlasnik);
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaOkucnice > 0) {
			this.povrsinaOkucnice = povrsinaOkucnice;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine okucnice, unesite broj veci od nule");
	}

	public double getPovrsinaOkucnice() {
		return povrsinaOkucnice;
	}

	public void setPovrsinaOkucnice(double povrsinaOkucnice) {
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaOkucnice > 0) {
			this.povrsinaOkucnice = povrsinaOkucnice;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine okucnice, unesite broj veci od nule");
	}

	@Override
	public double izracunajCenuNekretnine() {
		return (getKvadratura() + getPovrsinaOkucnice() * 15 / 100) * izracunajCenuKvadrata();
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(",\n povrsine okucnice = ").append(povrsinaOkucnice)
				.append(", je kuca koja kosta ").append(izracunajCenuNekretnine())
				.append("\n\n  ***********************\n").toString();
	}

}

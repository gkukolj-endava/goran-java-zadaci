package zadatak6;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Stan extends Nekretnina {

	// kreiramo varijable
	private double povrsinaPodruma;
	private double povrsinaTerase;

	protected Stan() {
		super();
	}

	protected Stan(double povrsinaPodruma, double povrsinaTerase) {
		super();
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaPodruma > 0) {
			this.povrsinaPodruma = povrsinaPodruma;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine podruma, unesite broj veci od nule");
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaTerase > 0) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine podruma, unesite broj veci od nule");
	}

	protected Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma,
			double povrsinaTerase) {
		super(adresa, zona, kvadratura, vlasnik);
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaPodruma > 0) {
			this.povrsinaPodruma = povrsinaPodruma;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine podruma, unesite broj veci od nule");
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaTerase > 0) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine podruma, unesite broj veci od nule");
	}

	// geteri i seteri

	public double getPovrsinaPodruma() {
		return povrsinaPodruma;
	}

	public void setPovrsinaPodruma(double povrsinaPodruma) {
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaPodruma > 0) {
			this.povrsinaPodruma = povrsinaPodruma;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine podruma, unesite broj veci od nule");
	}

	public double getPovrsinaTerase() {
		return povrsinaTerase;
	}

	public void setPovrsinaTerase(double povrsinaTerase) {
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaTerase > 0) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException("Pogresan unos povrsine podruma, unesite broj veci od nule");
	}

	@Override
	public double izracunajCenuNekretnine() {
		return (getKvadratura() + (getPovrsinaPodruma() + getPovrsinaTerase() * 33 / 100)) * izracunajCenuKvadrata();
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(",\n i povrsinom podruma=").append(povrsinaPodruma)
				.append(", povrsinom terase=").append(povrsinaTerase).append(",\n je stan koji kosta ")
				.append(izracunajCenuNekretnine()).append("\n\n  ***********************\n").toString();
	}

}

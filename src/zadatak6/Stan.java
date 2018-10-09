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
	private static final String LOS_UNOS_POVRSINE = "Pogresan unos povrsine , unesite broj veci od nule";

	protected Stan(String adresa, String zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma,
			double povrsinaTerase) {
		super(adresa, zona, kvadratura, vlasnik);
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaPodruma > 0) {
			this.povrsinaPodruma = povrsinaPodruma;
		} else
			throw new IllegalArgumentException(LOS_UNOS_POVRSINE);
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaTerase > 0) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException(LOS_UNOS_POVRSINE);
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
			throw new IllegalArgumentException(LOS_UNOS_POVRSINE);
	}

	public double getPovrsinaTerase() {
		return povrsinaTerase;
	}

	public void setPovrsinaTerase(double povrsinaTerase) {
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (povrsinaTerase > 0) {
			this.povrsinaTerase = povrsinaTerase;
		} else
			throw new IllegalArgumentException(LOS_UNOS_POVRSINE);
	}

	@Override
	public double izracunajCenuNekretnine() {
		return (getKvadratura() + ((getPovrsinaPodruma() + getPovrsinaTerase()) * 33 / 100)) * izracunajCenuKvadrata();
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(",\n i povrsinom podruma=").append(povrsinaPodruma)
				.append(",\n povrsinom terase=").append(povrsinaTerase).append(",\n je stan koji kosta ")
				.append(izracunajCenuNekretnine()).append("\n\n  ***********************\n").toString();
	}

}

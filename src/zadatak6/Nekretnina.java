package zadatak6;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public abstract class Nekretnina {

	// kreiramo varijable
	private String adresa;
	private int zona;
	private double kvadratura;
	private Vlasnik vlasnik;

	protected Nekretnina() {
		super();
	}

	protected Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		super();
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (kvadratura > 0) {
			this.kvadratura = kvadratura;
		} else
			throw new IllegalArgumentException("Pogresan unos kvadrature, unesite broj veci od nule");
		// provera da li je uneta zona u rasponu od 1 do 4
		if (zona > 0 && zona < 5) {
			this.zona = zona;
		} else
			throw new IllegalArgumentException("Pogresan unos zone, unesite ceo broj od 1-4");
	}

	// geteri i seteri

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		// provera da li je uneta zona u rasponu od 1 do 4
		if (zona > 0 && zona < 5) {
			this.zona = zona;
		} else
			throw new IllegalArgumentException("Pogresan unos zone, unesite ceo broj od 1-4");
	}

	public double getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(double kvadratura) {
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (kvadratura > 0) {
			this.kvadratura = kvadratura;
		} else
			throw new IllegalArgumentException("Pogresan unos kvadrature, unesite broj veci od nule");
	}

	public Vlasnik getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Vlasnik vlasnik) {
		this.vlasnik = vlasnik;
	}

	public abstract double izracunajCenuNekretnine();

	/**
	 * Vraca cenu kvadrata (tipa int) u zavisnosti od zone
	 * 
	 * @return int
	 */
	public int izracunajCenuKvadrata() {
		if (this.zona == 1) {
			return 3000;
		} else if (this.zona == 2) {
			return 2000;
		} else if (this.zona == 3) {
			return 1000;
		} else
			return 500;
	}

	@Override
	public String toString() {
		return new StringBuilder("Nekretnina na adresi = ").append(adresa).append(", u zoni = ").append(zona)
				.append(", kvadrature = ").append(kvadratura).append(",\n sa vlasnikom ").append(vlasnik).toString();
	}

}

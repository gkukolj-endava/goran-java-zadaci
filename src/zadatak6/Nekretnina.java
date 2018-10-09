package zadatak6;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public abstract class Nekretnina {

	// kreiramo varijable
	private String adresa;
	private String zona;
	private double kvadratura;
	private Vlasnik vlasnik;
	private static final String LOS_UNOS_KVADRATURE = "Pogresan unos kvadrature, unesite broj veci od nule";
	private static final String LOS_UNOS_ZONE = "Pogresan unos zone, unesite ceo broj od 1-4";

	protected Nekretnina(String adresa, String zona, double kvadratura, Vlasnik vlasnik) {
		super();
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (kvadratura > 0) {
			this.kvadratura = kvadratura;
		} else
			throw new IllegalArgumentException(LOS_UNOS_KVADRATURE);
		// provera da li je uneta zona u rasponu od 1 do 4
		switch (zona) {
		case "1":
		case "2":
		case "3":
		case "4":
			this.zona = zona;
			break;
		default:
			this.zona = LOS_UNOS_ZONE;
		}
	}

	// geteri i seteri

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		// provera da li je uneta zona u rasponu od 1 do 4
		switch (zona) {
		case "1":
		case "2":
		case "3":
		case "4":
			this.zona = zona;
			break;
		default:
			this.zona = LOS_UNOS_ZONE;
		}
	}

	public double getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(double kvadratura) {
		// provera da li je uneta povrsina veca od 0, ako nije izbacuje izuzetak
		if (kvadratura > 0) {
			this.kvadratura = kvadratura;
		} else
			throw new IllegalArgumentException(LOS_UNOS_KVADRATURE);
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
		if (this.zona.equals("1")) {
			return 3000;
		} else if (this.zona.equals("2")) {
			return 2000;
		} else if (this.zona.equals("3")) {
			return 1000;
		} else
			return 500;
	}

	@Override
	public String toString() {
		return new StringBuilder("Nekretnina na adresi = ").append(adresa).append(",\n u zoni = ").append(zona)
				.append(",\n kvadrature = ").append(kvadratura).append(",\n sa vlasnikom ").append(vlasnik).toString();
	}

}

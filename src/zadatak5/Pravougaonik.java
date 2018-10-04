package zadatak5;

public class Pravougaonik extends Kvadrat {

	// kreiramo varijable za visinu i sirinu
	private double visina;
	private double sirina;

	// default konstruktor
	protected Pravougaonik() {
		super();
	}

	// konstruktor sa parametrima
	protected Pravougaonik(double stranica) {
		super(stranica);
	}

	// konstruktor sa parametrima
	protected Pravougaonik(double visina, double sirina) {
		super();
		this.visina = visina;
		this.sirina = sirina;
	}

	// geter za visinu
	public double getVisina() {
		return visina;
	}

	// seter za visinu
	public void setVisina(double visina) {
		this.visina = visina;
	}

	// geter za sirinu
	public double getSirina() {
		return sirina;
	}

	// seter za sirinu
	public void setSirina(double sirina) {
		this.sirina = sirina;
	}

	// preklopljena metoda super klase za proracun povrsine
	@Override
	public double izracunajPovrsinu() {
		return visina * sirina;
	}

	// preklopljena metoda super klase za proracun obima
	@Override
	public double izracunajObim() {
		return 2 * visina + 2 * sirina;
	}

	// metoda da nam ispise povrsinu i obim
	@Override
	public String toString() {
		return "Povrsina pravougaonika je " + this.izracunajPovrsinu() + ", a obim pravougaonika je "
				+ this.izracunajObim();
	}

}

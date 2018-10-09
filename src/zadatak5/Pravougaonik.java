package zadatak5;

public class Pravougaonik extends Kvadrat {

	// kreiramo varijable za visinu i sirinu
	private double visina;
	private double sirina;

	protected Pravougaonik() {
		super();
	}

	protected Pravougaonik(double stranica) {
		super(stranica);
	}

	protected Pravougaonik(double visina, double sirina) {
		super();
		this.visina = visina;
		this.sirina = sirina;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}

	public double getSirina() {
		return sirina;
	}

	public void setSirina(double sirina) {
		this.sirina = sirina;
	}

	@Override
	public double izracunajPovrsinu() {
		return visina * sirina;
	}

	@Override
	public double izracunajObim() {
		return 2 * (visina + sirina);
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina pravougaonika je ").append(izracunajPovrsinu())
				.append(",\n a obim pravougaonika je ").toString() + this.izracunajObim();
	}

}

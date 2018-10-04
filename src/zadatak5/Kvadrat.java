package zadatak5;

public class Kvadrat extends GeometrijskaSlika {

	// kreiramo varijablu za stranicu
	private double stranica;

	// default konstruktor
	protected Kvadrat() {
		super();
	}

	// konstruktor sa parametrima
	protected Kvadrat(double stranica) {
		super();
		this.stranica = stranica;
	}

	// geter za stranicu
	public double getStranica() {
		return stranica;
	}

	// seter za stranicu
	public void setStranica(double stranica) {
		this.stranica = stranica;
	}

	// preklopljena metoda super klase za proracun povrsine
	@Override
	public double izracunajPovrsinu() {
		return Math.pow(stranica, 2);
	}

	// preklopljena metoda super klase za proracun obima
	@Override
	public double izracunajObim() {
		return 4 * stranica;
	}

	// metoda da nam ispise povrsinu i obim
	@Override
	public String toString() {
		return "Povrsina kvadrata je " + this.izracunajPovrsinu() + ", a obim kvadrata je " + this.izracunajObim();
	}

}

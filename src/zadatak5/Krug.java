package zadatak5;

public class Krug extends GeometrijskaSlika {

	// kreiramo varijablu poluprecnik
	private double poluprecnik;

	// default konstruktor
	protected Krug() {
		super();
	}

	// konstruktor sa parametrima
	protected Krug(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	// geter za poluprecnik
	public double getPoluprecnik() {
		return poluprecnik;
	}

	// seter za poluprecnik
	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	// preklopljena metoda super klase za proracun povrsine
	@Override
	public double izracunajPovrsinu() {
		return poluprecnik * poluprecnik * Math.PI;
	}

	// preklopljena metoda super klase za proracun obima
	@Override
	public double izracunajObim() {
		return 2 * poluprecnik * Math.PI;
	}

	// metoda da nam ispise povrsinu i obim
	@Override
	public String toString() {
		return "Povrsina kruga je " + this.izracunajPovrsinu() + ", a obim kruga je " + this.izracunajObim();
	}

}

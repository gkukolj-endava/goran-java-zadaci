package zadatak5;

public class Trougao extends GeometrijskaSlika {

	// kreiramo varijablu za stranicu
	private double stranica;

	// default konstruktor
	protected Trougao() {
		super();
	}

	// konstruktor sa parametrima
	protected Trougao(double stranica) {
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
		return (Math.pow(stranica, 2) * Math.sqrt(3)) / 4;
	}

	// preklopljena metoda super klase za proracun obima
	@Override
	public double izracunajObim() {
		return 3 * stranica;
	}

	// metoda da nam ispise povrsinu i obim
	@Override
	public String toString() {
		return "Povrsina trougla je " + this.izracunajPovrsinu() + ", a obim trougla je " + this.izracunajObim();
	}

}

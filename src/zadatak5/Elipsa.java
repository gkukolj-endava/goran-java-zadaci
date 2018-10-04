package zadatak5;

public class Elipsa extends Krug {

	// kreiramo varijable za poluprecnike
	private double poluprecnikA;
	private double poluprecnikB;

	// default konstruktor
	protected Elipsa() {
		super();
	}

	// konstruktor sa parametrima
	protected Elipsa(double poluprecnikA, double poluprecnikB) {
		super();
		this.poluprecnikA = poluprecnikA;
		this.poluprecnikB = poluprecnikB;
	}

	// konstruktor sa parametrima
	protected Elipsa(double poluprecnik) {
		super(poluprecnik);
	}

	// geter za prvi poluprecnik
	public double getPoluprecnikA() {
		return poluprecnikA;
	}

	// seter za prvi poluprecnik
	public void setPoluprecnikA(double poluprecnikA) {
		this.poluprecnikA = poluprecnikA;
	}

	// geter za drugi poluprecnik
	public double getPoluprecnikB() {
		return poluprecnikB;
	}

	// seter za drugi poluprecnik
	public void setPoluprecnikB(double poluprecnikB) {
		this.poluprecnikB = poluprecnikB;
	}

	// preklopljena metoda super klase za proracun povrsine
	@Override
	public double izracunajPovrsinu() {
		return poluprecnikA * poluprecnikB * Math.PI;
	}

	// preklopljena metoda super klase za proracun obima
	@Override
	public double izracunajObim() {
		return (poluprecnikA * Math.PI * (9 - Math.sqrt(35)) / 2);
	}

	// metoda da nam ispise povrsinu i obim
	@Override
	public String toString() {
		return "Povrsina elipse je " + this.izracunajPovrsinu() + ", a obim elipse je " + this.izracunajObim();
	}

}

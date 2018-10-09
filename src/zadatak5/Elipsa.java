package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Elipsa extends Krug {

	// kreiramo varijable za poluprecnike
	private double poluprecnikA;
	private double poluprecnikB;

	protected Elipsa() {
		super();
	}

	protected Elipsa(double poluprecnikA, double poluprecnikB) {
		super();
		this.poluprecnikA = poluprecnikA;
		this.poluprecnikB = poluprecnikB;
	}

	protected Elipsa(double poluprecnik) {
		super(poluprecnik);
	}

	public double getPoluprecnikA() {
		return poluprecnikA;
	}

	public void setPoluprecnikA(double poluprecnikA) {
		this.poluprecnikA = poluprecnikA;
	}

	public double getPoluprecnikB() {
		return poluprecnikB;
	}

	public void setPoluprecnikB(double poluprecnikB) {
		this.poluprecnikB = poluprecnikB;
	}

	@Override
	public double izracunajPovrsinu() {
		return poluprecnikA * poluprecnikB * Math.PI;
	}

	@Override
	public double izracunajObim() {
		return (poluprecnikA * Math.PI * (9 - Math.sqrt(35)) / 2);
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina elipse je ").append(izracunajPovrsinu()).append(",\n a obim elipse je ")
				.append(izracunajObim()).toString();
	}

}

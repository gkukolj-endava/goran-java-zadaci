package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Krug extends GeometrijskaSlika {

	// kreiramo varijablu poluprecnik
	private double poluprecnik;

	protected Krug() {
		super();
	}

	protected Krug(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	@Override
	public double izracunajPovrsinu() {
		return poluprecnik * poluprecnik * Math.PI;
	}

	@Override
	public double izracunajObim() {
		return 2 * poluprecnik * Math.PI;
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina kruga je ").append(izracunajPovrsinu()).append(",\n a obim kruga je ")
				.append(izracunajObim()).toString();
	}

}

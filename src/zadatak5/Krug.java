package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Krug extends GeometrijskaSlika {

	// kreiramo varijablu poluprecnik
	private double poluprecnikKruga;

	protected Krug() {
		super();
	}

	protected Krug(double poluprecnikKruga) {
		this.poluprecnikKruga = poluprecnikKruga;
	}

	public double getPoluprecnikKruga() {
		return poluprecnikKruga;
	}

	public void setPoluprecnikKruga(double poluprecnikKruga) {
		this.poluprecnikKruga = poluprecnikKruga;
	}

	@Override
	public double izracunajPovrsinu() {
		return Math.pow(poluprecnikKruga, 2) * Math.PI;
	}

	@Override
	public double izracunajObim() {
		return poluprecnikKruga * 2 * Math.PI;
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina kruga je ").append(izracunajPovrsinu()).append(",\n a obim kruga je ")
				.append(izracunajObim()).toString();
	}

}

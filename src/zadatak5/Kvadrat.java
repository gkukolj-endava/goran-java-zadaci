package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Kvadrat extends GeometrijskaSlika {

	// kreiramo varijablu za stranicu
	private double stranica;

	protected Kvadrat() {
		super();
	}

	protected Kvadrat(double stranica) {
		super();
		this.stranica = stranica;
	}

	public double getStranica() {
		return stranica;
	}

	public void setStranica(double stranica) {
		this.stranica = stranica;
	}

	@Override
	public double izracunajPovrsinu() {
		return Math.pow(stranica, 2);
	}

	@Override
	public double izracunajObim() {
		return 4 * stranica;
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina kvadrata je ").append(izracunajPovrsinu())
				.append(",\n a obim kvadrata je ").append(izracunajObim()).toString();
	}

}

package zadatak5;

public class Trougao extends GeometrijskaSlika {

	// kreiramo varijablu za stranicu
	private double stranica;

	protected Trougao() {
		super();
	}

	protected Trougao(double stranica) {
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
		return (Math.pow(stranica, 2) * Math.sqrt(3)) / 4;
	}

	@Override
	public double izracunajObim() {
		return 3 * stranica;
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina trougla je ").append(izracunajPovrsinu()).append(",\n a obim trougla je ")
				.append(izracunajObim()).toString();
	}

}

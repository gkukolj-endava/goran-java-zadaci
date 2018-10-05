package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class NejednakostranicniTrougao extends Trougao {

	// kreiramo varijable za stranice
	private double stranicaA;
	private double stranicaB;
	private double stranicaC;

	protected NejednakostranicniTrougao() {
		super();
	}

	protected NejednakostranicniTrougao(double stranica) {
		super(stranica);
	}

	protected NejednakostranicniTrougao(double stranicaA, double stranicaB, double stranicaC) {
		super();
		// provera da li moze da se konstruise trougao
		if (!((stranicaA + stranicaB) > stranicaC && (stranicaA + stranicaC) > stranicaB && stranicaC > stranicaA)) {
			System.out.println("Zbir bilo koje dve stranice mora biti veci od preostale stranice");
		} else
			this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;

	}

	public double getStranicaA() {
		return stranicaA;
	}

	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	public double getStranicaB() {
		return stranicaB;
	}

	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}

	public double getStranicaC() {
		return stranicaC;
	}

	public void setStranicaC(double stranicaC) {
		this.stranicaC = stranicaC;
	}

	@Override
	public double izracunajPovrsinu() {
		double poluobim = (stranicaA + stranicaB + stranicaC) / 2;
		double visinaA = (2 * Math.sqrt(poluobim) * (poluobim - stranicaA) * (poluobim - stranicaB)
				* (poluobim - stranicaC)) / 2;
		return ((stranicaA * visinaA) / 2);
	}

	@Override
	public double izracunajObim() {
		return stranicaA + stranicaB + stranicaC;
	}

	@Override
	public String toString() {
		return new StringBuilder("\nPovrsina nejednakostranicnog trougla je ").append(izracunajPovrsinu())
				.append(",\n a obim nejednakostranicnog trougla je ").append(izracunajObim()).toString();

	}

}

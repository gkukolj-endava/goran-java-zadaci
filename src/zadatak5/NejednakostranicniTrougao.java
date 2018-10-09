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
		double poluobim = izracunajObim() / 2;
		return Math.sqrt(poluobim * (poluobim - stranicaA) * (poluobim - stranicaB) * (poluobim - stranicaC));
	}

	@Override
	public double izracunajObim() {
		return stranicaA + stranicaB + stranicaC;
	}

	@Override
	public String toString() {
		if (jelMoguceKonstruisatiTrougao()) {
			return new StringBuilder("\nPovrsina nejednakostranicnog trougla je ").append(izracunajPovrsinu())
					.append(",\n a obim nejednakostranicnog trougla je ").append(izracunajObim()).toString();
		} else
			return "\nNe moze se konstruisati trougao sa tim duzinama stranica,\n"
					+ " zbir bilo koje dve stranice ne sme da bude manji od trece stranice";
	}

	private boolean jelMoguceKonstruisatiTrougao() {
		// provera da li moze da se konstruise trougao
		return ((stranicaA + stranicaB) > stranicaC && (stranicaA + stranicaC) > stranicaB && stranicaC > stranicaA);
	}
}

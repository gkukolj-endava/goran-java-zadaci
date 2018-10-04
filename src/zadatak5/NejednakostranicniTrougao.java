package zadatak5;

public class NejednakostranicniTrougao extends Trougao {

	// kreiramo varijable za stranice
	private double stranicaA;
	private double stranicaB;
	private double stranicaC;

	// default konstruktor
	protected NejednakostranicniTrougao() {
		super();
	}

	// konstruktor sa parametrima
	protected NejednakostranicniTrougao(double stranica) {
		super(stranica);
	}

	// konstruktor sa parametrima uz proveru da li moze da se konstruise trougao od
	// datih stranica
	protected NejednakostranicniTrougao(double stranicaA, double stranicaB, double stranicaC) {
		super();
		if (!((stranicaA + stranicaB) > stranicaC && (stranicaA + stranicaC) > stranicaB && stranicaC > stranicaA)) {
			System.out.println("Zbir bilo koje dve stranice mora biti veci od preostale stranice");
		} else
			this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;

	}

	// geter za prvu stranicu
	public double getStranicaA() {
		return stranicaA;
	}

	// seter za prvu stranicu
	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	// geter za drugu stranicu
	public double getStranicaB() {
		return stranicaB;
	}

	// seter za drugu stranicu
	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}

	// geter za trecu stranicu
	public double getStranicaC() {
		return stranicaC;
	}

	// seter za trecu stranicu
	public void setStranicaC(double stranicaC) {
		this.stranicaC = stranicaC;
	}

	// preklopljena metoda super klase za proracun povrsine
	@Override
	public double izracunajPovrsinu() {
		double poluobim = (stranicaA + stranicaB + stranicaC) / 2;
		double visinaA = (2 * Math.sqrt(poluobim) * (poluobim - stranicaA) * (poluobim - stranicaB)
				* (poluobim - stranicaC)) / 2;
		return ((stranicaA * visinaA) / 2);
	}

	// preklopljena metoda super klase za proracun obima
	@Override
	public double izracunajObim() {
		return stranicaA + stranicaB + stranicaC;
	}

	// metoda da nam ispise povrsinu i obim
	@Override
	public String toString() {
		return "Povrsina nejednakostranicnog trougla je " + this.izracunajPovrsinu()
				+ ", a obim nejednakostranicnog trougla je " + this.izracunajObim();

	}

}

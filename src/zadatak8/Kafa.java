package zadatak8;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Kafa extends PrehrambeniProizvod {
	private static final double PDV_KAFE = 0.08;
	private TipKafe tipKafe;

	public Kafa(String imeProizvoda, double cenaProizvoda, String rokUpotrebe, TipKafe tipKafe) {
		super(imeProizvoda, cenaProizvoda, rokUpotrebe);
		this.tipKafe = tipKafe;
	}

	public TipKafe getTipKafe() {
		return tipKafe;
	}

	public void setTipKafe(TipKafe tipKafe) {
		this.tipKafe = tipKafe;
	}

	public static double getPdvKafe() {
		return PDV_KAFE;
	}

	@Override
	public String toString() {
		return "Kafa [tipKafe=" + tipKafe + "]";
	}

	@Override
	public double cenaProizvodaSaPdv() {
		return getCenaProizvoda() + (getCenaProizvoda() * PDV_KAFE);
	}

}

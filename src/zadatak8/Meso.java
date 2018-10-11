package zadatak8;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Meso extends PrehrambeniProizvod {
	private String vrstaMesa;
	private static final float PDV_MESA = 0.08f;

	public Meso(String imeProizvoda, double cenaProizvoda, String rokUpotrebe, String vrstaMesa) {
		super(imeProizvoda, cenaProizvoda, rokUpotrebe);
		this.vrstaMesa = vrstaMesa;
	}

	public String getVrstaMesa() {
		return vrstaMesa;
	}

	public void setVrstaMesa(String vrstaMesa) {
		this.vrstaMesa = vrstaMesa;
	}

	public static double getPdvMesa() {
		return PDV_MESA;
	}

	@Override
	public String toString() {
		return "Meso [vrstaMesa=" + vrstaMesa + "]";
	}

	@Override
	public double cenaProizvodaSaPdv() {
		return getCenaProizvoda() + (getCenaProizvoda() * PDV_MESA);
	}

}

package zadatak8;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class MlecniProizvod extends PrehrambeniProizvod {
	private String porekloMleka;
	private static final float PDV_MLEKA = 0.2f;

	public MlecniProizvod(String imeProizvoda, double cenaProizvoda, String rokUpotrebe, String porekloMleka) {
		super(imeProizvoda, cenaProizvoda, rokUpotrebe);
		this.porekloMleka = porekloMleka;
	}

	public static double getPdvMleka() {
		return PDV_MLEKA;
	}

	public String getPorekloMleka() {
		return porekloMleka;
	}

	public void setPorekloMleka(String porekloMleka) {
		this.porekloMleka = porekloMleka;
	}

	@Override
	public String toString() {
		return "MlecniProizvod [porekloMleka=" + porekloMleka + "]";
	}

	@Override
	public double cenaProizvodaSaPdv() {
		return getCenaProizvoda() + (getCenaProizvoda() * PDV_MLEKA);
	}

}

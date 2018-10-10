package zadatak8;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Sok extends PrehrambeniProizvod {
	private String ukusSoka;
	private static final float PDV_SOKA = 0.2f;

	public Sok(String imeProizvoda, double cenaProizvoda, String rokUpotrebe, String ukusSoka) {
		super(imeProizvoda, cenaProizvoda, rokUpotrebe);
		this.ukusSoka = ukusSoka;
	}

	public String getUkusSoka() {
		return ukusSoka;
	}

	public void setUkusSoka(String ukusSoka) {
		this.ukusSoka = ukusSoka;
	}

	public static double getPdvSoka() {
		return PDV_SOKA;
	}

	@Override
	public double cenaProizvodaSaPdv() {
		return getCenaProizvoda() + (getCenaProizvoda() * PDV_SOKA);
	}

}

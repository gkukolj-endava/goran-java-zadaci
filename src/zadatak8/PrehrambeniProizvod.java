package zadatak8;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public abstract class PrehrambeniProizvod {

	private String imeProizvoda;
	private double cenaProizvoda;
	private String rokUpotrebe;

	protected PrehrambeniProizvod(String imeProizvoda, double cenaProizvoda, String rokUpotrebe) {
		this.imeProizvoda = imeProizvoda;
		this.cenaProizvoda = cenaProizvoda;
		this.rokUpotrebe = rokUpotrebe;
	}

	public String getImeProizvoda() {
		return imeProizvoda;
	}

	public void setImeProizvoda(String imeProizvoda) {
		this.imeProizvoda = imeProizvoda;
	}

	public double getCenaProizvoda() {
		return cenaProizvoda;
	}

	public void setCenaProizvoda(double cenaProizvoda) {
		this.cenaProizvoda = cenaProizvoda;
	}

	public String getRokUpotrebe() {
		return rokUpotrebe;
	}

	public void setRokUpotrebe(String rokUpotrebe) {
		this.rokUpotrebe = rokUpotrebe;
	}

	public abstract double cenaProizvodaSaPdv();

	@Override
	public String toString() {
		return "PrehrambeniProizvod [imeProizvoda=" + imeProizvoda + ", cenaProizvoda=" + cenaProizvoda
				+ ", rokUpotrebe=" + rokUpotrebe + "]";
	}

}

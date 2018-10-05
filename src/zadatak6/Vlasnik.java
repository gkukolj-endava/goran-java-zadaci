package zadatak6;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Vlasnik {
	// kreiramo varijable
	private String ime;
	private String prezime;
	private String jmbg;
	private String brojLicneKarte;

	protected Vlasnik() {
		super();
	}

	public Vlasnik(String ime, String prezime, String jmbg, String brojLicneKarte) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojLicneKarte = brojLicneKarte;
		// proverava da li je unet ispravan jmbg, da ima 13 brojeva i da nisu karakteri
		if (jmbg.contains("[a-zA-Z]+") == true || jmbg.length() != 13) {
			throw new IllegalArgumentException("JMBG mora da sadrzi 13 cifara,i samo brojeve");
		} else
			this.jmbg = jmbg;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		// proverava da li je unet ispravan jmbg, da ima 13 brojeva i da nisu karakteri
		if (jmbg.contains("[a-zA-Z]+") == true || jmbg.length() != 13) {
			throw new IllegalArgumentException("JMBG mora da sadrzi 13 cifara,i samo brojeve");
		} else
			this.jmbg = jmbg;
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}

	@Override
	public String toString() {
		return new StringBuilder(" ").append(ime).append(" ").append(prezime).append(",\n jmbg = ").append(jmbg)
				.append(", broj licne karte = ").append(brojLicneKarte).toString();
	}

}

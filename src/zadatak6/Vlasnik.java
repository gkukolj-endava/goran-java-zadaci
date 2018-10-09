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
	private static final String LOS_JMBG = "JMBG mora da sadrzi 13 cifara,i samo brojeve";
	private static final String LOS_BROJ_LICNE_KARTE = "Licna karta mora da sadrzi 9 cifara, i samo brojeve";
	private static final String LOS_UNOS_IMENA = "Ime ili prezime mora da sadrzi samo slova";
	private static final String REG_EXP_1 = "[0-9]+";
	private static final String REG_EXP_2 = "^[\\-'\\s]?[a-zA-Z]+";
	private static final String REG_EXP_3 = "^([a-zA-Z ']*)+$";

	public Vlasnik(String ime, String prezime, String jmbg, String brojLicneKarte) {
		super();
		if (ime.matches(REG_EXP_2)) {
			this.ime = ime;
		} else
			this.ime = LOS_UNOS_IMENA;
		if (prezime.matches(REG_EXP_3)) {
			this.prezime = prezime;
		} else
			this.prezime = LOS_UNOS_IMENA;
		// proverava da li je unet ispravan broj licne karte, da ima 9 brojeva i da nisu
		// karakteri
		if (brojLicneKarte.matches(REG_EXP_1) && brojLicneKarte.length() == 9) {
			this.brojLicneKarte = brojLicneKarte;
		} else
			this.brojLicneKarte = LOS_BROJ_LICNE_KARTE;

		// proverava da li je unet ispravan jmbg, da ima 13 brojeva i da nisu karakteri
		if (jmbg.matches(REG_EXP_1) && jmbg.length() == 13) {
			this.jmbg = jmbg;
		} else
			this.jmbg = LOS_JMBG;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime.matches(REG_EXP_2)) {
			this.ime = ime;
		} else
			this.ime = LOS_UNOS_IMENA;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime.matches(REG_EXP_3)) {
			this.prezime = prezime;
		} else
			this.prezime = LOS_UNOS_IMENA;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		// proverava da li je unet ispravan jmbg, da ima 13 brojeva i da nisu karakteri
		if (jmbg.matches(REG_EXP_1) && jmbg.length() == 13) {
			this.jmbg = jmbg;
		} else
			this.jmbg = LOS_JMBG;
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		// proverava da li je unet ispravan broj licne karte, da ima 9 brojeva i da nisu
		// karakteri
		if (brojLicneKarte.matches(REG_EXP_1) && brojLicneKarte.length() == 9) {
			this.brojLicneKarte = brojLicneKarte;
		} else
			this.brojLicneKarte = LOS_BROJ_LICNE_KARTE;
	}

	@Override
	public String toString() {
		return new StringBuilder(" ").append(ime).append(", ").append(prezime).append(",\n jmbg = ").append(jmbg)
				.append(",\n broj licne karte = ").append(brojLicneKarte).toString();
	}

}

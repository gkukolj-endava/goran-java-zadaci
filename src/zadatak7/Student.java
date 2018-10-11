package zadatak7;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public class Student {
	private String ime;
	private String prezime;
	private int brojPoena;

	protected Student() {
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

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	/**
	 * Pretvara poene sa testa u ocene
	 * 
	 * @param brojPoena
	 * @return int ocena
	 */
	public int ocenaStudenta() {
		if (this.brojPoena > 90) {
			return 10;
		} else if (this.brojPoena >= 81) {
			return 9;
		} else if (this.brojPoena >= 71) {
			return 8;
		} else if (this.brojPoena >= 61) {
			return 7;
		} else if (this.brojPoena >= 51) {
			return 6;
		} else
			return 5;
	}

}

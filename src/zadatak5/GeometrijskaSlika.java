package zadatak5;

/**
 * 
 * @author Goran.Kukolj
 *
 */
public abstract class GeometrijskaSlika {

	protected GeometrijskaSlika() {
		super();
	}

	/**
	 * abstraktni metod za izracunavanje povrsine
	 * 
	 * @return double vraca povrsinu
	 */
	public abstract double izracunajPovrsinu();

	/**
	 * abstraktni metod za izracunavanje obima
	 * 
	 * @return double vraca obim
	 */
	public abstract double izracunajObim();
}

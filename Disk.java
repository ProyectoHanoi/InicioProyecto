package InicioProyecto;

import acm.graphics.*;


public class Disk extends GRoundRect{
	private int numDisk;
		
	public static final int hDisco = 10;
	public static final int bDisco = 20;
	
	/**
	 * Cosntructor que crea un disco gr�fico
	 * @param numDisk N�mero de disco
	 */
	public Disk (int numDisk) {
		super(numDisk*bDisco, hDisco);
	}
	
	public int getnumDisk() {
		return numDisk;
	}

	
}

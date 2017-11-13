package proyecto_final;

public class Disk {
	private int numDisk;
	private int sizeDisk; 
	
	/**
	 * Constructor que crea un objeto de tipo Disco. El objeto ademas tiene como atributo sizeDisk que
	 * representa el tama�o del disco en tipo int dado por numDisk*20
	 * @param numDisk Parametro de tipo int que representa el n�mero del disco
	 */
	public Disk(int numDisk) {
		this.numDisk = numDisk; 
		sizeDisk = numDisk*20;
	}
	
	/**
	 * M�todo para retornar el n�mero del disco
	 * @return N�mero de disco
	 */
	public int getNumDisk() {
		return numDisk;
	}
	
	/**
	 * M�todo para retornar el tama�o del disco, su valor esta dado por numDisk*20 
	 * @return Tama�o del disco dado por el valor resultante de numDisk*20 
	 */
	public int getSizeDisk() {
		return sizeDisk;
	}
	
}

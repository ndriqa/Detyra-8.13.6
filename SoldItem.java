
public class SoldItem {
	private int ID;
	private int Quantity;
	/**Konstruktori i pare (me dy parametra) inicializon numrin identifikues
	 * te produktit ne shitje dhe sasine e shitjes se atij produkti
	 * 
	 * @param id Numri identifikues i produktit
	 * @param QUANTITY numri i sasise se shitur te produktit*/
	public SoldItem(int id, int QUANTITY) {
		ID = id;
		Quantity = QUANTITY;
	}
	
	/**Konstruktori i dyte(me nje parameter) inicializon numrin identifikues 
	 * te produktit ne shitje dhe sasine e shitjes se atij produkti ne nje
	 * per qellim te lehtesimit te punes dhe kursimit te kohes ne boten reale
	 * 
	 * @param id Numri identifikues i produktit*/
	public SoldItem(int id) {
		ID = id;
		Quantity = 1;
	}

	public int getID() {
		return ID;
	}

	public int getQuantity() {
		return Quantity;
	}
	
}

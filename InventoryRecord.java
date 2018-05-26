
/**@author Ndricim_Rrahmani*/

public class InventoryRecord {
	private String salesItem;
	private int id;
	private double wholesalePrice;
	private double retailPrice;
	private int inStock;
	private boolean used;
	
	/**Konstruktori InventoryRecord, merr te hyra si parametra dhe ne baze te tyre
	 * inicializon dhe llogarite te dhenat per ndonje produkt qe eshte i gatshem
	 * te shitet.
	 * 
	 * @param salesItem Emri i produktit ne shitje
	 * @param wholesalePrice Çmimi me te cilin produkti shitet me shumice
	 * @param id Numri identifikues i produktit
	 * @param interes Interesi qe duhet te fitoje rishitesi
	 * @param inStock Sasia e mbetur e produktit
	 * @param used Boolean qe tregon a eshte produkti i perdorur apo jo*/
	public InventoryRecord(String salesItem, int id, double wholesalePrice, double retailPrice, int inStock, boolean used) {
		this.salesItem = salesItem;
		this.id = id;
		this.wholesalePrice = wholesalePrice;		
		this.retailPrice = retailPrice;
		this.inStock = inStock;
		this.used = used;
	}
	
	/**Ne rast te shitjes se produktit, me ane te metodes "decrementStock", behet 
	 * dekrementimi i numrit te mbetur te produktit ne fjale*/
	public void decrementStock() {
		this.inStock--;
	}

	public String getSalesItem() {
		return salesItem;
	}

	public int getId() {
		return id;
	}

	public double getWholesalePrice() {
		return wholesalePrice;
	}
	
	/**getInteres gives the earning that is made by selling the product.*/
	public double getInteres() {
		return ((wholesalePrice/retailPrice)*100 - 100);
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public int getInStock() {
		return inStock;
	}

	public boolean isUsed() {
		return used;
	}
}

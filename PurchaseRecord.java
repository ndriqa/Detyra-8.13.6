/**@author NdricimRrahmani*/

public class PurchaseRecord {
	private int PurchaserID;
	private SoldItem[] items;
	private String meansOfPayment;
	private long CardID;
	/**Konstruktori PurchaseRecord inicializon vlerat e variablave me vlerat qe 
	 * i merr si parametra.
	 * 
	 * @param PURCHASER_ID numri identifikues i bleresit
	 * @param ITEM nje liste e gjerave te blera
	 * @param MEANS_OF_PAYMENT lloji i pageses nga bleresi*/
	public PurchaseRecord(int PURCHASER_ID, SoldItem[] ITEM, String MEANS_OF_PAYMENT, long card) {
		PurchaserID = PURCHASER_ID;
		items = new SoldItem[ITEM.length];
		items = ITEM;
		meansOfPayment = MEANS_OF_PAYMENT;
		CardID = card;
	}

	public int getPurchaserID() {
		return PurchaserID;
	}

	public SoldItem[] getItems() {
		return items;
	}

	public String getMeansOfPayment() {
		return meansOfPayment;
	}
	
	public long getCard() {
		return CardID;
	}
}

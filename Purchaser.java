
public class Purchaser {
	private int ID;
	private String name;
	private String address;
	private int[] topTen = new int[10];
	private String[] monthlyPurchasesLog = new String[12];
	
	public Purchaser(int iD, String name, String address, int[] topTen, String[] monthlyPurchasesLog) {
		ID = iD;
		this.name = name;
		this.address = address;
		this.topTen = topTen;
		this.monthlyPurchasesLog = monthlyPurchasesLog;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int[] getTopTen() {
		return topTen;
	}

	public String[] getMonthlyPurchasesLog() {
		return monthlyPurchasesLog;
	}
	
	public void setLastMonth(String log) {
		monthlyPurchasesLog = new LastMonthLog().newLog(monthlyPurchasesLog, log);
	}
	
}

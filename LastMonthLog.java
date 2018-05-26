
public class LastMonthLog {
	public String[] temp = new String[12];
	public String lastMonth;
	
	public String[] newLog(String[] log, String lastLog) {
		temp = log;
		lastMonth = lastLog;
		for(int i=0; i<11; i++) {
			temp[i]=temp[i+1];
		}
		temp[12] = lastLog;
		return temp;
	}
}

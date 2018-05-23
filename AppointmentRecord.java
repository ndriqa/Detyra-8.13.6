import java.util.Date;
public class AppointmentRecord {
	private Date date;
	private int hour;
	private String person;
	private String topic;
	private String place;
	
	/**AppointmentRecord merr te dhenat per nje takim qe do te ndodhe.
	 * 
	 * @param DATE data kur do te ndodh takimi
	 * @param HOUR ora se kur do te ndodh takimi (nga 0 deri ne 23)
	 * @param PERSON emri i personit me te cilin do te mbahet takimi
	 * @param TOPIC tema se per qka do te diskutohet gjate takimit
	 * @param PLACE vendi se ku do te mbahet takimi*/
	public AppointmentRecord(Date DATE, int HOUR, String PERSON, String TOPIC, String PLACE) {
		date = DATE;
		hour = HOUR;
		person = PERSON;
		topic = TOPIC;
		place = PLACE;
	}

	public Date getDate() {
		return date;
	}

	public int getHour() {
		return hour;
	}

	public String getPerson() {
		return person;
	}

	public String getTopic() {
		return topic;
	}
	
	public String getPlace() {
		return place;
	}
}

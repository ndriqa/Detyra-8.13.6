
import java.util.Date;

public class EmailMessage {
	private String senderEmail;
	private String receiveEmail;
	private String subject;
	private String message;
	private Date date;
	
	public EmailMessage(String senderEmail, String receiveEmail, String subject, String message, Date date) {
		this.senderEmail = senderEmail;
		this.receiveEmail = receiveEmail;
		this.subject = subject;
		this.message = message;
		this.date = date;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public String getReceiveEmail() {
		return receiveEmail;
	}

	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return message;
	}

	public Date getDate() {
		return date;
	}	
}

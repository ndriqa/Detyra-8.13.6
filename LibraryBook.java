
import java.util.Date;

/**@author Ndricim_Rrahmani*/

public class LibraryBook {
	
	private String title;  			//titulli i librit
	private String author;			//autori i librit	
	private int CatalogID;			//numri identifikues i librit
	private int PersonID;			//numri identifikues i personit qe e ka librin momentalisht
	private int timesBorrowed;		//numri i huazimeve te librit
	private Date returnDate;		//data e rikthimit te librit nga personi qe e ka marre ate
	
	/**
	 * Konstruktori i pare i LibraryBook, me kater parametra, thirret kur libri nuk 
	 * eshte huazuar nga askush se eshte i lire per tu shfrytezuar.
	 * 
	 * 
	 * @param TITLE titulli i librit
	 * @param AUTHOR autori i librit
	 * @param CATALOG_ID numri identifikues i librit
	 * @param TIMES_BORROWED sa here eshte huazuar libri deri me tani
	 */
	public LibraryBook (String TITLE, String AUTHOR, int CATALOG_ID, int TIMES_BORROWED) {
		title = TITLE;
		author = AUTHOR;
		CatalogID = CATALOG_ID;
		PersonID = 000000;
		timesBorrowed = TIMES_BORROWED;
		returnDate = null;
	}
	/**
	 * Konstruktori i dyte i LibraryBook, me gjashte parametra, thirret kur libri 
	 * eshte momentalisht i huazuar nga dikush dhe nuk eshte i lire per shfrytezim.
	 * 
	 * 
	 * @param TITLE titulli i librit
	 * @param AUTHOR autori i librit
	 * @param CATALOG_ID numri identifikues i librit
	 * @param TIMES_BORROWED sa here eshte huazuar libri deri me tani
	 * @param PERSON_ID numri identifikues i personit qe momentalisht e ka librin ne dispozicion
	 * @param RETURN_DATE data e kthimit te librit nga personi qe e ka marre ate*/
	public LibraryBook (String TITLE, String AUTHOR, int CATALOG_ID, int TIMES_BORROWED, int PERSON_ID, Date RETURN_DATE) {
		title = TITLE;
		author = AUTHOR;
		CatalogID = CATALOG_ID;
		PersonID = PERSON_ID;
		timesBorrowed = TIMES_BORROWED;
		returnDate = RETURN_DATE;
	}

	public String getName() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getCatalogID() {
		return CatalogID;
	}

	public int getPersonID() {
		return PersonID;
	}

	public int getTimesBorrowed() {
		return timesBorrowed;
	}

	public Date getReturnDate() {
		return returnDate;
	}
}

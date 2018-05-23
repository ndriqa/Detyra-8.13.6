
public class PatronsLibrary {
	private String name;
	private String address;
	private int id;
	private int[] books = new int[6];
	
	public PatronsLibrary(String NAME, String ADDRESS, int ID, int[] BOOKS) {
		name = NAME;
		address = ADDRESS;
		id = ID;
		
		/**Nese vargu i dhene eshte varg valid (me numer te njejte te elementeve)
		 * atehere vargut te librave i ndahen vlerat e vargut te dhene si 
		 * parameter. Perndryshe, vargut te librave i jipen vlera zero.*/
		if(BOOKS.length==books.length){	books = BOOKS;}
		else {	for (int i = 0;i<books.length;i++) {
					books[i]=000000;
				}
		}
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	public int[] getBooks() {
		return books;
	}
}

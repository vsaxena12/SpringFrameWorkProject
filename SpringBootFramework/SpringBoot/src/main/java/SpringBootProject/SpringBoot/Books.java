package SpringBootProject.SpringBoot;

public class Books {
	
	private int ID;
	private String author;
	private String bookName;
	
	public Books(int ID, String author, String bookName) {
		super();
		this.ID = ID;
		this.author = author;
		this.bookName = bookName;
	}

	public int getID() {
		return ID;
	}

	public String getAuthor() {
		return author;
	}

	public String getBookName() {
		return bookName;
	}

	
	
}


public class Book {
	private int pages;
	private String publisher;
	
	public Book(int numPages,String nameOfPublisher) {
		pages= numPages;
		publisher = nameOfPublisher;		
	}
	public int getpages() {
		return pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPages(int numOfPages) {
		pages = numOfPages;
	}
	public void setPublisher(String nameOfPublisher) {
		publisher = nameOfPublisher;
	}
	public String toString() {
		return "This book has "+pages+" pages and "+publisher+" is the publisher.";
	}
	public boolean equal(Book name) {
		return pages==name.getpages() && publisher.equals(name.getPublisher());
	}
	public int compareTo(Book name) {
		if(pages<name.getpages())
			return -1;
		if(pages==name.getpages())
			return 0;
		else
			return 1;
	}

}

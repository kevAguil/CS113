import java.util.Scanner;
import java.util.Random;

public class TestBooks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int numOfBooks;
		double totalPages=0;
		double average;
		String publisherName;
		Book biggestBook = new Book(0,"");
		System.out.println("Enter an amount of books to review.");
		numOfBooks = scan.nextInt();
		for(int c=1;c<=numOfBooks;c++) 
		{
			System.out.println("Enter name of publisher.");
			publisherName = scan.nextLine();
			Book books = new Book(generator.nextInt(100)+1, publisherName);
			totalPages += books.getpages();
			if(biggestBook.compareTo(books)==-1)
				biggestBook = books;
			
		
		}
		
		average = totalPages/numOfBooks;
		System.out.println("Average amount of pages is "+average);
		System.out.println("Biggest book summary: "+biggestBook);
		scan.close();

	}

}

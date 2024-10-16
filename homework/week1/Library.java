package homework.week1;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println(bookTitle+ " Book added successfully");
		 
	 return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library operation = new Library();
		String bookadded =operation.addBook("praveen");
		System.out.println("book returned is "+bookadded);
		operation.issueBook();
	}
}

   

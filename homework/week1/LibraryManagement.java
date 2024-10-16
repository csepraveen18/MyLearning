package homework.week1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library operation = new Library();
		String bookadded =operation.addBook("praveen");
		System.out.println("book returned is "+bookadded);
		operation.issueBook();

	}

}

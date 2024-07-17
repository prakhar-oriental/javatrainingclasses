package composition;

public class Library {
    public static Book[] books;
    public int bookCount;
    
    
	public Library(int capacity) {
		books = new Book[capacity];
		bookCount = 0;
	}
	
	public boolean addbook(Book book)
	{
		if(bookCount<books.length)
		{
			books[bookCount++] = book;
			return true;
		}else
		{
			System.out.println("Library is full");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Book a = new Book("ADC","vdf","vdv");
		  Book b = new Book("ADs","vdgf","vdk");
		  Book c = new Book("ADh","vjf","vda");
		  Library l = new Library(3);
		  l.addbook(a);
		  l.addbook(b);
		  l.addbook(c);
		  
		  for(int i = 0;i<books.length;i++ )
		  {
			  System.out.println(books[i].toString());
		  }

	}
	

}


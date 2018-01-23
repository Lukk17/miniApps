package borrowBook;

public class Main {

	public static void main(String[] args) 
	{
		Author author1 = new Author("453" , "imie" , "nazwisko" ,"pseudo" );
		User user1 = new User("344", "Lukk", "S");
		Book ksiazka = new Book(34, "fantasy");
		
		ksiazka.setAuthor(author1);
		ksiazka.borrowTo(user1);
		
		System.out.println(ksiazka.getTitle());
	}
}

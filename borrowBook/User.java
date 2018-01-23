package borrowBook;

import java.util.Arrays;

public class User extends Author
{
    private Book[] books = new Book[0];

    public User(String id, String firstName, String lastName)
    {
        super(id, firstName, lastName);
    }

    public void returnBook(Book book)
    {
        book.setAvailable(true);

        for (int i = 0; i < books.length; i++)
        {
            if (book.getId() == books[i].getId())
            {
                books[i] = null;
                break;
            }
        }
    }

    public void returnAllBooks(Book book)
    {
        for (int i = 0; i < books.length; i++)
        {
            books[i].setAvailable(true);
        }
        
        books = new Book[0];
    }

    public Book[] getBooks()
    {
        return books;
    }

    public void setBook(Book books)
    {
        Book tmp = new Book(books.getId(), books.getTitle());					//  create object with id and title of book 
        Book[] tempArr = Arrays.copyOf(this.books, this.books.length + 1);		//  copy array to new, with +1 size
        tempArr[this.books.length] = tmp;										//  save book to new array
        this.books = tempArr;													//  change old array with new one
    }
}
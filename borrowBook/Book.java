package borrowBook;

public class Book
{
    private int      id;
    private String   title;
    private boolean  available  = true;
    private Author   author;
    private Author[] additionalAuthors;
    private String   user;
    private int      popularity = 0;
    private User     currentUser;

    public Book(int id, String title)
    {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author author)
    {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, Author[] additionalAuthors)
    {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public void borrowTo(User user)
    {
        this.available = false;
        this.currentUser = user;

        currentUser.setBook(this);
        popularity++;
    }

    public boolean equals(Book book)
    {
        if (book.getId() == this.getId())
        {
            return true;
        }
        else
            return false;
    }

    public void returnBook()
    {
        this.getCurrentUser().returnBook(this);

    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    public Author[] getAdditionalAuthors()
    {
        return additionalAuthors;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors)
    {
        this.additionalAuthors = additionalAuthors;
    }

    public int getId()
    {
        return id;
    }

    public int getPopularity()
    {
        return popularity;
    }

    public void setPopularity(int popularity)
    {
        this.popularity = popularity;
    }

    public User getCurrentUser()
    {
        return currentUser;
    }

    public void setCurrentUser(User currentUser)
    {
        this.currentUser = currentUser;
    }

}

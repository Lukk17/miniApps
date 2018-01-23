package borrowBook;

public class Author
{
    private String id;
    private String firstName;
    private String lastName;
    private String pseudonim;

    public Author(String id, String firstName, String lastName, String pseudonim)
    {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPseudonim(pseudonim);
    }
    
    public Author(String id, String firstName, String lastName)
    {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Author setId(String id)
    {
        this.id = id;
        return this;
    }

    public Author setLastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    public Author setPseudonim(String pseudonim)
    {
        this.pseudonim = pseudonim;
        return this;
    }

    public Author setFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }
}

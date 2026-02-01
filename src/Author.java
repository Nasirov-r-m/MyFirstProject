public class Author {
    String firstnameAuthor;
    String lastNameAuthor;

    public Author (String lastNameAuthor, String firstnameAuthor){
        this.firstnameAuthor = firstnameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstnameAuthor() {
        return firstnameAuthor;
    }
    public String getLastNameAuthor(){
        return lastNameAuthor;
    }
}

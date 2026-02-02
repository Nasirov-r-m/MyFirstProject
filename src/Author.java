public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author (String lastNameAuthor, String firstNameAuthor){
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }
    public String getLastNameAuthor(){
        return lastNameAuthor + " ";
    }

}

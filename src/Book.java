public class Book {
 private Author nameAuthor;
 private String title;
 private int agePub;

 public Book (Author nameAuthor, String title,  int agePub){
     this.nameAuthor=nameAuthor;
     this.agePub=agePub;
     this.title=title;
 }

 public Author getNameAuthor(){
     return this.nameAuthor;
 }

 public String getTitle() {
     return this.title;
 }

 public int getAgePub(){
     return this.agePub;
 }

 public void setAgePub (int agePub) {
     this.agePub=agePub;
 }

}


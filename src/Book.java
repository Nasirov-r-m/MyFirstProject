public class Book {
 String nameAuthor;
 String title;
 int agePub;

 public Book (String nameAuthor, String title,  int agePub){
     this.nameAuthor=nameAuthor;
     this.agePub=agePub;
     this.title=title;
 }

 public String getNameAuthor(){
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


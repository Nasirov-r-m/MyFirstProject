import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Толстой ", "Лев " );
        Author nikolayGogol = new Author("Гоголь " , "Николай ");

        Book voinaIMir = new Book("Лев Толстой ", "Война и Мир ", 1863 );
        Book tarasBulba = new Book("Николай Гоголь ", "Тарас Бульба ",1835);

        voinaIMir.setAgePub(2001);

        System.out.println("Книга: " + voinaIMir.getTitle() + voinaIMir.getNameAuthor() + "Автор: " + levTolstoy.getFirstnameAuthor() + levTolstoy.getLastNameAuthor() + "Год публикации: " + voinaIMir.getAgePub() );
        System.out.println("Книга: " + tarasBulba.getTitle() + tarasBulba.getNameAuthor()+ "Автор: " + nikolayGogol.getFirstnameAuthor() + nikolayGogol.getLastNameAuthor() + "Год публикации: " + tarasBulba.getAgePub());




    }
}

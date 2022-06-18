package LibraryCatalog2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    /** This is a small library catalog able to add 50 books: novels or albums.
     * both have as common argue name and numbers of pages but novels have specific argue "type"
     * while Albums have paper quality;
    */
    public static void main(String[] args) {
        Book[]book=new Book[50];
        book[0]=new Novel("Moara cu noroc", 143, "psychologist");
        book[1]=new Album("Peisaje din muntii Apuseni", 49, "high");
        // delete a book; an available position list "null"
        book[3]=new Novel("La tiganici", 245, "psychologist");
        book[4]=new Album("Fauna Deltei Dunarii", 280, "medium");
      //book[5]=new Album/Nolel- add a new book: Novel or Album
        // List the position that you want
        System.out.println(book[4]);
       // List all library catalog
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
}

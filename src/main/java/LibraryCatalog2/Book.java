package LibraryCatalog2;

public class Book {
    private String name;
    private int numberPages;

    public String getName() {
        return name;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public Book(String name, int numberPages){
        this.name=name;
        this.numberPages=numberPages;
    }

    @Override
    public String toString() {
        return(name+numberPages);
    }
}

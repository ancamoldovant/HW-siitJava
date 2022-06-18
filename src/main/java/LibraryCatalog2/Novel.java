package LibraryCatalog2;

public class Novel extends Book {
    private String type;

    public Novel(String name, int numberPages, String type) {
        super(name, numberPages);
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return(getName()+ "," + getNumberPages()+ "," + getType());
    }
}

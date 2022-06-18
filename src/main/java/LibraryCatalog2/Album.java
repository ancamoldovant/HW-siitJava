package LibraryCatalog2;

public class Album extends Book{
    private String paperQuality;

    public Album(String name, int numberPages, String paperQuality) {
        super(name, numberPages);
        this.paperQuality=paperQuality;
    }
    public String getPaperQuality() {
        return paperQuality;
    }
    public String toString() {
        return(getName()+ "," +getNumberPages()+ ","+ getPaperQuality());
    }
}

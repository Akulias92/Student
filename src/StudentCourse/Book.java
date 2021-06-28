package StudentCourse;

public class Book {

    public int yearRealeased, nrOfPages;
    public static int maxAmountOfPages = 1000; 
    public String title;
    public String notSupported = "Maximum  is 1000 pages. Book not supported!";
    public String[] authors;
    
    public Book(){
        
    }

    public int getYearRealeased() {
        return yearRealeased;
    }

    public void setYearRealeased(int yearRealeased) {
        this.yearRealeased = yearRealeased;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public static int getMaxAmountOfPages() {
        return maxAmountOfPages;
    }

    public static void setMaxAmountOfPages(int maxAmountOfPages) {
        Book.maxAmountOfPages = maxAmountOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotSupported() {
        return notSupported;
    }

    public void setNotSupported(String notSupported) {
        this.notSupported = notSupported;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int pages(){
        Book.getMaxAmountOfPages();
        return 0;

    }
    

    @Override
    public String toString() {
        return "Book{" + "yearRealeased=" + yearRealeased + ", nrOfPages=" + nrOfPages + ", title=" + title + ", authors=" + authors + '}';
    }
}

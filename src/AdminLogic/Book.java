package AdminLogic;

import java.io.Serializable;

public class Book implements Serializable {
    private String isbn; 
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;
   
    public Book( String title, String author, String isbn, int totalCopies) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = totalCopies;
           this.availableCopies = totalCopies;
    }

  
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getTotalCopies() {
        return totalCopies;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
   public void setTitle(String title) {
        this.title = title;
   }
 public void setAuthor(String author) {
       this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }
   public boolean borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;

       }
        return false; 
    }
    public void returnCopy() {
              if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }
}

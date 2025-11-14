package AdminLogic;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction implements Serializable {
    private static int counter = 1; 
    private String transactionID;
    private String bookID;
    private String studentID;
    private String studentName;
    private String borrowDate; 
    private String returnDate; 

    public Transaction(String bookID, String studentID, String studentName) {
        this.transactionID = "T" + counter++;
        this.bookID = bookID;
        this.studentID = studentID;
        this.studentName = studentName;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.borrowDate = LocalDateTime.now().format(dtf);
        this.returnDate = null; 
    }

    public String getTransactionID() { return transactionID; }
    public String getBookID() { return bookID; }
    public String getStudentID() { return studentID; }
    public String getStudentName() { return studentName; }
    public String getBorrowDate() { return borrowDate; }
    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }
}
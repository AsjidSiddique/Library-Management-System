package AdminLogic;

public class Student {
    private String id;
    private String name;
    private String contactDetails;
    private int booksBorrowedCount;
    private String department; 

      public Student(String studentID, String name, String contactDetails, String department) {
        this.id = studentID;
        this.name = name;
        this.contactDetails = contactDetails;
        this.department = department;
        this.booksBorrowedCount = 0;
    }

      public String getStudentID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public int getBooksBorrowedCount() {
        return booksBorrowedCount;
    }

    public String getDepartment() {
        return department;
    }

      public void setName(String name) {
        this.name = name;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
    public void incrementBorrowedCount() {
        this.booksBorrowedCount++;
    }

    public void decrementBorrowedCount() {
        if (this.booksBorrowedCount > 0) {
            this.booksBorrowedCount--;
        }
    }
}
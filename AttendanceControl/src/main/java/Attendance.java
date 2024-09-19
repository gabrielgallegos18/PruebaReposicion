import java.time.LocalDate;

public class Attendance {
    private LocalDate date;
    private String student;
    private boolean present;

    // Constructor
    public Attendance(LocalDate date, String student, boolean present) {
        this.date = date;
        this.student = student;
        this.present = present;
    }

    // Getters
    public LocalDate getDate() {
        return date;
    }

    public String getStudent() {
        return student;
    }

    public boolean isPresent() {
        return present;
    }

    // Setters (optional)
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    // toString method for easy printing of attendance records
    @Override
    public String toString() {
        return "Date: " + date + ", Student: " + student + ", Present: " + (present ? "Yes" : "No");
    }
}


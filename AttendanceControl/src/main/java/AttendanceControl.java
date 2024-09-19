import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AttendanceControl {
    private List<Attendance> attendanceList;

    // Constructor
    public AttendanceControl() {
        this.attendanceList = new ArrayList<>();
    }

    // Method to add an attendance record
    public void markAttendance(LocalDate date, String student, boolean present) {
        Attendance newAttendance = new Attendance(date, student, present);
        attendanceList.add(newAttendance);
    }

    // Method to generate attendance report
    public void generateReport() {
        System.out.println("Attendance Report:");
        for (Attendance attendance : attendanceList) {
            System.out.println(attendance);
        }
    }
}

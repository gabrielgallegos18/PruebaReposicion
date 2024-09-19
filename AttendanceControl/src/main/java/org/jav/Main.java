import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AttendanceControl
        AttendanceControl attendanceControl = new AttendanceControl();

        // Mark attendance for some students
        attendanceControl.markAttendance(LocalDate.of(2024, 9, 18), "Javier Espinoza", true);
        attendanceControl.markAttendance(LocalDate.of(2024, 9, 18), "Gabriel Gallegos", false);
        attendanceControl.markAttendance(LocalDate.of(2024, 9, 18), "Hagzaelt Ortega", true);

        // Generate attendance report
        attendanceControl.generateReport();
    }
}

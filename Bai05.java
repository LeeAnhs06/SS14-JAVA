package session14.xuatsac1;

import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    private String name;
    private int severity; 
    private String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public int getSeverity() {
        return severity;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String severityDescription = switch (severity) {
            case 1 -> "Nguy kịch";
            case 2 -> "Nặng";
            case 3 -> "Nhẹ";
            default -> "Không xác định";
        };
        return "Bệnh nhân " + name + " (Mức " + severity + " - " + severityDescription + ", đến lúc " + arrivalTime + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.getSeverity() != p2.getSeverity()) {
                return Integer.compare(p1.getSeverity(), p2.getSeverity());
            }
            return p1.getArrivalTime().compareTo(p2.getArrivalTime());
        };
        TreeSet<Patient> emergencyQueue = new TreeSet<>(patientComparator);
        emergencyQueue.add(new Patient("A", 3, "08:00"));
        emergencyQueue.add(new Patient("B", 1, "08:15"));
        emergencyQueue.add(new Patient("C", 1, "08:05"));
        System.out.println("Thứ tự xử lý:");
        for (Patient patient : emergencyQueue) {
            System.out.println(patient);
        }
    }
}

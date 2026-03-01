import java.util.*;

class Patient {
    private String name;
    private int age;
    private String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Patient(" + name + ", " + age + " tuổi)";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 25, "Tim mạch")
        );
        Map<String, List<Patient>> departmentMap = new HashMap<>();
        for (Patient patient : patients) {
            departmentMap.computeIfAbsent(patient.getDepartment(), k -> new ArrayList<>()).add(patient);
        }
        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }
        String busiestDepartment = null;
        int maxPatients = 0;
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxPatients) {
                maxPatients = entry.getValue().size();
                busiestDepartment = entry.getKey();
            }
        }
        if (busiestDepartment != null) {
            System.out.println("Khoa " + busiestDepartment + " đang đông nhất (" + maxPatients + " bệnh nhân).");
        }
    }
}

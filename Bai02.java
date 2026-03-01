import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> drugCatalog = new HashMap<>();
        drugCatalog.put("T01", "Paracetamol");
        drugCatalog.put("T02", "Ibuprofen");
        drugCatalog.put("T03", "Amoxicillin");
        drugCatalog.put("T04", "Ciprofloxacin");
        drugCatalog.put("T05", "Metformin");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String drugCode = scanner.nextLine();
        if (drugCatalog.containsKey(drugCode)) {
            System.out.println("Tên thuốc: " + drugCatalog.get(drugCode));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT.");
        }
        scanner.close();
    }
}

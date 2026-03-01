package session14.gioi1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> drugComponents = new HashSet<>();
        drugComponents.add("Aspirin");
        drugComponents.add("Caffeine");
        drugComponents.add("Paracetamol");
        Set<String> allergens = new HashSet<>();
        allergens.add("Penicillin");
        allergens.add("Aspirin");
        allergens.add("Pollen");
        Set<String> allergyWarnings = new HashSet<>(drugComponents);
        allergyWarnings.retainAll(allergens);
        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(allergens);
        System.out.println("Cảnh báo dị ứng: " + allergyWarnings);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}

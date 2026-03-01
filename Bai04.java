import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> reportedCases = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        TreeMap<String, Integer> diseaseCount = new TreeMap<>();
        for (String disease : reportedCases) {
            diseaseCount.put(disease, diseaseCount.getOrDefault(disease, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : diseaseCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}

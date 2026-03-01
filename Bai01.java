import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
            "Nguyễn Văn A – Yên Bái",
            "Trần Thị B – Thái Bình",
            "Nguyễn Văn A – Yên Bái",
            "Lê Văn C – Hưng Yên"
        );

        List<String> callingList = removeDuplicatesPreserveOrder(input);
        System.out.println("In ra danh sách gọi khám: " + String.join(", ", callingList));
    }
    public static List<String> removeDuplicatesPreserveOrder(List<String> names) {
        Set<String> seen = new LinkedHashSet<>();
        List<String> result = new ArrayList<>();
        if (names == null) return result;
        for (String name : names) {
            if (name == null) continue;
            String trimmed = name.trim();
            if (trimmed.isEmpty()) continue;
            if (seen.add(trimmed)) {
                result.add(trimmed);
            }
        }
        return result;
    }
}

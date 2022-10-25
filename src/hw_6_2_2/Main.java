package hw_6_2_2;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <AttributeEntry> void main(String[] args) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "Январь");
        months.put(2, "Февраль");
        months.put(3, "Март");
        months.put(4, "Апрель");
        months.put(5, "Май");
        months.put(6, "Июнь");
        months.put(7, "Июль");
        months.put(8, "Август");
        months.put(9, "Сентябрь");
        months.put(10, "Октябрь");
        for (Map.Entry<Integer, String> entry : months.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}



package SetOfIntegers;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(20);
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < 20; i++) {
            integers.add(i, (int) (Math.random() * 1000));
        }
        System.out.println(integers);
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                System.out.print(integer + ". ");
            }
        }
        integers.removeIf(e -> e % 2 == 1);
    }
}

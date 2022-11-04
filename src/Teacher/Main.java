package Teacher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> multiplicationTable = new ArrayList<>(30);
        Iterator<Integer> iterator = multiplicationTable.iterator();
        int x;
        int y;
        for (int i = 0; i < 15; i++) {
            x = getIntFromRange(2, 9);
            y = getIntFromRange(2, 9);
            if (multiplicationTable.contains(x) && multiplicationTable.contains(y)
                    || multiplicationTable.contains(y) && multiplicationTable.contains(x)) {
                x = getIntFromRange(2, 9);
                y = getIntFromRange(2, 9);
                multiplicationTable.add(x);
                multiplicationTable.add(y);
            } else if (multiplicationTable.contains(x) && multiplicationTable.contains(y)
                    || multiplicationTable.contains(y) && multiplicationTable.contains(x)) {
                x = getIntFromRange(2, 9);
                y = getIntFromRange(2, 9);
                multiplicationTable.add(x);
                multiplicationTable.add(y);
            } else if (multiplicationTable.contains(x) && multiplicationTable.contains(y)
                    || multiplicationTable.contains(y) && multiplicationTable.contains(x)) {
                x = getIntFromRange(2, 9);
                y = getIntFromRange(2, 9);
                multiplicationTable.add(x);
                multiplicationTable.add(y);
            }
            else {
                multiplicationTable.add(x);
                multiplicationTable.add(y);
            }

        }
        System.out.println(multiplicationTable);
        for (int j = 0; j < 30; j = j + 2) {
            System.out.println(multiplicationTable.get(j) + " * " + multiplicationTable.get(j + 1));
        }
    }

    static int getIntFromRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

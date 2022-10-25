package hw_6_2_1;

import java.util.*;

public class Main {
    private static Object collectionList;

    public static void main(String[] args) {
        String element="Элемент";
        Collection element1=new Collection("Элемент");
        Map<String, List<Integer>> collection= new HashMap<>();
        List<Integer> integerList = new ArrayList<>();

        Random random = new Random();
        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(1000);
        int randomNumber3 = random.nextInt(1000);
        integerList.add(randomNumber1);
        integerList.add(randomNumber2);
        integerList.add(randomNumber3);
        collection.put("элемент", List.of(randomNumber1,randomNumber2,randomNumber3));
        System.out.println(collection);
        int sum = integerList.get(0) + integerList.get(1) + integerList.get(2);
        Map<String, Integer> collectionList= new HashMap<>();
        collectionList.put(element, sum);
        System.out.println(collectionList);
    }
}

package hw_6_2_1;

import java.util.*;

public class Collection {
    Map<String, List<Integer>> collection= new HashMap<>();
    List<Integer> integerList= new ArrayList<>();
    String element;

    Integer sum;

    public Collection(String element) {
        this.element = element;
    }

    Random random = new Random();

    private void randoms() {
        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(1000);
        int randomNumber3 = random.nextInt(1000);
        integerList.add(randomNumber1);
        integerList.add(randomNumber2);
        integerList.add(randomNumber3);
    }

    public void Transformation(String collection) {
        this.collection.put(collection, integerList);
        element = collection;
    }

    private void sumOfRandomNumbers() {
        sum = integerList.get(0) + integerList.get(1) + integerList.get(2);
    }
    public void collectionList(){
        Map<String, Integer> collectionList= new HashMap<>();
        collectionList.put(element, sum);
        System.out.println(collectionList);
    }

    public String getCollection() {
        StringBuilder builder=new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : collection.entrySet()) {
            builder.append(entry.getKey()).append(" --> ");
            for (Integer collection : entry.getValue()){
                builder.append(collection).append(",");
            }

        }
        return builder.toString();
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public String getElement() {
        return element;
    }

    public Integer getSum() {
        return sum;
    }

    public Random getRandom() {
        return random;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return Objects.equals(collection, that.collection) && Objects.equals(integerList, that.integerList)
                && Objects.equals(element, that.element) && Objects.equals(sum, that.sum)
                && Objects.equals(random, that.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection, integerList, element, sum, random);
    }

    @Override
    public String toString() {
        return "Collection " + getCollection();
    }
}

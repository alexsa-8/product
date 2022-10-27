package Product;
import java.util.Arrays;
import java.util.HashMap;



public class Main {
    private static HashMap<String, Double> map;

    public static void main(String[] args) {
        Product grape = new Product("Виноград", 120.0, 2.5);
        Product tomato = new Product("Помидор", 95.0, 1.5);
        Product cucumber = new Product("Огурец", 80.0, 2.0);
        Product dill = new Product("Укроп", 80.0, 0.3);
        Product potato = new Product("Картошка", 25.0, 1.0);
        Product beet = new Product("Свекла", 45.0, 1.0);
        Product carrot = new Product("Морковь", 55.0, 1.0);
        Product radish = new Product("Редька", 35.0, 1.0);
        Product sunflowerOil = new Product("Подсолнечное масло", 110.0, 1.0);

        HashMap<String, Double> salad=new HashMap<>();
        salad.put("tomato", 4.0);
        salad.put("cucumber", 4.0);
        salad.put("dill", 1.0);
        salad.put("sunflowerOil", 1.0);
        System.out.println(Arrays.toString(salad.values().toArray(new Double[0])));

        HashMap<String, Double> vinaigrette=new HashMap<>();
        vinaigrette.put("beet", 3.0);
        vinaigrette.put("potato", 3.0);
        vinaigrette.put("carrot", 3.0);
        vinaigrette.put("sunflowerOil", 1.0);
        System.out.println(Arrays.toString(vinaigrette.values().toArray(new Double[0])));

        Recipes recipes=new Recipes("Салат", salad);
        Recipes recipes1=new Recipes("Винегрет", vinaigrette);
        BookRecipes bookRecipes=new BookRecipes();
        bookRecipes.addRecipes(recipes);
        bookRecipes.addRecipes(recipes1);
        System.out.println(bookRecipes);
    }
}
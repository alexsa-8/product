package Product;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws ProductException {
        Product grape = new Product("Виноград", 120, 2);
        Product tomato = new Product("Помидор", 95, 1);
        Product cucumber = new Product("Огурец", 80, 2);
        Product dill = new Product("Укроп", 80, 1);
        Product potato = new Product("Картошка", 25, 1);
        Product beet = new Product("Свекла", 45, 1);
        Product carrot = new Product("Морковь", 55, 1);
        Product radish = new Product("Редька", 35, 1);
        Product sunflowerOil = new Product("Подсолнечное масло", 110, 1);

        HashMap<Product, Integer> salad = new HashMap<>();
        salad.put(tomato, 4);
        salad.put(cucumber, 4);
        salad.put(dill, 1);
        salad.put(sunflowerOil, 1);
        System.out.println(Arrays.toString(salad.values().toArray(new Integer[0])));

        HashMap<Product, Integer> vinaigrette = new HashMap<>();
        vinaigrette.put(beet, 3);
        vinaigrette.put(potato, 3);
        vinaigrette.put(carrot, 3);
        vinaigrette.put(sunflowerOil, 1);
        System.out.println(Arrays.toString(vinaigrette.values().toArray(new Integer[0])));

        Recipe recipes = new Recipe("Салат", salad);
        Recipe recipes1 = new Recipe("Винегрет", vinaigrette);
        BookRecipes bookRecipes = new BookRecipes();
        bookRecipes.addRecipes(recipes);
        bookRecipes.addRecipes(recipes1);
        System.out.println(bookRecipes);
    }
}

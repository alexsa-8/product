import java.util.Arrays;
import java.util.HashSet;


public class Main {
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

        HashSet<ListProducts> salad=new HashSet<>();
        salad.add(tomato);
        salad.add(cucumber);
        salad.add(dill);
        salad.add(sunflowerOil);
        System.out.println(Arrays.toString(salad.toArray()));

        HashSet<ListProducts> vinaigrette=new HashSet<>();
        vinaigrette.add(beet);
        vinaigrette.add(potato);
        vinaigrette.add(carrot);
        vinaigrette.add(sunflowerOil);
        System.out.println(Arrays.toString(vinaigrette.toArray()));

        Recipes recipes=new Recipes("Салат", salad);
        Recipes recipes1=new Recipes("Винегрет", vinaigrette);
        BookRecipes bookRecipes=new BookRecipes();
        bookRecipes.addRecipes(recipes);
        bookRecipes.addRecipes(recipes1);
        System.out.println(bookRecipes);

    }
}
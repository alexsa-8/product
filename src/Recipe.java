import java.util.HashMap;
import java.util.Objects;

public class Recipe {

    private final String nameRecipes;
    private final int priseRecipes;
    private ListProducts listProducts;


    public Recipe(String nameRecipes, HashMap<String, Integer> listProducts) {
        this.nameRecipes = nameRecipes;
        priseRecipes = ListProducts.sumPriceProduct();
    }

    public String getNameRecipes() {
        return nameRecipes;
    }

    public int getPriseRecipes() {
        return priseRecipes;
    }

    public ListProducts getListProducts() {
        return listProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return priseRecipes == recipe.priseRecipes && Objects.equals(nameRecipes, recipe.nameRecipes) && Objects.equals(listProducts, recipe.listProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipes, priseRecipes, listProducts);
    }

    @Override
    public String toString() {
        return "Название рецепта: " + nameRecipes + '\'' +
                ", цена: " + priseRecipes +
                ", продукты: " + listProducts;
    }
}

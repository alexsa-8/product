package Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private final String nameRecipes;
    private final int priseRecipes;
    Map<Product, Integer> listProducts;

    public Recipe(String nameRecipes, HashMap<Product, Integer> listProducts) {//int priseRecipes,
        this.nameRecipes = nameRecipes;
        this.listProducts = listProducts;
        priseRecipes = sumProduct();
    }

    public int sumProduct() {
        int sum = 0;
        for (Product key : listProducts.keySet()) {
            sum += listProducts.get(key) * key.getPriceProduct();
        }
        return sum;
    }

    public String getNameRecipes() {
        return nameRecipes;
    }

    public int getPriseRecipes() {
        return priseRecipes;
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
                " руб., продукты: " + listProducts;
    }
}


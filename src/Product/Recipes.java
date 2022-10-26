package Product;

import java.util.HashSet;
import java.util.Objects;

public class Recipes{
    //private final Set<Product.Product> productSet;
    private final String nameRecipes;
    private final Double priseRecipes;
    private ListProducts listProducts;

    public Recipes(String nameRecipes, HashSet<ListProducts> listProducts) {
        this.nameRecipes = nameRecipes;
        priseRecipes = ListProducts.sumPriceProduct();
    }

    public String getNameRecipes() {
        return nameRecipes;
    }

    public Double getPriseRecipes() {
        return priseRecipes;
    }

    public ListProducts getListProducts() {
        return listProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.priseRecipes, priseRecipes) == 0 && Objects.equals(nameRecipes, recipes.nameRecipes) && Objects.equals(listProducts, recipes.listProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipes, priseRecipes, listProducts);
    }

    @Override
    public String toString() {
        return "Рецепт " +
                "название " + nameRecipes + '\'' +
                ", продукты " + listProducts +
                ", цена " + priseRecipes +
                " руб.";
    }
}

package Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipes{
    //private final Set<Product.Product> productSet;
    private final String nameRecipes;
    private final Double priseRecipes;

    public double getSumProduct() {
        return sumProduct;
    }

    private ListProducts listProducts;
    private double sumProduct = 0.0;
    Map<Product, Integer> recipe = new HashMap<>();
    public Recipes(String nameRecipes, HashMap<String, Double> listProducts) {
        this.nameRecipes = nameRecipes;
        priseRecipes = ListProducts.sumPriceProduct();
        //priseRecipes = ListProducts.addList();
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
    public void addList(Product product, Integer quantity) {
        if (quantity == null || quantity < 1) {
            quantity = 1;
        }
        if (recipe.containsKey(product)) {
            System.out.println("Вы уже купили эти продукты: " + product.getNameProduct());
            return;
        }
        recipe.put(product, quantity);


        sumProduct = sumProduct + product.getPriceProduct() * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.priseRecipes, priseRecipes) == 0 &&
                Objects.equals(nameRecipes, recipes.nameRecipes) &&
                Objects.equals(listProducts, recipes.listProducts);
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
                ", цена " + ListProducts.sumPriceProduct() +
                " руб.";
    }
}

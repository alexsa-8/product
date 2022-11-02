import java.util.*;

public class ListProducts {
    static Map<Product, Integer> products;

    public ListProducts() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) throws ProductException {
        if (products.containsKey(product)) {
            throw new ProductException("Продукт " + product.getNameProduct() + " уже есть.");
        } else {
            products.put(product, product.getWeightProduct());
        }
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public static Integer sumPriceProduct() {
        int sum = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            sum += entry.getKey().getPriceProduct() * entry.getValue();
        }
        return sum;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ListProducts that = (ListProducts) obj;
        return Objects.equals(products, that.products);
    }

    @Override
    public String toString() {

        return super.toString() + products;
    }
}

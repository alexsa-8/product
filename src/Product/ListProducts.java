package Product;

import java.util.*;

public class ListProducts {
    static Map<Product, Integer> listProduct;

    public ListProducts() {
        listProduct = new HashMap<>();
    }

    public void addProduct(Product product) throws ProductException {
        if (listProduct.containsKey(product)) {
            throw new ProductException("Продукт " + product.getNameProduct() + " уже есть.");
        } else {
            listProduct.put(product, product.getWeightProduct());
        }
    }

    public void deleteProduct(Product product) {
        listProduct.remove(product);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ListProducts that = (ListProducts) obj;
        return Objects.equals(listProduct, that.listProduct);
    }

    @Override
    public int hashCode() {
        return  Objects.hash(listProduct);
        //return +super.hashCode();
    }

    @Override
    public String toString() {
        return "ListProduct{" +
                "listProduct=" + listProduct +
                '}';
        //return super.toString() + listProduct;
    }
}


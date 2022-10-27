package Product;

import java.util.*;

public class ListProducts {
    static Set<Product> listProducts;

    public ListProducts() {
        listProducts=new HashSet<>();
    }
    public void addProduct(Product product) throws ProductException {
        if (listProducts.contains(product)){
            throw new ProductException("Продукт "+ product.getNameProduct()+ " уже есть.");
        } else {
            listProducts.add(product);
        }
    }
    public void deleteProduct(Product product){
        listProducts.remove(product);
    }
    public static Double sumPriceProduct(){
        double sum =0;
        for (Product product : listProducts){
            sum +=(product.getPriceProduct()*product.getWeightProduct());
        }
        return sum;
    }

        public double getSumProduct() {
            return 0;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this==obj)return true;
            if (obj==null || getClass() !=obj.getClass()) return false;
            ListProducts that=(ListProducts) obj;
            return Objects.equals(listProducts, that.listProducts);
        }

        @Override
    public String toString() {
        return super.toString();
    }

}

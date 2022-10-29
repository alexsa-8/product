import java.util.*;

public class ListProducts {
    static Map<String, Double> listProducts;
    private static Map<String, Double> listProducts1;

    public ListProducts() {
        listProducts=new HashMap<>();
    }
    public void ListProducts1() { listProducts1=new HashMap<>();
    }
    public void addProduct(Product product) throws ProductException{
        if (listProducts.containsKey(product.getNameProduct())){
            throw new ProductException("Продукт "+ product.getNameProduct()+ " уже есть.");
        } else {
            listProducts.put(product.getNameProduct(), product.getWeightProduct());
        }
    }
    public void addProduct1(Product product) throws ProductException{
        if (listProducts1.containsKey(product.getNameProduct())){
            throw new ProductException("Продукт "+ product.getNameProduct()+ " уже есть.");
        } else {
            listProducts1.put(product.getNameProduct(), product.getPriceProduct());
        }
    }
    public void deleteProduct(Product product){
        listProducts.remove(product);
    }
    public static Double sumPriceProduct(){
        double sum =0;
        for (Map.Entry<String, Double> entry : listProducts.entrySet()){//Product product : listProducts
            for (Map.Entry<String, Double> entry1 : listProducts1.entrySet()) {
                if (Objects.equals(entry.getKey(), entry1.getKey())){
                    sum+=entry.getValue()*entry1.getValue();
                }
            }
            //sum +=(product.getPriceProduct()*entry.getValue());
        }
        return sum;
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

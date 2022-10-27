package Product;

public class Product extends ListProducts {
    private String nameProduct;
    private double priceProduct;
    private double weightProduct;

    public Product(String nameProduct, double priceProduct, double weightProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.weightProduct = weightProduct;
    }

    public Product(String nameProduct, double weightProduct) {
        this.nameProduct = nameProduct;
        this.weightProduct = weightProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(double weightProduct) {
            this.weightProduct = weightProduct;
    }
    @Override
    public String toString() {
        return "\nпродукт: "+getNameProduct()+
         ", цена: " + priceProduct +
                " руб., вес: " + weightProduct + " кг.";
    }
}


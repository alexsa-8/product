import java.util.Objects;

public class Product extends ListProducts {
    private final String nameProduct;
    private  double priceProduct;
    private double weightProduct;

    public Product(String nameProduct, double priceProduct, double weightProduct) throws ProductException {
        if (nameProduct == null || nameProduct.isBlank()) {
            throw new ProductException("Укажите название продукта.");
        } else {
            this.nameProduct = nameProduct;
        }
        setPriceProduct(priceProduct);
        setWeightProduct(weightProduct);

    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) throws ProductException {
        if ((priceProduct == null) || (priceProduct < 0)) {
            throw new ProductException("Укажите цену продукта.");
        } else {
            this.priceProduct = priceProduct;
        }
    }

    public Double getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(Double weightProduct) {
        if (weightProduct == null) {
            this.weightProduct = 1.0;
        } else {
            this.weightProduct = weightProduct;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return Double.compare(product.priceProduct, priceProduct) == 0 && Double.compare(product.weightProduct, weightProduct) == 0 && Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameProduct, priceProduct, weightProduct);
    }

    @Override
    public String toString() {
        return "\nпродукт: " + nameProduct +
                ", цена: " + priceProduct +
                " руб., вес: " + weightProduct + " кг.";
    }
}


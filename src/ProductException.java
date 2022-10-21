public class ProductException extends Exception{
    public ProductException(){

    }

    public ProductException(String information){
        super(information);
    }

    @Override
    public String toString() {
        return "ProductException{} " + super.toString();
    }
}

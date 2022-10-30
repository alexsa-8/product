public class ProductException extends Exception{
    public ProductException(){

    }

    public ProductException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "ProductException{} " + super.toString();
    }
}

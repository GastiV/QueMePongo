package Exception;

public class PrendaInvalidaException extends RuntimeException {
    public PrendaInvalidaException(String causa) throws Exception {
        throw  new Exception(causa);
    }
}

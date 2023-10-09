package Exercise3;

public class BancaException extends Exception {
    public String message;

    public BancaException(String message) {
        super(message);
        this.message = message;
    }

    public static void main(String[] args) {
        try {
            throw new BancaException("Errore nella banca");
        } catch (BancaException e) {
            System.out.println("Eccezione catturata: " + e.toString());
        }
    }

    @Override
    public String toString() {
        return message;
    }
}

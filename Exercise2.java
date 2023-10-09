import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("inserisci i KM percorsi");
            int km = Integer.parseInt(input.nextLine());
            System.out.println("inserisci i litri usati");
            int l = Integer.parseInt(input.nextLine());
            int result = km / l;
            System.out.println("km ogni litro : " + result);
        } catch (ArithmeticException ex) {
            System.err.println("non puoi consumare 0 litri");
        } catch (Exception ex) {
            System.err.println("errore generico");
        }
    }
}

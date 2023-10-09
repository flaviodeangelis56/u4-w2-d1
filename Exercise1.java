import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] es1 = new int[5];
        Random random = new Random();

        for (int i = 0; i < es1.length; i++) {
            int numeroCasuale = random.nextInt(10) + 1;
            es1[i] = numeroCasuale;
        }


        for (int i = 0; i < es1.length; i++) {
            System.out.println(es1[i] + " ");
        }


        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("inserisci un numero da 1 a 10 da inserire nell'array, inserisci 0 per interrompere il programma");
            int newNumber = Integer.parseInt(input.nextLine());
            if (newNumber == 0) {
                break;
            }
            try {
                System.out.println("inserisci il numero della posizione che vuoi modificare");
                int positionNumber = Integer.parseInt(input.nextLine());

                es1[positionNumber] = newNumber;


                for (int i = 0; i < es1.length; i++) {
                    System.out.println(es1[i] + " ");
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("index dell'array non valido");
            } catch (Exception ex) {
                System.err.println("errore generico");
            }
        }


    }
}

package sebastianougterolsen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Laver en array med 100 random integers
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        //
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");
        try {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + array[index]); //Hvis man skriver et rigtigt index
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds"); //Hvis man skriver et tal over 100
        } catch (Exception ex) {
            System.out.println("INVALID INPUT");//Hvis man skriver andet end tal
        }
    }
}
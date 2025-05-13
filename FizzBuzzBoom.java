import java.util.Scanner;

public class FizzBuzzBoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el rango
        System.out.print("Ingrese el número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese el número final: ");
        int fin = scanner.nextInt();
        
        for (int i = inicio; i <= fin; i++) {
            boolean esMultiploDe3 = (i % 3 == 0);
            boolean esMultiploDe5 = (i % 5 == 0);
            boolean esMultiploDe7 = (i % 7 == 0);
            
            if (esMultiploDe3 && esMultiploDe5 && esMultiploDe7) {
                System.out.println("FizzBuzzBoom");
            } else if (esMultiploDe3 && esMultiploDe5) {
                System.out.println("FizzBuzz");
            } else if (esMultiploDe3) {
                System.out.println("Fizz");
            } else if (esMultiploDe5) {
                System.out.println("Buzz");
            } else if (esMultiploDe7) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
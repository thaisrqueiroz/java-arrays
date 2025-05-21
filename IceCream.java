import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        
        //Vamos a hacer un programa que haga un pedido online por cada helado ordenado, vamos a escoger cuantas bolas de helado le pondremos y sus sabores.

        //Ejemplo de como debe mostrarse en la terminal:
        /* 
            ¿Cuántas bolas de helado quieres?: 3

            ¡Perfecto! Ahora escoge de que sabor quieres cada helado: 
                0. Chocolate
                1. Fresa
                2. Vainilla

            ¡Gracias por tu orden! Has pedido los siguientes sabores:
                0. Chocolate
                1. Fresa
                2. Vainilla
            
            ¿Es correcto? presiona intro para continuar

            ¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado
        */

        // La cantidad y los sabores escoge el usuario

        //Los índices 0, 1 y 2 (y los que sean) no lo escribirá el usuario, saldrá automáticamente según la cantidad de bolas de helado que haya escogido el usuario. Primero saldrá 0. y esperará a que el usuario escriba el primer sabor y después del "enter" aparecerá el 1. para que el usuario escriba el segundo sabor y así sucesivamente.

        //Has de usar un array para almacenar los sabores de helado y un bucle para imprimirlos.

        //Mira en el ejemplo los saltos de línea que has de tener.

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas bolas de helado quieres?: ");

        int scoops = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¡Perfecto! Ahora escoge de que sabor quieres cada helado:");

        String[] flavours = new String[scoops];

        for (int i = 0; i < flavours.length; i++){
            System.out.print("   " + i + ". ");
            flavours[i] = scanner.nextLine();
        }

        System.out.println("¡Gracias por tu orden! Has pedido los siguientes sabores:");

        for (int i = 0; i < flavours.length; i++){
            System.out.println("   " + i + ". " + flavours[i]);
        }

        System.out.println("¿Es correcto? presiona intro para continuar");

        scanner.nextLine();

        System.out.println("¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado");

        scanner.close();
    }
} 

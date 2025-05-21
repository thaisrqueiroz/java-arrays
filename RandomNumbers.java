public class RandomNumbers {
    public static void main(String[] args) {
        print2DArray(100, 10);
        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)

    }

    /**
     * Function name: randomNumber
     *
     * @return (int)
     * <p>
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */

    public static int randomNumber(){
        return (int) (Math.random() * 100);
    }

    /**
     * Function name: print2DArray
     * 
     * @param integers (2D array int)
     * 
     * Inside the function:
     * 1. nested loop that prints a 2D array using the randomNumber function
     */

    public static void print2DArray(int row, int col){
        int [][] array2D = new int[row][col];
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                array2D[i][j] = randomNumber();
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();

    }
}
}
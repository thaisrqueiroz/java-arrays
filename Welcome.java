public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
        String[] coders = {"Morena", "Nadiia", "Judit", "Lara", "Bruna"};
        for (String coder : coders){
            System.out.println("¡Hola " + coder + ", bienvenida a Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        System.out.println("Imprimiendo algunos números específicos de un Array");

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < numbers.length; i+=2){
            System.out.println(numbers[i]);
        }

        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado (multiplicado por 2)
        System.out.println("Imprimiendo números duplicados");

        int[] duplicate = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int num : duplicate){
            System.out.println(num*2);
        }

        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels){
            System.out.println(Character.toUpperCase(vowel));
        }
    }
}

import java.util.Scanner;
public class EvaluacionesWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;
        //contador e interrumpir ciclo while
        double totalEvaluaciones = 0;

        while(nota != -1){

            System.out.println("Escribe nota que darias a movie Matrix:");
            nota = teclado.nextDouble();
            //mediaEvaluaciones = mediaEvaluaciones + nota;

            if(nota != -1){

                //simplificar o mejoria de codigo linea 15
                mediaEvaluaciones += nota;

                //contador para interrumpir con incremento
                totalEvaluaciones++;
            }

        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}


/*  Otro Ejemplo de ciclo While
public class Programa {

    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
    }
}

 */

/* Transformacion de ciclo While en For
public class Programa {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }
}
 */

//Los operadores lógicos AND y OR se representan con los caracteres && y ||, respectivamente.
//Los operadores lógicos deben tener expresiones booleanas tanto en el lado izquierdo como en el derecho. Por ejemplo:
//if (edad > 18 && edad < 65) {

  //      }
//


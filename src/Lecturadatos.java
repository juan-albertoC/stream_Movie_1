//leer datos de entrada con la clase Scanner pude ser leidos como files, flujos de entrada, cadenas user teclado
import java.util.Scanner;
public class Lecturadatos {
    public static void main(String[] args) {
        //crear instacia teclado de la clase Scanner
        Scanner teclado = new Scanner(System.in);  //pasa el objeto System.in como parametro ndica lee entrada del user desde teclado

        System.out.println("Escribe el name de tu pelicula favorita");
        String pelicula = teclado.nextLine();  //leer datoscon variable pelicula metodo nextline para texto, pero hay otros para booleano, double etc

        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamineto = teclado.nextInt(); //metodo nextInt()

        System.out.println("Nota de la pelicula");
        double nota = teclado.nextDouble(); //metodo nextdouble()

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamineto);
        System.out.println(nota);
    }
}

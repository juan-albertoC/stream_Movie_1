/*
Juan Alberto Cuevas
Program stream_Movie v0.1
26/04/2024
 */
public class Main {
    public static void main(String[] args) {
        //simple mensaje con println
        System.out.println("Welcome to Screen Movie!");
        System.out.println("Movie: Matrix");

        //tipo de datos primitivos, indicar al compilador el tipo de dato (declarar variable)
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);


        //-------Uso de Strings: tipo de datos para textos de la case String------------

        //Comparar strings utilizar metodo equals() que compara el contenido de la variable contraseña con la cadena  12345, si estas cadenas son iguales  se imprime mensaje
        //otro metodo equalsIgnoreCase() para comparacion de strings no distinga entre mayusculas y minusculas

        String contraseña = "12345";
        if (contraseña.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
        //---------------------------------------------

        //------CONCATENACION forma simple y FORMATO DE TEXTO--------
        //concatenar strings de forma simple
        String saludo = "Hola,";
        String nombre = "Juan Cuevas, estas en la app de stream_Movie,";
        String mensaje = saludo + nombre + "tiene acceso!";
        System.out.println(mensaje);


        //BLOCK TEXT forma de representar cadenas facilita la escritura de textos multiples lineas
        //sinposis y fecha de lanzamiento
        String sinopsis = """
                
                Matriz es una paradoja 
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        //puntaje de la pelicula
        String puntaje = """
                
                Tiene calificacion del publico con un puntaje de: 
                """ + notaDeLaPelicula;
        System.out.println(puntaje);

        /*
        FORMATO DE TEXTO y numeros para mostrar valores al usuario de una forma mas legible
        utilizar de la clase String el metodo format() permite formatear texto utilizando marcadores de posicion (placeholders)
        representan con el caracter % seguido de una letra que indica el tipo de dato que se insertara en el marcador de posicion
        %s  se insertara una cadena  en el marcador de posicion
        %d indica un valor entero y %f indica un valor decimal
        los valores de las variables se pasan como parametros al metodo String.format reemplazando los marcadores de posicion %s,%d, %.2f

         */
        String apellido = "Cuevas";
        int edad = 29;
        double valor = 27.9999;
        System.out.println(String.format("Mi apellido es %s, tengo %d años, hoy gaste %.2f dolares", apellido,edad, valor));
        //marcador de posicion %.2f indica que el valor debe ser formateado con dos decimales

        //otro ejemplo con bloque de texto y formato de texto con metodo .formatted
        String apellidoDos = "Juarez";
        int aulas = 4;
        String mensajeDos = """
                
                Hola, %s!
                Bienvenido al curso de Java.
                Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tus primeros pasos  en este lenguaje
                """ .formatted(apellidoDos, aulas);
        System.out.println(mensajeDos);


        //------CASTING--------
        /*
        Recurso utilizado en Java para convertir un tipo de dato en otro, asi permite qye tipos de datos  incompatibls pueden ser utilizados  en la misma operacion o exprresion
        de forma automatica por el compilador (conversion implicita) cuando el tipo de dato de destino es compatible  con el tipo de dato de origen
        de forma manual(conversion explicita) utilizando el operador de casting

        si un metodo espera un parametro del tipo int y se desea pasar un valor del tipo double, es necesario hacer un casting
        para convertir el valor en int
         */

        //------casting implicito-----
        //asignar un valor de tipo int a una variable de tipo double, ya que el tipo double es mas grande y puede alamcenar todos los valores que el tipo int puede contener
        int x = 10;
        double y = x;
        System.out.println(y);

        //casting conversion explicito
        double t = 10.5;
        int z = (int) t;
        System.out.println(z);

        //casting para stream_Movie
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);






    }
}


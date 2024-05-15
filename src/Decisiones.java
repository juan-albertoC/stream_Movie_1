public class Decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //codigo que prueba el uso de los operadores relacionales
        if(fechaDeLanzamiento > 2022){
            System.out.println("Peliculas mas populares");

        }else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

        //codigo que prueba el uso de los operadores logicos || &&
        if(incluidoEnElPlan && tipoPlan.equals("plus")){   //tipoPlan == "plus" estrictamente igual
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan");
        }

        /*
        switch (expresion) {
  case valor1:
    // código a ejecutar si la expresión es igual a valor1
    break;
  case valor2:
    // código a ejecutar si la expresión es igual a valor2
    break;
  // otros casos posibles...
  default:
    // código a ejecutar si ninguno de los casos anteriores se cumple
}


//------------------------------------------------------------
---------------------------------------------------------------
Ejemplo: Switch

int dia = 3;
switch (dia) {
  case 1:
    System.out.println("El día 1 es lunes");
    break;
  case 2:
    System.out.println("El día 2 es martes");
    break;
  case 3:
    System.out.println("El día 3 es miércoles");
    break;
  // otros casos posibles...
  default:
    System.out.println("Día no válido");
}



         */

    }
}


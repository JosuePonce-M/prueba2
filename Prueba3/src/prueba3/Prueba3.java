
package prueba3;

public class Prueba3 {

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Josue", 20);

        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());

        Clase1 c = new Clase1();

        System.out.println("¿Es mayor de edad?: "
                + c.esMayorDeEdad(e.getEdad()));
    }
}

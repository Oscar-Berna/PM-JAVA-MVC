package rpgmanager.vista;
// cambio prueba push
import rpgmanager.modelo.Personaje;
import java.util.List;
import java.util.Scanner;

public class PersonajeVista {

    private Scanner scanner = new Scanner(System.in);

    // Debe mostrar el menú principal incluyendo la opción de salida del sistema.
    public void mostrarMenuPrincipal() {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Crear personaje");
        System.out.println("2. Listar personajes");
        System.out.println("3. Buscar personaje por ID");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Debe mostrar la información de un personaje en consola.
    public void mostrarPersonaje(Personaje p) {
        System.out.println(p);
    }

    // Debe solicitar el nombre del personaje utilizando validación
    // para asegurar que el texto ingresado no esté vacío.
    public String pedirNombrePersonaje() {
        return leerTextoNoVacio("Ingrese el nombre del personaje: ");
    }

    // Debe mostrar una lista de personajes en consola.
    public void mostrarLista(List<Personaje> lista) {
        for (Personaje p : lista) {
            System.out.println(p);
        }
    }

    // Debe leer un número entero desde consola, validarlo dentro de un rango permitido
    // y repetir la solicitud hasta que el usuario ingrese un valor válido.
    public int leerEnteroValido(String msg, int min, int max) {
        // TODO: implementar con bucle while
        // TODO: manejar NumberFormatException
        return 0;
    }

    // Debe solicitar un texto al usuario y garantizar que no esté vacío
    // repitiendo la solicitud hasta recibir un valor válido.
    public String leerTextoNoVacio(String msg) {
        // TODO: implementar validación de texto no vacío
        return "";
    }
}
package rpgmanager.controlador;

import rpgmanager.servicio.PersonajeServicio;
import rpgmanager.vista.PersonajeVista;
import java.util.Scanner;

public class PersonajeControlador {

    private PersonajeServicio servicio;
    private PersonajeVista vista;
    private Scanner scanner = new Scanner(System.in);

    public PersonajeControlador() {
        this.servicio = new PersonajeServicio();
        this.vista = new PersonajeVista();
    }

    public void ejecutar() {
        int opcion;

        do {
            vista.mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // TODO: conectar con servicio
                    break;

                case 2:
                    // TODO: conectar con servicio
                    break;

                case 3:
                    // TODO: conectar con servicio
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);
    }
}
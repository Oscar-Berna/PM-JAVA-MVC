package rpgmanager;

import rpgmanager.controlador.PersonajeControlador;

public class Main {

    public static void main(String[] args) {
        PersonajeControlador controlador = new PersonajeControlador();
        controlador.ejecutar();
    }
}
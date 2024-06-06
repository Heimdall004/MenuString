package interfaces;

/**
 * La interfaz MenuOptions define el contrato para manejar y mostrar opciones de menú.
 * Cualquier clase que implemente esta interfaz debe proporcionar implementaciones para
 * manejar una opción de menú basada en un valor de tipo byte y mostrar el menú al usuario.
 */
public interface MenuOptions {

    /**
     * Maneja la acción correspondiente a una opción de menú específica.
     *
     * @param option la opción de menú seleccionada por el usuario.
     * @return un mensaje String que indica el resultado de la acción.
     * @throws IllegalArgumentException si la opción proporcionada es inválida.
     */
    String handleOption(byte option) throws IllegalArgumentException;

    /**
     * Muestra las opciones del menú al usuario.
     */
    void displayMenu();
}

/**
 * Clase principal de la aplicación.
 */
public class App {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Argumentos de la línea de comandos (no se usan en este ejemplo).
     */
    public static void main(String[] args) {
        
        // Crear una instancia de la clase Menu.
        Menu menu = new Menu();
        
        // Llamar al método menuString() de la instancia de Menu.
        // Este método se espera que muestre o gestione el menú de la aplicación.
        menu.menuString();
    }
}
import java.util.Scanner;
import classes.LengthText;
import classes.MaxWords;
import classes.Palindrome;
import classes.ReadLicense;
import classes.Separator;

/**
 * Clase Menu.
 * Esta clase proporciona una interfaz de menú para interactuar con varias funcionalidades de texto.
 */
public class Menu {

    private final Scanner in;
    private byte option;
    private final Separator separator;
    private final MaxWords maxWords;
    private final ReadLicense readLicense;
    private final LengthText lengthText;
    private final Palindrome palindrome;

    /**
     * Constructor de la clase Menu.
     * Inicializa las instancias de las clases y el Scanner para la entrada del usuario.
     */
    public Menu() {
        in = new Scanner(System.in);
        separator = new Separator();
        maxWords = new MaxWords();
        readLicense = new ReadLicense();
        lengthText = new LengthText();
        palindrome = new Palindrome();
    }

    /**
     * Método principal que muestra el menú y maneja las opciones del usuario.
     */
    public void menuString() {
        while (true) {
            displayMenu();
            try {
                option = in.nextByte();
                in.nextLine(); // Limpiar el buffer
            } catch (Exception e) {
                System.out.println("Has ingresado un elemento inválido");
                in.nextLine(); // Limpiar el buffer
                continue;
            }
            String result = handleOption(option);
            System.out.println(result);
            
            if (option == 6) {
                in.close();
                System.exit(0);
            }
        }
    }

    /**
     * Maneja las opciones del usuario basándose en la entrada.
     * @param option La opción seleccionada por el usuario.
     * @return El resultado de la operación seleccionada.
     */
    private String handleOption(byte option) {
        return switch (option) {
            case 1 -> separator.separatorString();
            case 2 -> maxWords.maxWords();
            case 3 -> lengthText.lengthText();
            case 4 -> palindrome.isPalindrome();
            case 5 -> readLicense.readerLicense();
            case 6 -> "Saliendo del programa...";
            default -> "Opción inválida. Por favor, intente de nuevo.";
        };
    }

    /**
     * Muestra el menú de opciones al usuario.
     */
    private void displayMenu() {
        System.out.print("""
            Opciones:
                1- Separador de texto
                2- Encontrar la palabra más larga
                3- Longitud del texto
                4- Es palíndromo
                5- Licencia
                6- Salir
                
                """);
        System.out.print("Seleccione su opción: ");
    }
}

package classes;

import java.util.Scanner;
import interfaces.GetText;

/**
 * Clase Palindrome que implementa la interfaz GetText.
 * Esta clase permite verificar si un texto ingresado es un palíndromo.
 */
public class Palindrome implements GetText {

    // Scanner para la entrada del usuario
    private Scanner in;

    /**
     * Constructor de la clase Palindrome.
     * Inicializa el objeto Scanner.
     */
    public Palindrome() {
        in = new Scanner(System.in);
    }

    /**
     * Método que verifica si el texto ingresado es un palíndromo.
     * @return Un mensaje indicando si el texto es un palíndromo o no.
     */
    public String isPalindrome() {
        // Obtiene el texto ingresado por el usuario
        String text = getText().replaceAll("[^a-zA-Z]", "").toLowerCase(); // Ignora espacios y caracteres no alfabéticos, y convierte a minúsculas;

        // Crea un StringBuilder con el texto y lo invierte
        StringBuilder palindrome = new StringBuilder(text);

        // Compara el texto original con su versión invertida
        if (text.equals(palindrome.reverse().toString())) {
            return "The text is palindrome";
        }
        return "The text is not a palindrome ";
    }

    /**
     * Método implementado de la interfaz GetText.
     * Solicita al usuario que ingrese un texto y lo devuelve.
     * @return El texto ingresado por el usuario.
     */
    @Override
    public String getText() {
        System.out.print("Enter your text: ");
        return in.nextLine();
    }
}

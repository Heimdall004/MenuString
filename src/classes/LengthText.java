package classes;

import java.util.Scanner;
import interfaces.GetText;

/**
 * Clase LengthText que implementa la interfaz GetText.
 * Esta clase permite contar el número de palabras en un texto ingresado.
 */
public class LengthText implements GetText {

    // Scanner para la entrada del usuario
    private final Scanner in;

    /**
     * Constructor de la clase LengthText.
     * Inicializa el objeto Scanner.
     */
    public LengthText() {
        in = new Scanner(System.in);
    }

    /**
     * Método que cuenta el número de palabras en el texto ingresado.
     * @return Un mensaje indicando la cantidad de palabras en el texto.
     */
    public String lengthText() {
        // Obtiene el texto ingresado por el usuario y elimina espacios al principio y al final
        String text = getText().trim();

        // Si el texto está vacío después de trim(), devuelve 0 palabras
        if (text.isEmpty()) {
            return "El texto tiene 0 palabras";
        }

        // Inicializa el contador de palabras
        int cont = 1;

        // Recorre el texto para contar los espacios que indican palabras
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                cont += 1;
            }
        }

        // Devuelve el mensaje con la cantidad de palabras
        return "El texto tiene " + cont + " palabras";
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

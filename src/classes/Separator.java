package classes;

import java.util.Scanner;
import interfaces.GetText;

/**
 * La clase Separator proporciona funcionalidades para procesar una cadena de entrada del usuario,
 * específicamente para separar cada carácter en la cadena con un espacio y devolver el resultado.
 */
public class Separator implements GetText {

    private Scanner in;

    /**
     * Constructor de la clase Separator.
     * Inicializa el objeto Scanner para leer la entrada desde la consola.
     */
    public Separator() {
        in = new Scanner(System.in);
    }

    /**
     * Separa cada carácter en la cadena de entrada con un espacio y devuelve la cadena formateada.
     * El método solicita al usuario que ingrese una cadena, procesa la entrada y luego cierra el Scanner.
     *
     * @return Una cadena donde cada carácter de la entrada está separado por un espacio, precedido de un texto con color.
     */
    public String separatorString() {
        String text = getText();
        
        if (text == null) {
            return ANSI_CYAN + "No se ingresó ningún texto." + ANSI_RESET;
        }

        StringBuilder newString = new StringBuilder();
        int textLong = text.length();
        for (int i = 0; i < textLong; i++) {
            newString.append(text.charAt(i)).append(" ");
        }

        return ANSI_CYAN + "El nuevo texto es: " + newString.toString() + ANSI_RESET;
    }

    @Override
    public String getText() {
        System.out.print("Ingrese su texto: ");
        if (in.hasNextLine()) {
            return in.nextLine();
        }
        return null;
    }

    // Códigos de escape ANSI para colorear el texto en la consola
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
}


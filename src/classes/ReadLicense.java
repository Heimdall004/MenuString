package classes;

import java.io.File;
import java.util.Scanner;

/**
 * Clase ReadLicense.
 * Esta clase se encarga de leer el contenido de un archivo de licencia ubicado en "src/license".
 */
public class ReadLicense {

    /**
     * Método que lee el contenido del archivo de licencia.
     * @return Una cadena de texto que contiene todo el contenido del archivo de licencia.
     */
    public String readerLicense() {
        // StringBuilder para almacenar el contenido del archivo
        StringBuilder license = new StringBuilder();

        // Intentar leer el archivo de licencia
        try (Scanner in = new Scanner(new File("src/license"))) {
            // Leer cada línea del archivo y añadirla al StringBuilder
            while (in.hasNextLine()) {
                license.append(in.nextLine()).append(System.lineSeparator());
            }
        } catch (Exception e) {
            // Capturar y manejar cualquier excepción que ocurra durante la lectura del archivo
            System.err.println("An error occurred while reading the license file: " + e.getMessage());
        }

        // Devolver el contenido del archivo como una cadena de texto
        return license.toString();
    }
}

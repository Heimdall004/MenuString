# Text Processing Application

Este proyecto es una aplicación de procesamiento de texto que proporciona varias funcionalidades, tales como separar texto, encontrar la palabra más larga, verificar si un texto es un palíndromo, contar el número de palabras en un texto y leer un archivo de licencia.

## Estructura del Proyecto

El proyecto contiene las siguientes clases y una interfaz:

- `Separator`: Clase para separar cada carácter en una cadena con un espacio.
- `MaxWords`: Clase para encontrar la palabra más larga en una cadena de texto.
- `LengthText`: Clase para contar el número de palabras en una cadena de texto.
- `Palindrome`: Clase para verificar si una cadena de texto es un palíndromo.
- `ReadLicense`: Clase para leer y devolver el contenido de un archivo de licencia.
- `Menu`: Clase que proporciona una interfaz de menú para interactuar con las diferentes funcionalidades de texto.
- `GetText`: Interfaz que define un método para obtener texto.

## Instalación

1. Clona el repositorio en tu máquina local:
    ```sh
    git clone https://github.com/Heimdall004/Menu-String.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd Menu-String
    ```
3. Asegúrate de tener [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
4. Compila el proyecto:
    ```sh
    javac -d bin src/interfaces/GetText.java src/classes/*.java src/Menu.java App.java
    ```
5. Ejecuta el proyecto:
    ```sh
    java -cp bin App
    ```

## Uso

Al ejecutar la aplicación, se mostrará un menú con las siguientes opciones:

Opciones: 
1. Separador de texto 
2. Encontrar la palabra más larga 
3. Longitud del texto 
4. Es palíndromo
5. Licencia 
6. Salir 

Seleccione su opción:


### Descripción de las Opciones

1. **Separador de texto**: Separa cada carácter en la cadena de entrada con un espacio.
2. **Encontrar la palabra más larga**: Encuentra la palabra más larga en la cadena de entrada.
3. **Longitud del texto**: Cuenta el número de palabras en la cadena de entrada.
4. **Es palíndromo**: Verifica si la cadena de entrada es un palíndromo.
5. **Licencia**: Lee y muestra el contenido del archivo de licencia.
6. **Salir**: Sale del programa.
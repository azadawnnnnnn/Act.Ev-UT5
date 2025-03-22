package src.notasgestionusuarios;

import java.io.File;
import java.io.IOException;

public class GestorArchivos {

    // Método para crear el directorio y el archivo notas.txt
    static void crearDirectorioYArchivoNotas(String correoUsuario) {
        // Ruta base donde se crearán los directorios de los usuarios
        String rutaBase = "src/data/usuarios/";

        // Creamos el directorio con el correo del usuario
        File directorioUsuario = new File(rutaBase + correoUsuario);
        if (!directorioUsuario.exists()) {
            if (directorioUsuario.mkdirs()) {
                System.out.println("Directorio creado: " + directorioUsuario.getAbsolutePath());
            } else {
                System.out.println("Error al crear el directorio.");
                return;
            }
        }

        // Creamos el archivo notas.txt dentro del directorio del usuario
        File archivoNotas = new File(directorioUsuario, "notas.txt");
        if (!archivoNotas.exists()) {
            try {
                if (archivoNotas.createNewFile()) {
                    System.out.println("Archivo notas.txt creado: " + archivoNotas.getAbsolutePath());
                } else {
                    System.out.println("Error al crear el archivo notas.txt.");
                }
            } catch (IOException e) {
                System.out.println("Excepción al crear el archivo: " + e.getMessage());
            }
        }
    }
    
}

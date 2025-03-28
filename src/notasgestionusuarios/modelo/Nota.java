package src.notasgestionusuarios.modelo;

// Esta clase representa una nota con su título y contenido
public class Nota {
    // Variables para guardar el título y contenido de la nota
    private String titulo;
    private String contenido;

    // Constructor que pide el título y contenido
    public Nota(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Métodos get y set para acceder a las variables privadas
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Esto es para que se muestre el título en la lista
    @Override
    public String toString() {
        return titulo;
    }
}

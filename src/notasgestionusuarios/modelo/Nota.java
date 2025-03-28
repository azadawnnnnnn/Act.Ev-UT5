package src.notasgestionusuarios.modelo;

/* Clase para crear las notas */
public class Nota {
    // Variables de la nota
    private String titulo;
    private String contenido;

    // Constructor que pide el título y contenido
    public Nota(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Métodos getter y setter
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

    /* Esto es para que se vea el titulo en la lista */
    @Override
    public String toString() {
        return titulo;
    }
}

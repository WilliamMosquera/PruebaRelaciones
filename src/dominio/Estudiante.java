package dominio;

public class Estudiante {
    private String nombre;
    private int promedio;
    private String ID;

    public Estudiante(String nombre, int promedio, String ID) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}

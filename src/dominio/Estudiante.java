package dominio;

public class Estudiante {
    private String nombre;
    private int promedio;
    private String ID;
    private Materia materia;

    public Estudiante(String nombre, int promedio, String ID, Materia materia) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.ID = ID;
        this.materia = materia;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
}

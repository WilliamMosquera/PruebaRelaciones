package dominio;

public class Profesor {
    private String nombre;
    private String materia;
    private Facultad facultad;

    public Profesor(String nombre, String materia, Facultad facultad) {
        this.nombre = nombre;
        this.materia = materia;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
}

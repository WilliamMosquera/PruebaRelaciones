package dominio;

public class Carrera {
    private String nombre;
    private int numeroestutiantes;
    private String materias;
    private Facultad facultad;

    public Carrera(String nombre, int numeroestutiantes, String materias, Facultad facultad) {
        this.nombre = nombre;
        this.numeroestutiantes = numeroestutiantes;
        this.materias = materias;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroestutiantes() {
        return numeroestutiantes;
    }

    public void setNumeroestutiantes(int numeroestutiantes) {
        this.numeroestutiantes = numeroestutiantes;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    

    
}

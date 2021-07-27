package dominio;

public class Director {
    private String nombre;
    private String puesto;
    private Facultad facultad;

    public Director(String nombre, String puesto, Facultad facultad) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
}

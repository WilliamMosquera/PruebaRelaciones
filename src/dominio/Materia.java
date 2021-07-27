package dominio;

public class Materia {
    private String nombre;
    private String numerocreditos;
    private String horario;
    private Profesor profesor;

    public Materia(String nombre, String numerocreditos, Profesor profesor, String horario) {
        this.nombre = nombre;
        this.numerocreditos = numerocreditos;
        this.profesor = profesor;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumerocreditos() {
        return numerocreditos;
    }

    public void setNumerocreditos(String numerocreditos) {
        this.numerocreditos = numerocreditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}

import java.util.HashSet;

public class MiembroEquipo extends Usuario {
    private HashSet<Proyecto> proyectosEnCurso;

    public MiembroEquipo(String nombre,
                 String apellido,
                 String email,
                 String titulo,
                 HashSet<Proyecto> proyectosEnCurso) {
        super(nombre, apellido, email, titulo);
        this.proyectosEnCurso = proyectosEnCurso;
    }

    public HashSet<Proyecto> getProyectosEnCurso() {
        return proyectosEnCurso;
    }

    public void setProyectosEnCurso(HashSet<Proyecto> proyectosEnCurso) {
        this.proyectosEnCurso = proyectosEnCurso;
    }
}

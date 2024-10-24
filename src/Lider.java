import java.util.ArrayList;
import java.util.HashSet;

public class Lider extends Usuario {
    private HashSet<Proyecto> proyectosEnCurso;
    private ArrayList<MiembroEquipo> miembrosACargo;

    public Lider(String nombre,
                 String apellido,
                 String email,
                 String titulo,
                 HashSet<Proyecto> proyectosEnCurso,
                 ArrayList<MiembroEquipo> miembrosACargo) {
        super(nombre, apellido, email, titulo);
        this.proyectosEnCurso = proyectosEnCurso;
        this.miembrosACargo = miembrosACargo;
    }

    public HashSet<Proyecto> getProyectosEnCurso() {
        return proyectosEnCurso;
    }

    public void setProyectosEnCurso(HashSet<Proyecto> proyectosEnCurso) {
        this.proyectosEnCurso = proyectosEnCurso;
    }

    public ArrayList<MiembroEquipo> getMiembrosACargo() {
        return miembrosACargo;
    }

    public void setMiembrosACargo(ArrayList<MiembroEquipo> miembrosACargo) {
        this.miembrosACargo = miembrosACargo;
    }
}

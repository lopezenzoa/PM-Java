import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Lider> lideresACargo;

    public Administrador(String nombre,
                         String apellido,
                         String email,
                         String titulo,
                         ArrayList<Lider> lideresACargo) {
        super(nombre, apellido, email, titulo);
        this.lideresACargo = lideresACargo;
    }

    public ArrayList<Lider> getLideresACargo() {
        return lideresACargo;
    }

    public void setLideresACargo(ArrayList<Lider> lideresACargo) {
        this.lideresACargo = lideresACargo;
    }
}

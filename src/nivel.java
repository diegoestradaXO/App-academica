import java.util.ArrayList;
import java.util.List;

public class nivel {
    private String nombre;
    List<String> Niveles = new ArrayList<String>();

    //constructor
    public nivel(String nombre, Integer index){
        this.nombre = nombre;
        Niveles.add(index, nombre);
    }
    //Setters and getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

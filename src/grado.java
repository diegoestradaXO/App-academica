import java.util.ArrayList;
import java.util.List;

public class grado {
    private String nombre;
    List<String> Grados = new ArrayList<String>();

    //Constructor
    public grado (String nombre, Integer index){
        this.nombre = nombre;
        Grados.add(index, nombre);

    }
    //Setters and getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

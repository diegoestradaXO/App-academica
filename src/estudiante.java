public class estudiante {
    private String nombre;
    private Integer codigo;

    //Constructor
    public estudiante(String nombre, Integer codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    //Setters and getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

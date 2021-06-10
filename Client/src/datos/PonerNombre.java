package datos;

public abstract class PonerNombre {
    private String nombre = "";
    public PonerNombre() {
        super();
    }
    
    public abstract void ponerNombre();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

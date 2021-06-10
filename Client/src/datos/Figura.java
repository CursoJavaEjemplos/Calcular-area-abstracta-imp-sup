package datos;

public class Figura {
    
    private Float altura = 4f;
    private Float base = 3f;
    private Float resultado = 0f;
    
    private PonerNombre newAtt2;

    public Figura() {
        super();
    }


    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getBase() {
        return base;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }

    public Float getResultado() {
        return resultado;
    }

    public void setNombre(String nombre) {
        
        newAtt2 = new PonerNombre() {

            @Override
            public void ponerNombre() {
                // TODO Implement this method
                this.setNombre(nombre);
            }
        };
    }

}

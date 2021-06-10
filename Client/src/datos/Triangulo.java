package datos;


public class Triangulo extends Figura  {


    public Triangulo() {
        super();
    }
    
    public Float resultado(){
        
        Float a=this.getAltura();
        Float b=this.getBase();
        Float r = (a * b)/2;
        
        this.setNombre("Tri");
        
        return r;
    }
    
   
    
}

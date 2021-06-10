package datos;

import javax.swing.JOptionPane;


public class Rectangulo extends Figura {


    public Rectangulo() {
        super();
    }

    
    public Float resultado(){
        
        Float a= this.getAltura();
        Float b= this.getBase();
        
       this.setNombre("Rec");
        
        return a * b ;
    }
    
      
}

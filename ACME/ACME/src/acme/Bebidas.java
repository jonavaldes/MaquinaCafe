
package acme;

public abstract class Bebidas {
   
   private int cantAzucar;
   private int cantLeche;

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    
    public int getCantLeche() {
        return cantLeche;
    }

   
    public void setCantLeche(int cantLeche) {
        this.cantLeche = cantLeche;
    }
    @Override
    public String toString() {
        return getClase() 
                +","+getDescripcion()+
                ",azúcar x"+getCantAzucar()+
                ",leche x"+getCantLeche();
    }
    
    public abstract String getDescripcion();
    
    public abstract double getPrecio();
    
    public abstract String getClase();

}


package practicoa;

public class Hoxe {
   
    private Pelicula peli = new Pelicula(); // tamen Pelicula peli ; 

    public Hoxe(Pelicula peli) {
        this.peli = peli;
    }

      
    
    public void visualiza(){
        System.out.println( peli.toString());
    } 
    
    public void rebaixa(float porcentaxe ){
       float prezoRebaixado = peli.getPrezo()*((100-porcentaxe)/100);
       peli.darPrezo(prezoRebaixado);  // cambiolle o prezo o novoPrezoRebaixado
        System.out.println("prezo rebaixado = "+ prezoRebaixado);
    }
    
    
    
    
    
    
    
    
    
    
    
}


package practicoa;

public class Pelicula {
    //atributos
    private String titulo;
    private float prezo;
    //constructores

    public Pelicula() {  // para crear o obxecto ó declaralo na clase Hoxe
    }
    
    public Pelicula(String titulo, float prezo) {
        this.titulo = titulo;
        this.prezo = prezo;
    }
    public void darPrezo(float pre){
      prezo = pre;  
    }
    
    public float getPrezo() {  // preciso para o metodo rebaixa
        return prezo;
    }
    

    @Override
    public String toString() {
        return  "titulo=" + titulo + ", prezo=" + prezo ;
    }
    
    
}

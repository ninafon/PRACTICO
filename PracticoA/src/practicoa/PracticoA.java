 
package practicoa;

import javax.swing.JOptionPane;

public class PracticoA {

    public static void main(String[] args) {
      
        //instanciamos oxectos peli1 cos datos indicados
        Pelicula peli1 = new Pelicula("contos de Vigo",15.30f);
        // cambiamoslle o prezo a peli e visualizamos titulo e prezo
        Hoxe obxHoxe = new Hoxe (peli1);
        obxHoxe.visualiza(); // amosamos os datos iniciais
        float p = pedirPrezoValidado();
        peli1.darPrezo(p); // tamén peli1.darPrezo(pedirPrezoValidado() ;
        obxHoxe.visualiza();
        obxHoxe.rebaixa(20);
        obxHoxe.visualiza();
        
        
    }
        
    
    public static float pedirPrezoValidado(){
        float pre ;
        do{
            pre= Float.parseFloat(JOptionPane.showInputDialog(" teclea prezo > 0 "));
        }while(pre <0);
        return pre;
    }
    
    
    
}

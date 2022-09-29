package practica8;
//importaremos una libreria JOptiopnPane para abrir cuadros de dialogo
import javax.swing.JOptionPane;
public class PRACTICA8 {
String mensaje;
public PRACTICA8(){
    String valor_cadena=JOptionPane.showInputDialog(null,"escribe un numero entero: ");
    try{
        /*
        se crea un try cath con un metodo parseInt()para convertir un string
        en un entero
        */
        int valorNumero=Integer.parseInt(valor_cadena);
        mensaje="gracias";
        
          }catch(NumberFormatException ex){ //inidica un error capturado si es que lo existe
               mensaje="no escribiste un numero entero";
          }
    JOptionPane.showMessageDialog(null, mensaje);
    
}
    public static void main(String[]args){
    new PRACTICA8();
    
}
    
}

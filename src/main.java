
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AngelZarate
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        InterfazPrincipal ip;
        LogInDialog li;
        boolean end = false;
        do{
            li = new LogInDialog(null, true);
            li.setLocationRelativeTo(null);
            li.setVisible(true);
            end = !li.getAcceso();
            if(li.getAcceso()){
                ip = new InterfazPrincipal(null, true, li.getUsuario(), li.getPassword());
                ip.setLocationRelativeTo(null);
                ip.setVisible(true);
            }
        }while(end == false);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercsudp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Ramalho
 */
public class ExercsUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here

            ServidorUDP s = new ServidorUDP(8080);
            ClienteUDP c = new ClienteUDP(8080);

        } catch (Exception ex) {
            Logger.getLogger(ExercsUDP.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }
    
    
    
}

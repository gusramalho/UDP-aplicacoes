/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercsudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Carlos Ramalho
 */
public class ServidorUDP extends Thread {
    
    

    private DatagramSocket serverSocket;
    
    public ServidorUDP(int porta) throws Exception {
   
        this.serverSocket = new DatagramSocket(porta);
        
    }

    @Override
    public void run(){
        
        byte[] dadosRecebidos = new byte[1024];
        System.out.println("Aguardando mensagens...");
        
        while (1 != 0){
            
            DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos, dadosRecebidos.length);
            
            try{
                 serverSocket.receive(pacoteRecebido);     
                 String mensagem = new String(pacoteRecebido.getData());
                 System.out.println(mensagem + " --" + pacoteRecebido.getAddress().toString());
                 
            }catch(Exception err){
                
                System.out.println("Erro ao receber pacote: " + err.getMessage());            
            }


            
        }
    }
    
}

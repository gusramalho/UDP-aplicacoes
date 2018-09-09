/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercsudp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Ramalho
 */
public class ClienteUDP extends Thread{

    private BufferedReader reader;
    private int portaDestino;
    
    
    
    public ClienteUDP(int portaDestino){
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.portaDestino = portaDestino;
               
    }
    
    @Override
    public void run() {
        
       while (true){
                    
           System.out.println("Digite uma mensagem para o servidor:");
           
           try {
               String mensagem = reader.readLine();
               InetAddress IPAddress = InetAddress.getByName("localhost");
               DatagramPacket pacote = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, IPAddress, portaDestino);                 
           } catch (Exception ex) {
               System.out.println("Erro ao envia mensagem para o servidor: " + ex.getMessage());
           }
           
       }
    }   
}

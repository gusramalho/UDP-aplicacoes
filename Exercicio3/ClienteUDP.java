

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteUDP {

    public static void main(String args[]) throws Exception{
        
        
       BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
       int portaDestino = 9876;
       String endereco;

       System.out.println("Endereço do servidor: ");
       endereco = reader.readLine();
       
       System.out.println("");
       
       System.out.println("Porta: ");
       portaDestino = Integer.parseInt(reader.readLine());

       System.out.println("");
       while (true){

                    
           System.out.println("Digite uma mensagem para o servidor:");
           
           try {
               String mensagem = reader.readLine();
               InetAddress IPAddress = InetAddress.getByName(endereco);
               DatagramPacket pacote = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, IPAddress, portaDestino);
               DatagramSocket clienteSocket = new  DatagramSocket();
               clienteSocket.send(pacote);
               clienteSocket.close();

           } catch (Exception ex) {
               System.out.println("Erro ao envia mensagem para o servidor: " + ex.getMessage());
           }
           
       }
    }   
}

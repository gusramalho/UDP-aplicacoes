
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ServidorUDP {
    
       
    public static void main(String[] args) throws Exception{
        

       BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int porta;

        System.out.println("Porta: ");
        porta = Integer.parseInt(reader.readLine());
        System.out.println("");
        DatagramSocket serverSocket = new DatagramSocket(porta);
        System.out.println("Aguardando mensagens...");
        
        while (true){
            

            
            try{
                 byte[] dadosRecebidos = new byte[1024];
                 DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos, dadosRecebidos.length);
                 serverSocket.receive(pacoteRecebido);     
                 String mensagem = new String(pacoteRecebido.getData());
                 System.out.println(pacoteRecebido.getAddress().toString() + ":" + pacoteRecebido.getPort() + " >> " + mensagem.trim() );


                 
            }catch(Exception err){
                
                System.out.println("Erro ao receber pacote: " + err.getMessage());            
            }


            
        }
    }
    
}

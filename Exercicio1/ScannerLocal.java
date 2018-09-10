
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ScannerLocal{

	public static void main(String[] args){


          for(int port = 1; port <= 65535; port++){
          	try{

          		DatagramSocket server = new DatagramSocket(port);
				server.close();

          	}catch(Exception err){

          		System.out.println("Porta " + port + "  esta ocupada.");
          	}


          }
	}
}
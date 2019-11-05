import javax.jws.soap.SOAPBinding;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class Trabalhador extends Thread {

    private Socket t;

    public Trabalhador(Socket t){

        this.t = t;
    }

    public void run()
    {
        try
        {
            DataInputStream entrada = new DataInputStream(t.getInputStream());
            String clientIP;
            int port;

            clientIP = entrada.readUTF();
            port = entrada.readInt();
            System.out.println("\nIP: " + clientIP + "\nPorta: " +  port);

            Thread.sleep( 5000 );

            System.out.println("Servidor: conexao encerrada");
            t.close();
        }
        catch( Exception e )
        {
            e.printStackTrace();
            System.out.println(e);
        }

    }

}

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

    public static void main(String[] args) {

        ArrayList<User> uList = new ArrayList<>();

        try {
            ServerSocket ss = new ServerSocket( 3 );
            while(true)
            {
                System.out.println("Servidor aguardando um cliente ...");
                Socket t = ss.accept();


                System.out.println("Servidor: conexao feita");

                Trabalhador trab = new Trabalhador(t);
                trab.start();
            }
            //ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

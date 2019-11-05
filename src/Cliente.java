import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Cliente {


    public static void main(String[] args) {
        int port = 3;
        String clientIP = "localhost";
        Scanner sc = new Scanner(System.in);

        try {

            Socket s = new Socket(clientIP, port);
            System.out.println( "Cliente: conexao feita" );

            DataOutputStream saida = new DataOutputStream(s.getOutputStream());
            saida.writeUTF(clientIP);
            saida.writeInt(port);

            while(!sc.next().equals("exit")){
            }
            s.close();
            System.out.println( "Cliente: conexao encerrada");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

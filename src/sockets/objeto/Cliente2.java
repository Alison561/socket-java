package sockets.objeto;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente2 {

    public static void main(String[] args) throws IOException {
        //1 - Abrir conexão
        Socket socket2 = new Socket("127.0.0.1", 5000);
        
        //2 - Definir stream de saída de dados do cliente
        ObjectOutputStream saida = new ObjectOutputStream(socket2.getOutputStream());
        System.out.println("teste");
        int var2 = 2;
        saida.writeObject(var2);

        //4 - Fechar streams de saída de dados
        saida.close();

        //5 - Fechar o socket
        //socket.close();
    }
}

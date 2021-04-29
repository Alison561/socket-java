package sockets.objeto;
import java.util.Scanner;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
	
	public static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	
    	
    	
    	//1 - Abrir conex√£o
        Socket socket = new Socket("127.0.0.1", 5000);
        
        //2 - Definir stream de sa√≠da de dados do cliente
        ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
        int var1 = 1;
        saida.writeObject(var1);
        
        System.out.println("Gostaria de ver a lista de votaÁ„o ?\n");
    	System.out.println("1-SIM    2-N√O"); 
        int var2 = myObj.nextInt();   
        saida.writeObject(var2);
        
        System.out.println("Escolha seu candidato");
        int var3 = myObj.nextInt();
        saida.writeObject(var3);
        //4 - Fechar streams de sa√≠da de dados
        saida.close();
        
        //5 - Fechar o socket
        socket.close();
        
       
    }
}

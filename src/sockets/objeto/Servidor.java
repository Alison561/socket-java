package sockets.objeto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static int candidato1 = 0;
	public static int candidato2 = 0;
	public static int candidato3 = 0;
	public static int candidato4 = 0;
	public static int nulo = 0;
	
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
         
        while(true) {
        	//1 - Definir o serverSocket (abrir porta de conexÃ£o)
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Servidor esperando receber objeto de cliente...\n");
        //2 - Aguardar solicitaÃ§Ã£o de conexÃ£o de cliente
        Socket socket = serverSocket.accept();
       
            
        //3 - Definir stream de entrada de dados no servidor
        ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
        //Pessoa p = (Pessoa) entrada.readObject();
        
        //pegando o tipo de cliente
        int cliente = (Integer) entrada.readObject();
        
        //verificando o tipo de cliente
        if (cliente == 1) {
        //
        	
        	cliente = (Integer) entrada.readObject();
        	if(cliente == 1) {
        		System.out.println("LISTA DE CANDIDATOS\n\n");
        		System.out.println("1 - Bolsonaro\n");
        		System.out.println("2 - Lula\n");
        		System.out.println("3 - Danilo Gentili\n");
        		System.out.println("4 - Luciano Huck\n");
        		System.out.println("5 - Nulo\n");
        		cliente = (Integer) entrada.readObject();
        		switch (cliente) {
        		case 1:
	        		self:candidato1 ++;
	        		System.out.println("Você votou em Bolsonaro\n");
	        		break;
        		
        		case 2:
        			self:candidato2 ++;
        			System.out.println("Você votou em Lula\n");
	            	break;
            	
        		case 3:
        			self:candidato3 ++;
        			System.out.println("Você votou em Danilo Gentili\n");
                	break;
                	
        		case 4:
        			self:candidato4 ++;
        			System.out.println("Você votou em Luciano Huck\n");
                	break;
                	
        		case 5:
        			self:nulo ++;
        			System.out.println("Você votou nulo\n");
                	break;
        		default:
        			System.out.println("OPÇÃO INVÁLIDA");
        		};
        		
        	}else {
        		cliente = (Integer) entrada.readObject();
        		switch (cliente) {
        		case 1:
	        		self:candidato1 ++;
	        		System.out.println("Você votou em Bolsonaro\n");
	        		break;
        		
        		case 2:
        			self:candidato2 ++;
        			System.out.println("Você votou em Lula\n");
	            	break;
            	
        		case 3:
        			self:candidato3 ++;
        			System.out.println("Você votou em Danilo Gentili\n");
                	break;
                	
        		case 4:
        			self:candidato4 ++;
        			System.out.println("Você votou em Luciano Huck\n");
                	break;
                	
        		case 5:
        			self:nulo ++;
        			System.out.println("Você votou nulo\n");
                	break;
        		default:
        			System.out.println("OPÇÃO INVÁLIDA");
        		};
        		
        	}
        
        }else {
        	System.out.println("Lista de votos dos Candidados:\n");
        	System.out.println("Bolsonaro " + candidato1 + " votos");
    		System.out.println("Lula " + candidato2 + " votos");
    		System.out.println("Danilo Gentili " + candidato3 + " votos");
    		System.out.println("Luciano Hulk " + candidato4 + " votos");
    		System.out.println("Votaram Nulo " + nulo + " pessoas");
    		/*entrada.close();
    		socket.close();
    	    serverSocket.close();*/
        } 
        
        
		
        //5 - Fechar streams de entrada de dados
        entrada.close();
            
        //6 - Fechar sockets de comunicaÃ§Ã£o e conexÃ£o
        socket.close();
        serverSocket.close();
        }
    }
}

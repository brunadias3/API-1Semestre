package DAO;

	
import java.sql.Connection; 
import java.sql.SQLException; 


public class TesteConexao {    
	    public static void main(String[] args) throws SQLException {
	         Connection connection = new Conexao().getConnection();
	         System.out.println("Conex�o aberta!");
	         connection.close();
	     }
	}


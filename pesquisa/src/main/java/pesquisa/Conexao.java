package pesquisa;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
		
		//Método de conexão 
		public static Connection getConexao(){
			
			//Cria conexão com Banco de dados
			try {Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql:pbd","postgres", "gnu");
			} catch (Exception e) {
			e.printStackTrace();
			return null;
			}
			}
			
}


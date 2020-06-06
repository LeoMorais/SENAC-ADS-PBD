package pbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Principal {
	
	public static void main(String[] args) {
	
	Cliente cliente = new Cliente();
	ClienteDao clienteDao = new ClienteDao();
	
	//Manipulação dos dados do cliente
	//cliente.setNome("leo");
	//cliente.setEndereco("Rua 20, Goiânia");
	//cliente.setTelefone("991122897");
	
	//Inseri novo cliente
	//clienteDao.inserir(cliente);
	
	//Listar clientes
	//clienteDao.listar();
	
	//Filtros
	//clienteDao.filtronome("leo");
	
	//Update
	//cliente.setNome("Jose");
	//cliente.setEndereco("Rua 20, Goiânia");
	//cliente.setTelefone("991122897");
	//clienteDao.update(2, cliente);
	
	//Delete
	//clienteDao.delete(3);
	}
}

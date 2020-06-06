package pbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ClienteDao {
	
	//Inserir novo cliente
	public void inserir(Cliente cliente){
		try {
			Connection con = Conexao.getConexao();
			try {
				PreparedStatement pstmt = con.prepareStatement("insert into cliente (nome, endereco, telefone) values (?, ?, ?)");
				pstmt.setString(1, cliente.getNome());
				pstmt.setString(2, cliente.getEndereco());
				pstmt.setString(3, cliente.getTelefone());
				pstmt.executeUpdate();
			} finally {
				con.close();
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Linstar Clientes
	public void listar(){
		try{
			Connection con = Conexao.getConexao();
			try{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from cliente");
				while(rs.next()){
					System.out.printf("%s - %s - %s - %s\n", rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getString("telefone"));
				}
			}finally {
				con.close();
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void filtronome(String nome){
		try{
			Connection con = Conexao.getConexao();
			try{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from cliente where nome = '"+nome+"'");
				while(rs.next()){
					System.out.printf("%s - %s - %s - %s\n", rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getString("telefone"));
				}
			}finally {
				con.close();
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(int id, Cliente cliente){
		try {
			Connection con = Conexao.getConexao();
			try {
				PreparedStatement pstmt = con.prepareStatement("update cliente set nome = ? where id = ?");
				pstmt.setString(1, cliente.getNome());
				pstmt.setInt(2,id);
				//pstmt.setString(3, cliente.getTelefone());
				pstmt.executeUpdate();
			} finally {
				con.close();
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id){
		try {
			Connection con = Conexao.getConexao();
			try {
				PreparedStatement pstmt = con.prepareStatement("delete from cliente where id = ?");
				pstmt.setInt(1,id);
				pstmt.executeUpdate();
			} finally {
				con.close();
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
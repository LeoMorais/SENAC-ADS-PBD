package pesquisa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PesquisaDao {

	//Inserir nova instacia na pesquisa
		public void inserir(Pesquisa pesquisa){
			try {
				Connection con = Conexao.getConexao();
				try {
					PreparedStatement pstmt = con.prepareStatement("insert into pesquisa (computadorcasa, rendamensal, transporte, avaliacao) values (?, ?, ?, ?)");
					pstmt.setString(1, pesquisa.getComputadorcasa());
					pstmt.setString(2, pesquisa.getRendamensal());
					pstmt.setString(3, pesquisa.getTransporte());
					pstmt.setInt(4, pesquisa.getAvaliacao());
					pstmt.executeUpdate();
				} finally {
					con.close();
				}
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//Listar formularios
		public void listar(){
			try{
				Connection con = Conexao.getConexao();
				try{
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from pesquisa");
					while(rs.next()){
						System.out.printf("%s - %s - %s - %s\n", rs.getInt("id"), rs.getString("computadorcasa"), rs.getString("rendamensal"), rs.getString("transporte"), rs.getString("avaliacao"));
					}
				}finally {
					con.close();
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		
		
		public void update(int id, Pesquisa pesquisa){
			try {
				Connection con = Conexao.getConexao();
				try {
					PreparedStatement pstmt = con.prepareStatement("update pesquisa set avaliacao = ? where id = ?");
					pstmt.setInt(1, pesquisa.getAvaliacao());
					pstmt.setInt(2,id);
					pstmt.executeUpdate();
				} finally {
					con.close();
				}
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

}
		


package pesquisa;


public class Principal {

	public static void main(String[] args) {
		
	Pesquisa pesquisa = new Pesquisa();
	PesquisaDao pesquisaDao = new PesquisaDao();
	
	//Manipulação dos dados do cliente
	//pesquisa.setComputadorcasa("Sim");
	//pesquisa.setRendamensal("MAIS DE 4.000");
	//pesquisa.setTransporte("MOTO");
	//pesquisa.setAvaliacao(9);
	//pesquisa.setDescobriufaculdade("TELEVISAO");

	
	//Inseri novo cliente
	//pesquisaDao.inserir(pesquisa);
	
	//Listar clientes
	pesquisaDao.listar();
}
}
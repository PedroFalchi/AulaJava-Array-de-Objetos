package Array_objetos;

public class App {
	
	public static void main(String[] args) {
		
		//instanciando a classe Gerenciador de Contatos
		GerenciadorContatos gc = new GerenciadorContatos(5);
		gc.adicionarContatos();  //chamar ou criar
		gc.listarContatos(); 
	}

}

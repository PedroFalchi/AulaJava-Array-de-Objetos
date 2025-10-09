package Array_objetos;

import java.util.Scanner;

public class GerenciadorContatos {
	
	//atributos da classe
	private Contato[] contatos;  //lista de contatos
	private Scanner input; //declaracao de um Scanner (input)
	
	
	//construtor
	public GerenciadorContatos(int qtde) { 
		System.out.println("*** Lista criada com " + qtde + " contatos ****;");
		System.out.println("================================");
		contatos = new Contato[qtde]; //instanciando uma lista com qtde elementos
	}
	
	//metodos operacionais
	//criar contato
	public Contato criarContato() {
		System.out.println("---CRIANDO UM CONTATO--");
		System.out.println("=====================");
		
		//alocando memoria para um Scanner
		input = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Nome- ");
		String nome = input.next();
		System.out.println("Telefone- ");
		String telefone = input.next();
		
		//instanciando um objeto Contato - como eu crio 
		//Maiuscula=classe , minusc.= objeto
		Contato contato = new Contato(nome, telefone);
		
		//retorna o contato criado
		return contato;
	}
	
	//metodo para adicionar um contato criado
	public void adicionarContatos() {
		System.out.println("***Adicionando contato***");
		System.out.println("==================");
		for(int i=0; i<contatos.length; i++) {
			//adicionar o objeto contato no arrayde contatos
			contatos[i] = criarContato();
		}
	}
	   //metodo para listar os contatos do array (lista)
	public void listarContatos() {
		System.out.println("*** LISTANDO OS CONTATOS ***");
		System.out.println("===========================");
		
		//percorrendo a lista contatos - elemento por elemento
		for(int i=0; i < contatos.length; i++) {
			//System.out.println("Nome: " + contatos[i].getNome());
			//System.out.println("Telefone: " + contatos[i].getTelefone()); Fazer assim ou como esta abaixo:
			System.out.println(contatos[i].toString());
		}
	}
	
	
}



package Array_objetos;

public class ListaAlunos {
	
	//atributos  //colchetes caracteriza que é um array
	private Aluno[] alunos; // declaração de um array de objetos do tipo Aluno
	private int i = 0; //variável de controle do índice do array

	//construtor
	public ListaAlunos(int qtde) {
		System.out.println("*--* Lista criada! *--*");
		
		//instanciando o array alunos
		alunos = new Aluno[qtde];
	}
	
	//inserir um aluno na lista alunos
	public String inserir(Aluno aluno) { //(Aluno aluno = classe e tipo)
		
		if(aluno != null) {
		alunos[i] = aluno;
		i++;
		return "Aluno inserido na lista!";
		}else {
			return "Aluno não inserido!";
		}
	}
	
	//Listar os alunos do array
	public void listar() {
		for(int i=0; i<alunos.length; i++) { //começa no 0; percorre a lista; aumenta de 1 em 1
			System.out.println(alunos[i].toString());
		}
	}
	
}

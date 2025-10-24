package Array_objetos;

public class ListaAlunosTeste {
	public static void main(String[]args) {
		
		//criando uma lista de Aluno
		ListaAlunos lista = new ListaAlunos(3);
		
		//criando um aluno
		Aluno a1 = new Aluno(1, "Marcão", "1TDSPS", 8);
		
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Turma: " + a1.getTurma());
		System.out.println("Média: " + a1.getMedia());
		a1.setMedia(9);
		
		System.out.println("==============================");
		
		System.out.println(a1.toString());
		
		System.out.println("==============================");
		
		
		Aluno a2 = new Aluno(2, "Allyson", "1TDSPS", 9);
		Aluno a3 = new Aluno(3, "Andrews", "1TDSPS", 10);
		
		//inserirndo os objetos do tipo Aluno (a1, a2, a3) na lista
		lista.inserir(a1);
		lista.inserir(a2);
		lista.inserir(a3);
		
		//imprimindo os elementos presentes na lista
		lista.listar();
	
		
	}
}

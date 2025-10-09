package Array_objetos;

public class Contato {
	
	//atributos
	private String nome;
	private String telefone;
	
	//construtor
	public Contato(String nome, String telefone) {
		System.out.println("Objeto criado");
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
	}
	

	
	
}

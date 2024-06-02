package Pessoa;

public abstract class Pessoa {
	private String cpf;
	private String nome;
	private int idade;
	
	public Pessoa (String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa () {
		
	}
	
	public String getCpf() {
		return cpf ;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public int IncrementarIdade() {
		int Novaidade = this.idade + 1;
		setIdade(Novaidade);
		return Novaidade;
		
	}
	public void FazerAniversario() {
			 IncrementarIdade();
		}
	
	
	
	public abstract void exibirInformacoes();
	
}

	

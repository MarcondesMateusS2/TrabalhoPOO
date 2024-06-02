package Pessoa;

public class Aluno extends Pessoa {
	
	private String matricula;
	
	
	
	public Aluno(String cpf, String nome, int idade, String matricula) {
		super(cpf, nome, idade);
		this.matricula = matricula;
	}

	public String getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void PagarMensalidade() {
		
		
		}

	@Override
	public void exibirInformacoes() {
		
		
	}

}

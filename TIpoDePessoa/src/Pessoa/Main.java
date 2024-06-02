package Pessoa;



public class Main {
				//3 objetos Disciplina
	public static void main(String[]args) {
		Disciplina disciplina = new Disciplina("2415647", "Marcondes Mateus",1);
		disciplina.exibirInformacoes();
		
				//1 objeto professor
		 	 	 
		Professor pessoa = new Professor ("2415647", "Mario",5, "CCT");
		pessoa.exibirInformacoes();
		System.out.println(pessoa.getIdade());
		pessoa.FazerAniversario();
		System.out.println(pessoa.getIdade());
		
				//3 objetos aluno (2 regulares e 1 bolsista
		
		 Aluno aluno1 = new Regular();
	     Aluno aluno2 = new Regular();
	     Aluno aluno3 = new Bolsistas();

	        
	     System.out.println("Informações do Aluno 1:");
	     aluno1.exibirInformacoes();
	     System.out.println();

	     System.out.println("Informações do Aluno 2:");
	     aluno2.exibirInformacoes();
	     System.out.println();

	     System.out.println("Informações do Aluno 3:");
	     aluno3.exibirInformacoes();
	     
	}
	
}


		
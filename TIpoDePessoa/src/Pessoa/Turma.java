package Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	String codigo;
	Disciplina disciplina; 
	Professor professor;
	List<Aluno> alunos = new ArrayList<>();
	
	public Turma(){
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void adicionarAluno(Aluno aluno){
		alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno){
		alunos.add(aluno);
	}
	
	public List<Aluno>listarAlunos(){
		for(Aluno x:alunos){
			
		}
	}
}
	
	
	
	 
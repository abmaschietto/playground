package br.com.tdv.playground.newbuilders;

public class Main {

	public static void main(String[] args) {
		
		//finge que isso veio de um front end
		
		AlunoDto alunoDto = new AlunoDto("Artur", "artur.b.m", 27);
		
		AlunoDirectorBuilder director = new AlunoDirectorBuilder();
		Aluno constructAluno = director.constructAluno(alunoDto);
		System.out.println(constructAluno);
	}
}

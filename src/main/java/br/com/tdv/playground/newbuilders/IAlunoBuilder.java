package br.com.tdv.playground.newbuilders;

public interface IAlunoBuilder {
	
	AlunoBuilder setNome(String nome);
	AlunoBuilder setEmail(String email);
	AlunoBuilder setIdade(Integer idade);
	Aluno createAluno();

}

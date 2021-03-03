package br.com.tdv.playground.newbuilders;

public class AlunoBuilder implements IAlunoBuilder{
	
	private String nome;
	
	private String email;
	
	private Integer idade;

	@Override
	public AlunoBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}

	@Override
	public AlunoBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	@Override
	public AlunoBuilder setIdade(Integer idade) {
		this.idade = idade;
		return this;
	}

	@Override
	public Aluno createAluno() {
		Aluno aluno = new Aluno(nome, email, idade);
		return aluno;
	}

}

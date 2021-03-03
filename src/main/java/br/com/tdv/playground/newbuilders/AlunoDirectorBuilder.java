package br.com.tdv.playground.newbuilders;

public class AlunoDirectorBuilder {
	
	public Aluno constructAluno(AlunoDto alunoDto){
		AlunoBuilder builder = new AlunoBuilder();
		Aluno createAluno = builder.setEmail(alunoDto.getEmail())
		.setIdade(alunoDto.getIdade())
		.setNome(alunoDto.getNome())
		.createAluno();
		return createAluno;
	}

}

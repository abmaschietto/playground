package br.com.tdv.playground.newbuilders;

import javax.management.InvalidAttributeValueException;

public class Aluno {

	private String nome;
	
	private EmailVO email;
	
	private Integer idade;

	public Aluno(String nome, String email, Integer idade) {
		super();
		this.nome = nome;
		try {
			this.email = new EmailVO(email);
		} catch (InvalidAttributeValueException e) {
			System.out.println(e.getMessage());
		}
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public EmailVO getEmail() {
		return email;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	
}

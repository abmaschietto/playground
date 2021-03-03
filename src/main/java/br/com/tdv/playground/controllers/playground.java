package br.com.tdv.playground.controllers;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class DadosCliente {
	 private String nomeCliente;
	 private Integer numeroConta;
	 private LocalDateTime criacaoConta;
	public DadosCliente(String nomeCliente, Integer numeroConta, LocalDateTime criacaoConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.criacaoConta = criacaoConta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public LocalDateTime getCriacaoConta() {
		return criacaoConta;
	}
	public void setCriacaoConta(LocalDateTime criacaoConta) {
		this.criacaoConta = criacaoConta;
	}
	@Override
	public String toString() {
		return "Cliente " + nomeCliente + ", numero conta: " + numeroConta + ", conta criada em: " + criacaoConta;
	}
 }

public class playground {
	 public static void main(String[] args) {
		DadosCliente artur = new DadosCliente("Artur", 1223, LocalDateTime.of(1995, 10, 30, 0, 0));
		DadosCliente jonson = new DadosCliente("Jonson", 121212, LocalDateTime.of(1998, 10, 30, 0, 0));
		DadosCliente pepe = new DadosCliente("Pepe", 765, LocalDateTime.of(1989, 10, 30, 0, 0));
		DadosCliente peepo = new DadosCliente("Peepo", 76477, LocalDateTime.of(2010, 10, 30, 0, 0));
		List<DadosCliente> listaMockap = Arrays.asList(artur, jonson, pepe, peepo);
		List<DadosCliente> listaFiltrada = new ArrayList<>();
		listaMockap.stream().filter(cliente -> cliente.getCriacaoConta()
				.isAfter(LocalDateTime.of(1997, 01, 01, 0, 0))).forEachOrdered(listaFiltrada::add);
		listaFiltrada = listaFiltrada.stream().sorted(comparing(DadosCliente::getNomeCliente)).collect(toList());
		listaFiltrada.forEach(System.out::println);
	}
}

package br.com.tdv.playground.services;

import java.util.Arrays;
import java.util.List;

public class TESTE {
	
	public static void main(String[] args) {
//		String teste =  "Bumbumzinho";
//		
//		String substring = teste.substring(2, 5);
//		System.out.println( (teste.getClass() == Character.class));
		List<String> lista = Arrays.asList("Artur");
		if(lista.size()>0) {
			System.out.println("hmmmmmmm paozinho");
			System.out.println(lista.size());
			System.out.println(lista.get(0));
		}
		String array [] = {"Artur", "Kaique"};
		List<Object> list = Arrays.asList("Artur", "Kaique");
		String string = array[1];
		list.forEach(linha -> System.out.println(linha));
		Integer teste = 11;
		list.add(teste);
		list.forEach(linha -> System.out.println(linha));
		
	}
	

}

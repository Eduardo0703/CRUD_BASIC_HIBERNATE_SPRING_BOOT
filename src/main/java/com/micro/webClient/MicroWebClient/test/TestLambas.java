package com.micro.webClient.MicroWebClient.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambas {
	
	private List<String> lista;
	private List<String> numeros;
	
	
	public TestLambas() {
		
		lista = new ArrayList<>();
		lista.add("Miro");
		lista.add("Code");
		lista.add("Jaime");
		lista.add("MitoCode");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	public void filtrar() {
		List<String> filer = new ArrayList<String>();
		filer = lista.stream().filter(x -> x.startsWith("M")).collect(Collectors.toList());
		
		System.out.println(filer.size());
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
		lista.stream().filter(x -> x.startsWith("M")).forEach(x->System.out.println("Hola: "+x));
	}
	
	public void ordenar() {
		lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println); //Order desendente
	}
	
	public void transformar() {
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		numeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println); //Parseamos los datos
		
	}
	
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
		
	}
	
	public void contar() {
		long x= lista.stream().count();
		System.out.println(x);
		
	}
	
	public static void main(String[]args) {
		TestLambas app = new TestLambas();
		app.filtrar();
		//app.ordenar();
		//app.transformar();
		//app.limitar();
		//app.contar();
	}
	

}

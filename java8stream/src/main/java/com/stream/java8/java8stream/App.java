package com.stream.java8.java8stream;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	
	private List <String> lista;
	private List<String> numero;
	
	public App() {
		lista = new ArrayList<>();
		lista.add("Juan");
		lista.add("Manuel");
		lista.add("Federico");
		
		numero= new ArrayList<>();
		numero.add("2");
		numero.add("1");
	}
	
	//filtrar los que empeizan con M
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println );
		
		// o expresion lambda 
		//lista.stream().filter(x -> x.startsWith("M")).forEach(x -> System.out.println(x );
	}
	
	public void ordenar() {
		lista.stream().sorted().forEach(System.out::println);
		numero.stream().sorted().forEach(System.out::println);
	}
	
	
    public static void main( String[] args )
    {
        App app = new App();
        app.filtrar();
        app.ordenar();
    }
}

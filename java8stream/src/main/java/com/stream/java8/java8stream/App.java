package com.stream.java8.java8stream;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	
	private List <String> lista;
	private List<String> numero;
	
	public App() {
		lista = new ArrayList<>();
		lista.add("juan");
		lista.add("Manuel");
		lista.add("federico");
		
		numero= new ArrayList<>();
		numero.add("1");
		numero.add("2");
	}
	
	//filtrar los que empeizan con M
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println );
	}
	
	
    public static void main( String[] args )
    {
        App app = new App();
        app.filtrar();
    }
}

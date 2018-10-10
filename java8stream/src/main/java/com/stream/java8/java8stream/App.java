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
		//ordena en forma ascendente
		lista.stream().sorted().forEach(System.out::println);
		numero.stream().sorted().forEach(System.out::println);
		
		//en forma descendente con exprecion lambda
		lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
		numero.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar() {
		//pasar los strings a mayuscula
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//pasar la lista de string numero a enteros y sumarle 1
		numero.stream().map(x -> Integer.parseInt(x)+ 1).forEach(System.out::println);
 }
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
		}
	
	public void contar() {
		long x = lista.stream().count()	;
		System.out.println(x);
				}
	
    public static void main( String[] args )
    {
        App app = new App();
       // app.filtrar();
      //  app.ordenar();
       // app.transformar(); 
       // app.limitar();
        app.contar();
    }
}

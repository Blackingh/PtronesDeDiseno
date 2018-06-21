package proa.facade;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalizadorClase {
	public static Object objeto;
	public static Field atributos[];
	public static Method metodos[];
	
	public static String fijarObjetivo(Object ob) {
		if(ob == null) 
			return "Es imposible analizar un objeto nulo";
		objeto = ob;
		atributos = objeto.getClass().getDeclaredFields();
		metodos = objeto.getClass().getDeclaredMethods();
		return "Se esta analizando la clase " + objeto.getClass().getSimpleName() + " ";
	}
	
	public static String analizarTodo() {
		return analizarAtributos() + "\n\n" + analizarMetodos();
	}
	
	public static String analizarAtributos() {
		String respuesta = "Atributos que presenta y sus tipos:\n";
		for(Field f : atributos)
			respuesta +="- " + f.getType().getSimpleName() + " " + f.getName() + '\n';
		respuesta += "Estos son los " + atributos.length + " atributos que presenta que presemta la clase";
		return respuesta;
	}
	
	public static String analizarMetodos() {
		String respuesta = "Metodos que presenta y sus tipos:\n";
		for(Method f : metodos)
			respuesta +="- " + f.getReturnType().getSimpleName()+ " " + f.getName() + '\n';
		respuesta += "Y los parametros que recibe cada metodo son los siguientes: \n";
		for(Method f : metodos) {
			respuesta += f.getName()+": ";
			Class<?>[] tipoParametros = f.getParameterTypes();
			for(Class <?> p : tipoParametros)
				respuesta += p.getSimpleName()+ ' ';
			respuesta += '\n';
		}
		respuesta += "Estos son los " + metodos.length + " metodos que presenta que presemta la clase";
		return respuesta;
	}
	
}

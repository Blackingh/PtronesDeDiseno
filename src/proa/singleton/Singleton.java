package proa.singleton;

public class Singleton {
	private static final Singleton SINGLETON = new Singleton();
	private String nombre;
	private Singleton () {
		nombre = "Ricardo";
	}
	public static Singleton getSingleton() {
		return SINGLETON;
	}
	
	public String getNombre(){
		return nombre;
	}
} 


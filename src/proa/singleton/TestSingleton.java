package proa.singleton;

public class TestSingleton {

	private static Singleton singleton;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton = Singleton.getSingleton();
		//Singleton s = new Singleton(); // NO SE PUEDE INSTANCIAR 
		System.out.println(singleton.getNombre());
	}

}

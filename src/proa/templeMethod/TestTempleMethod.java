package proa.templeMethod;

public class TestTempleMethod {

	public static void main(String[] args) {
		Animal perro = new Perro();
		perro.vivir();
		System.out.println("---------------");
		Animal gato = new Gato();
		gato.vivir();
	}

}

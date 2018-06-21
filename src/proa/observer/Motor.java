package proa.observer;

public class Motor implements Observador{

	public Motor() {}
	
	@Override
	public void update() {
		//accion a realizar despues de que se entera de que el accelerador esta siendo precionado
		System.out.println("Subir la potencia y revoluciones");
	}

}

package proa.decorador;

public class CarroEstandar implements Automovil {

	public CarroEstandar() {
	}
	
	@Override
	public void run() {
		System.out.println("Acceleracion estandar");
	}

	@Override
	public void stop() {
		System.out.println("Frenar");
	}

	@Override
	public void start() {
		System.out.println("Prendiendo el carro");
	}
	
}

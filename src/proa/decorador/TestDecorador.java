package proa.decorador;

public class TestDecorador {

	public static void main(String[] args) {
		Automovil carro = new CarroEstandar();
	    carro = new AutoElectricoFeature(carro);
	    carro.start();
	    carro.run();
	    carro.stop();
	}

}

package proa.decorador;

public class AutoElectricoFeature extends AutomovilDecorador {

	public AutoElectricoFeature(Automovil auto) {
		super(auto);
	}
	
	@Override
	public void run() {
		System.out.println("Iniciando Electricamente");
		getAuto().run();
	}

	@Override
	public void stop() {
		System.out.println("Controlando frenos electronicos");
		getAuto().stop();
	}

	@Override
	public void start() {
		getAuto().stop();
		System.out.println("Iniciar sistema operativo");
	}

}

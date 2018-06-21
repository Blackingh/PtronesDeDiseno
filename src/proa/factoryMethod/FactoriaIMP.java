package proa.factoryMethod;

public class FactoriaIMP implements Factoria{
	public static final String AGUA = "agua";
	public static final String CAMPO = "campo";
	@Override
	public Moto crearMoto(String tipo, int ruedas) {
		switch(tipo) {
			case AGUA: return new MotoAgua(tipo,ruedas);
			case CAMPO: return new MotoCampo(tipo,ruedas);
		}
		return null;
	}

}

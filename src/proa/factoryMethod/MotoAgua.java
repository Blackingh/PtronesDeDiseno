package proa.factoryMethod;

public class MotoAgua implements Moto{
	
	private String tipo;
	private int ruedas;
	
	public MotoAgua(String tipo,int ruedas) {
		this.ruedas = ruedas;
		this.tipo = tipo;
	}
	
	@Override
	public int getRuedas() {
		return this.ruedas;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

}

package proa.factoryMethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tipoMoto = "agua";
		int numRuedas = 5;
		
		
		Factoria miFactoria = new FactoriaIMP();
		//MOTO 1
		Moto miMoto = miFactoria.crearMoto(tipoMoto, numRuedas);
		System.out.println("Es una moto de "+miMoto.getTipo()+ " con "+ miMoto.getRuedas()+" ruedas");
		
		
		tipoMoto = "campo";
		numRuedas = 3;
		//MOTO 2
		Moto miMoto2 = miFactoria.crearMoto(tipoMoto, numRuedas);
		System.out.println("Es una moto de "+miMoto2.getTipo()+ " con "+ miMoto2.getRuedas()+" ruedas");
	}

}

package proa.adapter;

public class MotorComun extends Motor{

	MotorComun(){
		super();
		System.out.println("Creando Motor Comun");
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo motor comun");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor comun");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor comun");
		
	}

}

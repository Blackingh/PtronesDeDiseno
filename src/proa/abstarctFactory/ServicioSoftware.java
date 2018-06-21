package proa.abstarctFactory;

public class ServicioSoftware implements ServicioInformatico{

	@Override
	public void asignarTrabajo() {
		System.out.println("El trabajo a sido asignado a disenadores software disponible");
		
	}

	@Override
	public void indicarFechaEntrega() {
		System.out.println("El trabajo se entregara el 20/07/2018");
		
	}

	@Override
	public void informarSobrePago() {
		System.out.println("Debe realizar el pago cuando venga a recoger su software");
		
	}

}

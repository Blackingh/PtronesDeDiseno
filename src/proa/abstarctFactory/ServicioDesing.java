package proa.abstarctFactory;

public class ServicioDesing implements ServicioInformatico{

	@Override
	public void asignarTrabajo() {
		System.out.println("El trabajo a sido asignado a disenadores graficos disponible");
		
	}

	@Override
	public void indicarFechaEntrega() {
		System.out.println("El trabajo se entregara el 20/06/2018");
		
	}

	@Override
	public void informarSobrePago() {
		System.out.println("Debe realizar el pago cuando venga a recoger su logo");
		
	}

}

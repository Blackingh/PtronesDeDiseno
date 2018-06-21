package proa.abstarctFactory;

public class ServicioWebSites implements ServicioInformatico{

	@Override
	public void asignarTrabajo() {
		System.out.println("El trabajo a sido asignado a disenadores web disponible");
		
	}

	@Override
	public void indicarFechaEntrega() {
		System.out.println("El trabajo se entregara el 30/06/2018");
		
	}

	@Override
	public void informarSobrePago() {
		System.out.println("Debe realizar el pago cuando venga a recoger su sitio web");
		
	}

}

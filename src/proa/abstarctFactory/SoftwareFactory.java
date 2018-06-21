package proa.abstarctFactory;

public class SoftwareFactory implements ServicioFactory{

	@Override
	public ServicioInformatico crearServicio() {
		return new ServicioSoftware();
	}

}

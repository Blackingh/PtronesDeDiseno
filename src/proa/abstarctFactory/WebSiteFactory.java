package proa.abstarctFactory;

public class WebSiteFactory implements ServicioFactory{

	@Override
	public ServicioInformatico crearServicio() {
		return new ServicioWebSites();
	}

}

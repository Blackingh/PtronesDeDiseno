package proa.abstarctFactory;

import java.util.Scanner;

public class TestAbstractFactory {

	private static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		int o;
        do{
            o = preguntarServicio();
            switch(o) {
                case 1:
                    usarServicio(new DesingFactory());
                    break;
                case 2:
                    usarServicio(new SoftwareFactory());
                    break;
                case 3:
                    usarServicio(new WebSiteFactory());
                    break;
                case 4:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Se ha ingresado una opcion invalida.");
            }
            System.out.print("\n");
        }while(o!=4);
    }
    
    public static void usarServicio(ServicioFactory factory) {
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
    
    public static int preguntarServicio() {
        System.out.print(
                "MENU DE OPCIONES\n"
              + "---- -- -------->\n"
              + "1. Solicitar servicio de diseno grafico.\n"
              + "2. Solicitar desarrollo de software educacional.\n"
              + "3. Solicitar creacion de sitios web.\n"
              + "4. Cerrar programa.\n"
              + "Seleccione opcion: "
        );
        return Integer.parseInt( S.nextLine() );
    }

}


package proa.adapter;

import java.util.Scanner;

public class TesteAdapter {

	 	private static Scanner S = new Scanner(System.in);
	    private static Motor motor;
	    
	    public static void main(String[] args) {
	        System.out.println("");
	        int opcion;
	        do{
	            opcion = preguntarOpcion();
	            switch(opcion) {
	                case 1:
	                    motor = new MotorComun();
	                    usarMotor();
	                    break;
	                case 2:
	                    motor = new MotorEconomico();
	                    usarMotor();
	                    break;
	                case 3:
	                    motor = new MotorElectricoAdapter();
	                    usarMotor();
	                    break;
	                case 4:
	                    System.out.println("A Cerrando programa!");
	                    break;
	                default:
	                    System.out.println("La opcion ingresada NO es válida.");
	            }
	            System.out.print("\n\n");
	        }while(opcion!=4);
	    }

	    private static int preguntarOpcion() {
	        System.out.print(
	                "MENU DE OPCIONES\n"
	               +"---- -- --------\n"
	               +"1. Encender motor comun.\n"
	               +"2. Encender motor economico.\n"
	               +"3. Encender motor electrico.\n"
	               +"4. Salir.\n"
	               +"Seleccione opcion: "
	        );
	        return Integer.parseInt( S.nextLine() );
	    }

	    private static void usarMotor() {
	        motor.encender();
	        motor.acelerar();
	        motor.apagar();
	    }

}

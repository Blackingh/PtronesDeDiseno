package proa.observer;

import java.util.ArrayList;

public class Accelerador implements SujetoObservable{

	private ArrayList<Observador> observadores;
	
	public void enlazarObservador(Observador o) {
		observadores.add(o);
	}
	
	public Accelerador() {
		observadores = new ArrayList<Observador>();
	}
	
	public void pisarAccelerador() {
		notificar();
	}
	
	@Override
	public void notificar() {
		for(Observador o : observadores) {
			o.update();
		}
	}

}

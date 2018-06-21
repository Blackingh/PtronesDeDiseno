package proa.observer;

public class TestObserver {

	public static void main(String[] args) {
		Motor moto1 = new Motor();
		Accelerador pedal = new Accelerador();
		pedal.enlazarObservador(moto1);
		
		pedal.pisarAccelerador();
		
	}

}

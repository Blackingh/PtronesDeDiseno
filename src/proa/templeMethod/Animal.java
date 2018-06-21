package proa.templeMethod;

public abstract class Animal {
	
	abstract void correr();
	abstract void comer();
	abstract void dormir();
	
	public final void  vivir() {
		
		correr();
		comer();
		dormir();
		
	}
	
}

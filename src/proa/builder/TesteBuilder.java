package proa.builder;

public class TesteBuilder {

	public static void main(String[] args) {
		//BUILDER
		Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println("INGREDIENTES");
        System.out.println("Masa: "+ pizza.getDough());
        System.out.println("Salsa: " + pizza.getSauce());
        System.out.println("Cubierta: " + pizza.getTopping());

	}

}

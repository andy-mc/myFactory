public class NyPizzaStore extends PizzaStore {
  SimplePizzaFactory factory;

  public NyPizzaStore() {
    this.factory = new SimplePizzaFactory("NY");
  }

  public Pizza orderPizza(String type) { 
    Pizza pizza;
    
    pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}

public class ChPizzaStore extends PizzaStore {
    SimplePizzaFactory factory;

    ChPizzaStore() {
      this.factory = new SimplePizzaFactory("CH");
    }

    public Pizza orderPizza(String type) { 
      Pizza pizza;
      pizza = this.factory.createPizza(type);

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();

      return pizza;
    }
}

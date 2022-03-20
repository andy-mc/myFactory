public class ChPizzaStore extends PizzaStore {
    String city;
    Pizza pizza;
    SimplePizzaFactory city_factory;

    ChPizzaStore() {
      city_factory = new SimplePizzaFactory("CH");
    }

    
    public void orderPizza(String type) { 
      pizza = city_factory.createPizza(type);

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
    }
}

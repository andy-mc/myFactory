public class NyPizzaStore extends PizzaStore {
    String city;
    Pizza pizza;
    SimplePizzaFactory city_factory;

    NyPizzaStore() {
      city_factory = new SimplePizzaFactory("NY");
    }

    
    public void orderPizza(String type) { 
      pizza = city_factory.createPizza(type);

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
    }
}

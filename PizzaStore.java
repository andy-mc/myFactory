public class PizzaStore {
    String city;
    Pizza pizza;
    SimplePizzaFactory city_factory;

    PizzaStore(String city) {
      city_factory = new SimplePizzaFactory(city);
    }

    
    public void orderPizza(String type) { 
      pizza = city_factory.createPizza(type);

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
    }
}

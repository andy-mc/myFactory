public class NySimplePizzaFactory extends SimplePizzaFactory {
  public Pizza createPizza(String type) { 
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new NyCheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NyPepperoniPizza();
    } 
      
    return pizza;
  }
}

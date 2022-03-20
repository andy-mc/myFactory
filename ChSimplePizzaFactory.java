public class ChSimplePizzaFactory extends SimplePizzaFactory {
    public Pizza createPizza(String type) { 
      Pizza pizza = null;

      if (type.equals("cheese")) {
        pizza = new ChCheesePizza();
      } else if (type.equals("pepperoni")) {
        pizza = new ChPepperoniPizza();
      } 

      return pizza;
    }
}

public class SimplePizzaFactory {
    String city;

    public SimplePizzaFactory(String city) {
      this.city = city;
    }
    
    public Pizza createPizza(String type) { 
      Pizza pizza = null;

      if (city.equals("NY")) {
        if (type.equals("cheese")) {
          pizza = new NyCheesePizza();
        } else if (type.equals("pepperoni")) {
          pizza = new NyPepperoniPizza();
        } 
      } else if (city.equals("CH")) {
        if (type.equals("cheese")) {
          pizza = new ChCheesePizza();
        } else if (type.equals("pepperoni")) {
          pizza = new ChPepperoniPizza();
        } 
      }
      
      return pizza;
    }
}

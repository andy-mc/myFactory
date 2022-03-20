public class HellPizzaStoreClassExplosion {
    String city;
    Pizza pizza;

    public HellPizzaStoreClassExplosion(String city) {
      this.city = city;
    }
    
    public void orderPizza(String type) { 
      if (city.equals("NY")) {
        if (type.equals("cheese")) {
          pizza = new NyCheesePizza();
        } else if (type.equals("pepperoni")) {
          pizza = new NyPepperoniPizza();
        } else {
          pizza = null;
        }
      } else if (city.equals("CH")) {
        if (type.equals("cheese")) {
          pizza = new ChCheesePizza();
        } else if (type.equals("pepperoni")) {
          pizza = new ChPepperoniPizza();
        } else {
          pizza = null;
        }
      }

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
    }
}

public class PizzaStore {

   public void orderPizza(String type) {
      Pizza pizza;

      if (type.equals("cheese")) {
        pizza = new CheesePizza();
      } else if (type.equals("pepperoni")) {
        pizza = new PepperoniPizza();
      } else {
        pizza = null;
      }

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
   }
}

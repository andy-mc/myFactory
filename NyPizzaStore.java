// al extender de PizzaStore, NyPizzaStore puede usar el order pizza de su superClase
public class NyPizzaStore extends PizzaStore {
  // solo debe personalizar las pizzas que va a crear
  public Pizza createPizza(String type) { 
    Pizza pizza = null;
    // todos esto typos de pizzas son pizzas neoyorquinas
    if (type.equals("cheese")) {
      pizza = new NyCheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NyPepperoniPizza();
    } else if (type.equals("margarita")) {
      pizza = new NyMargaritaPizza();
    } 

    return pizza;
  }  
}

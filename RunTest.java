public class RunTest {
  public static void main(String[] args) {
    System.out.println("\n\n ********** PizzaStore **********");
    System.out.println("\n");
    
    PizzaStore ny_pizza_store = new PizzaStore("NY");
    PizzaStore ch_pizza_store = new PizzaStore("CH");
    
    ny_pizza_store.orderPizza("cheese");
    System.out.println("\n");
    ny_pizza_store.orderPizza("pepperoni");
    System.out.println("\n");
    ch_pizza_store.orderPizza("cheese");
    System.out.println("\n");
    
    
    // pizza_store.orderPizza("pepperoni");
  }
}

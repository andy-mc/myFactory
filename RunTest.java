public class RunTest {
  public static void main(String[] args) {
    System.out.println("\n\n ********** PizzaStore **********");
    System.out.println("\n");
    
    PizzaStore pizza_store = new PizzaStore();
    
    pizza_store.orderPizza("cheese");
    
    System.out.println("\n\n");

    pizza_store.orderPizza("pepperoni");
  }
}

public abstract class PizzaStore {
  // probar si las subclasses pueden modificar este metodo
  public Pizza orderPizza(String type) {
    Pizza pizza;
    // crear una pizza usando el metodo abstracto createPizza que va a ser personalizado por las subclasses
    pizza = createPizza(type);
    // con este me aseguro que todas las ciudades van a seguir estos pasos y no se van a salir del proceso
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  };

  // las subclasses cada ciudad se va encargar de hacer sus Pizzas en este factory method
  // por es le dejo abstracto yo como tienda me aseguro que todas las ciudades sigan los mismos pasos 
  // a nivel general pero los detalles de como implementar esos pasos se los dejo a cada ciudad
  // le dejo este metodo abstracto para que cada cadena de pizzas cree sus pizzas con este factory metodo
  // Yo como tienda solo me voy a encargar de los pasos a seguir en cada porceso una vez la pizza ya creada
  // pero no me voy a encargar de escribir a detalle el como lograr cada paso solo a dar los pasos a seguir
  public abstract Pizza createPizza(String type);
}

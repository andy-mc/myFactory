// tengo este molde para crear una pizza
// cada pizza que use este molde va a tener que llenar los metodos de esta pizza
// si un metodo no se implementa salta un error
// cada pizza que use este molde definira su preparacion, ordeano, corte, y caja
public abstract class Pizza {
   public abstract void prepare();
   public abstract void bake();
   public abstract void cut();
   public abstract void box();
}

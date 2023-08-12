package decorators;

import baseClass.BasePizza;
import baseClass.Decorator;

public class Jalapeno extends Decorator {
    public Jalapeno(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int getCost(){
        return basePizza.getCost() + 45;
    }
}

package decorators;

import baseClass.BasePizza;
import baseClass.Decorator;

public class ExtraCheese extends Decorator {
    public ExtraCheese(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 20;
    }
}

package decorators;

import baseClass.BasePizza;
import baseClass.Decorator;

public class Mushroom extends Decorator {
    public Mushroom(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 30;
    }
}

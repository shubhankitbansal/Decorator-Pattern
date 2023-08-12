package childClass;

import baseClass.BasePizza;

public class VeggieDelight implements BasePizza {
    @Override
    public int getCost(){
        return 150;
    }
}

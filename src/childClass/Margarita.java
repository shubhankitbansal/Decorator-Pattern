package childClass;

import baseClass.BasePizza;

public class Margarita implements BasePizza {
    @Override
    public int getCost(){
        return 100;
    }
}

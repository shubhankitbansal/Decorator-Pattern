package childClass;

import baseClass.BasePizza;

public class FarmHouse implements BasePizza {
    @Override
    public int getCost() {
        return 250;
    }
}

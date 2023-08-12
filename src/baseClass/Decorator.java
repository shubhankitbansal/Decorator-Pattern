package baseClass;

public abstract class Decorator implements BasePizza{
    protected BasePizza basePizza;
    public Decorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}

package decorator;

import componsants.Boisson;

public class Caramel extends  DecoratorIngredient{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.9;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec Caramel";
    }
}

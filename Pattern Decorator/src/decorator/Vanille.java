package decorator;

import componsants.Boisson;

public class Vanille extends  DecoratorIngredient{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 2.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec Vanille";
    }
}

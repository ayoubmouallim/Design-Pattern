package decorator;

import componsants.Boisson;

public class Chantilly extends  DecoratorIngredient{

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec Chantilly";
    }
}

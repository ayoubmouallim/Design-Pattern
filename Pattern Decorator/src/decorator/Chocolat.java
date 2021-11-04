package decorator;

import componsants.Boisson;

public class Chocolat extends  DecoratorIngredient{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}

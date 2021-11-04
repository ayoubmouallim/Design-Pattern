import componsants.Boisson;
import componsants.Deca;
import componsants.Expresso;
import decorator.Caramel;
import decorator.Chocolat;
import decorator.Vanille;

public class application {

    public static void main(String[] args) {
        Boisson boisson  = new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------");
        boisson  = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------");
        boisson  = new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------");

        Boisson boisson2 = new Caramel(new Chocolat(new Vanille(new Deca())));
        System.out.println(boisson2.getDescription());
        System.out.println(boisson2.cout());

    }
}

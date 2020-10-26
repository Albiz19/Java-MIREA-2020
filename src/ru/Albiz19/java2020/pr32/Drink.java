package ru.Albiz19.java2020.pr32;

import ru.Albiz19.java2020.pr30.Alchoholable;
import ru.Albiz19.java2020.pr30.DrinkTypeEnum;
import ru.Albiz19.java2020.pr30.MenuItem;

public class Drink extends MenuItem implements Alchoholable {
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }
}

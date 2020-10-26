package ru.Albiz19.java2020.pr29.ex29_1;

public final class Dish {
    private String description;
    public Dish(String description){
        try {
            this.description = description;
        } catch (IllegalArgumentException e) {
            if (description==null) {
                System.out.println(e);
            }
        }
    }
}

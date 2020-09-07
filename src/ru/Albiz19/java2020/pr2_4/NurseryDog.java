package ru.Albiz19.java2020.pr2_4;

public class NurseryDog {
    Dog[] dogs = new Dog[5];
    int i=0;
    public void AddDog(Dog dog)
    {
        dogs[i] = dog;
        i++;
    }
}

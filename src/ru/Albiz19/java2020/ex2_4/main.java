package ru.Albiz19.java2020.ex2_4;
import ru.Albiz19.java2020.ex2_4.Dog;
import ru.Albiz19.java2020.ex2_4.NurseryDog;
public class main {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Шарик", 10);
        Dog dog2 = new Dog("1", 5);
        Dog dog3 = new Dog("2", 2);
        NurseryDog nDog = new NurseryDog();
        nDog.AddDog(dog1, dog2, dog3);
    }
}
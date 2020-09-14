package ru.Albiz19.java2020.pr2.ex2_4;

public class NurseryDog {
    Dog[] m_dogs = new Dog[5];
    int i=0;
    public void AddDog(Dog ... dogs)
    {
        for (Dog dog : dogs)
        {
            i++;
            m_dogs[i] = dog;
        }

    }
}

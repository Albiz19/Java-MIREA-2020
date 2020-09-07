package ru.Albiz19.java2020.pr2_4;

public class NurseryDog {
    Dog[] m_dogs = new Dog[5];
    int i=0;
    public void AddDog(Dog ... dogs)
    {
        for (Dog dog : dogs)
        {
            m_dogs[i] = dog;
        }
        System.out.println(m_dogs[0]);
    }
}

package ru.Albiz19.java2020.ex2_4;

public class Dog {
    String m_name;
    int m_age;
    Dog(String name, int years) {
        SetName(name);
        SetAge(years);
    }
    public void SetName(String name)
    {
        m_name = name;
    }
    public void SetAge(int age)
    {
        m_age = age;
    }
    public int GetAge()
    {
        return m_age;
    }
    public String GetName()
    {
        return m_name;
    }
    public int TransAge()
    {
        return (m_age*7);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "m_name='" + m_name + '\'' +
                ", m_age=" + m_age +
                '}';
    }
}


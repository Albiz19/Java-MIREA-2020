package ru.Albiz19.java2020.pr2.ex2_4;

public class Dog {
    String m_name;
    int m_age;

    public Dog(String m_name, int m_age) {
        this.m_name = m_name;
        this.m_age = m_age;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setM_age(int m_age) {
        this.m_age = m_age;
    }

    public String getM_name() {
        return m_name;
    }

    public int getM_age() {
        return m_age;
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


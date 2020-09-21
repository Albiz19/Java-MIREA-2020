package ru.Albiz19.java2020.pr7.ex7_2;

public class Doberman extends Dog{
    protected boolean isTrained;
    public int HumanAge(){
        return this.age*7;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public Doberman(int age, String name, int height, boolean isTrained) {
        super(age, name, height);
        this.isTrained = isTrained;
    }
    public void Trained(boolean istrained){
        this.isTrained = istrained;
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "isTrained=" + isTrained +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

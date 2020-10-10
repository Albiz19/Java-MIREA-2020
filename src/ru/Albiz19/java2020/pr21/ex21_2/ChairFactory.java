package ru.Albiz19.java2020.pr21.ex21_2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        return (new FunctionalChair());
    }

    @Override
    public MagicChair createMagicChair() {
        return (new MagicChair());
    }

    @Override
    public VictorianChair createVictorianChair() {
        return (new VictorianChair(1));
    }
}

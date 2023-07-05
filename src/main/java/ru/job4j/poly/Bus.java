package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров" + count);
    }

    @Override
    public int refuel(int liters) {
        int oneLiter = 56;
        return oneLiter * liters;
    }
}

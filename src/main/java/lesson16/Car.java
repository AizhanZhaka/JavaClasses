package lesson16;

public class Car {

    private final double GALLON_COEF = 3.785;    //final-делает константой

    private int gasTankVolume;
    int passengers;
    String brand;
    String model;
    double consumptionCoef = 1.0;
    private boolean metric = true;
    double fuelConsumption;
    //private (модификатор доступа) - доступен только для класса, в котором находится

    //Имя конструктора такая же как и у класса
    Car( int passengers, int volume, double fuelConsumption){       //возьмет
        this.passengers = passengers;        //this.passengers - указывает что passengers с класса
        gasTankVolume = volume;
        this.fuelConsumption = fuelConsumption;
    }

    //метод сеттер
    void setGasTankVolume(int volume) {     //void не возвращает значение
        if (volume < 1) {
            gasTankVolume = 1;
        } else {
            gasTankVolume = volume;
        }
    }

    //метод геттер:
    int getGasTankVolume() {
        return gasTankVolume;
    }

    void setMetric(boolean b) {
        metric = b;
        if (b == false && metric == true) {    //b == false или !b
            fuelConsumption = fuelConsumption / GALLON_COEF;
        }
    }

    boolean getMetric() {
        return metric;
    }

}

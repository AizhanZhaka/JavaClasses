public class Fruit {
    private int appleCount;
    private int orangeCount;
    private  int bananCount;
    private double appleWeight;
    private double bananWeight;
    private double orangeWeight;
    private String cooker;
    private boolean fresh;
    private int parts;

    public double totalWeight(){
        double totalWeight = appleWeight * appleCount + bananCount * bananWeight + orangeCount * orangeWeight;
        return  totalWeight;
    }

    public double inkgTotalWeight(){
        return totalWeight() / 1000;
    }

    public Fruit(int appleCount, int orangeCount, int bananCount, double appleWeight, double bananWeight, double orangeWeight) {
        this.appleCount = appleCount;
        this.orangeCount = orangeCount;
        this.bananCount = bananCount;
        this.appleWeight = appleWeight;
        this.bananWeight = bananWeight;
        this.orangeWeight = orangeWeight;
    }

}

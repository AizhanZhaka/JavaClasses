package lesson18;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class TableNew {

    private int height;
    private int width;
    private int length;
    private String name;

    @SerializedName("manufactured")
    private Date manufactureDate;
    private String colors[];

    private Material material;

    private long date;

    public TableNew( String name, int width, int length) {
        this.width = width;
        this.length = length;
        this.name = name;
    }

    public TableNew(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public TableNew() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width <= 0){
            throw new IllegalArgumentException();
        }
        System.out.println("in setWidth method");
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

//    public  void readSpecs(){
//        try {
//            Scanner in = new Scanner(new File("table.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    //если надо выкинуть без отработки, кто вызовит метод,тот и решает проблему
    public  void readSpecs() throws FileNotFoundException{
          Scanner in = new Scanner(new File("table.txt"));
    }

    int area() {
        int a = width * length;
        return a; //return обязательно, из-за метода

    }

    //void - возвращаемый тип

    public int volume() {
        int b = height * width * length; // или  int b = height * area();
        return b; // или return height * width * length;
    }


    @Override
    public String toString() {
        return name + " [" + width + "x" + height + "x" + length + "] ";
    }



    void print() {
        System.out.println("Размеры  стола " + name + ": " + height + " x " + length + " x " + width);
    }


}



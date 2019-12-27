package object_lesson14;

public class Table {

        int height;
        int width;
        int length;

        String name;

        int area(){
                int a = width * length;
                return a; //return обязательно, из-за метода

        }

        //void - возвращаемый тип

        int volume(){
                int b = height * width * length; // или  int b = height * area();
                return b; // или return height * width * length;
        }

        void print(){
                System.out.println("Размеры  стола " + name + ": " + height + " x " + length + " x " + width  );
        }


}

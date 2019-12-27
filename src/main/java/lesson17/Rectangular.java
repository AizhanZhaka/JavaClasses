package lesson17;

public class Rectangular extends Shape{     //указываем откуда наследствует

    String name;

    public Rectangular(String name, int width, int height){
        super(width, height);    //инициализация родительского класса
        this.name = name;
        setHeight(height);
        setWidth(width);
    }

    Rectangular(String name, int a){
        this(name,a, a);
//        super(a);
//        this.name = name;
    }

    Rectangular(String name){
        this(name, 0);
//        super();
//        this.name = name;
    }

    public void showName(){
        System.out.println("Name of rectangular: " + name);
    }

    boolean isSquare(){    //is -это getter для boolean
        return  getHeight() ==getWidth();
//      if(getWidth() == getHeight()){
//          return true;
//      }  else{
//          return false;
//      }
    }

}

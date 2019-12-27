package lesson20;

public class Table20 {
    private int height;
    private int width;
    private int length;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Table20() {                                                                                       //конструктор по умолчанию (если значений не внесено)
        height = 50;
        width = 50;
        length = 50;
    }

    Table20 (int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Table20 (int width, int length) {
        this.height = 50;
        this.width = width;
        this.length = length;
    }

    void setHeight(int height) {
        if (height < 1) {
            height = 1;
        } else {
            this.height = height;
        }
    }

    int getHeight() {
        return height;
    }

    void setWidth(int width) {
        if (width < 1) {
            width = 1;
        } else {
            this.width = width;
        }
    }

    int getWidth() {
        return width;
    }

    void setLength(int length) {
        if (length < 1){
            length = 1;
        } else {
            this.length = length;
        }
    }

    int getLength() {
        return width;
    }

    int Plowad(){
        int a = this.width * this.length;
        return a;
    }

    int Volume(){
        //   int volume = width * length * height;
        //   return volume;
        //  return width * length * height;
        return Plowad() * height;
    }

    void print() {
        System.out.println("Размеры " + "стола: " + width + "x" + height + "x" + length);
    }

    @Override
    public boolean equals(Object obj) {
        Table20 t = (Table20) obj;

        if (width == t.width && height == t.height && length == t.length){
            return  true;
        }
        return  false;
    }

    @Override
    public String toString() {
        return name + "[" + width + "x" + height + "x" + length + "]";
    }
}

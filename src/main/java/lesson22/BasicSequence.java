package lesson22;

public class BasicSequence implements Sequence {

    private int current = 0;

    public int getNext(){
        int val = current;
        current++;
        return  val;
    }

    public void setStart(int number){
        current = number;
    }


}

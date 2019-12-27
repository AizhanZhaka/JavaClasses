package lesson23;

import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;

public class Text {

    private char[] letters= new char[4];
    private int index = 0;

    public  void add(char letter){
        if(index == letters.length){
            char newLetters[] = new char[letters.length * 2];
            for (int i = 0; i < letters.length; i++) {
                newLetters[i]  = letters[i];
            }
            letters = newLetters;
        }
        letters[index++] = letter;
    }

    public void remove(int index){
        for (int i = index; i < this.index; i++) {
            letters[i] = letters[i + 1];
            //todo:fix if some error occure
        }
            this.index--;
    }

    public  void set(char letter, int position){

        letters[position] = letter;
    }

    public char get(int index){
        checkIndex(index);
            return letters[index];
    }

    public  int size(){
        return  index;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < index; i++) {
           str += letters[i];
        }
        return str;
    }

    private  void checkIndex(int position){
        if(position < 0 || position >= index){
        System.err.println("Incorrect index: " + position);
        System.exit(1);
        }
    }

    public int IndexO(char ch){
        for (int i = 0; i < index; i++) {
           if (ch == letters[i]){
               return i;
           }
        }
        return -1;
    }

    public int lastIndexO(char ch){
        for (int i = index - 1; i >= 0; i--) {
            if (ch == letters[i]){
                return  i;
            }
        }
        return -1;
    }

    public boolean contentEquals(Text text){
        if(index != text.index){
            return  false;
        }
        for (int i = 0; i < index; i++) {
            if(letters[i] != text.letters[i]){
                return  false;
            }
        }
        return  true;
    }



    public static void main(String[] args) {
        Text t = new Text();
        System.out.println(t.isEmpty());
        t.add('a');
        t.add('p');
        t.add('p');
        t.add('l');
        t.add('e');

        System.out.println(t);
        System.out.println(t.get(2));
        System.out.println(t.size());

        System.out.println(t.isEmpty());

        t.remove(0);
        t.add('x');

        System.out.println(t);

        System.out.println(t.lastIndexO('p'));
        System.out.println(t.IndexO('a'));


        Text t2 = new Text();
        t2.add('x');

        System.out.println(t.contentEquals(t2));

    }
}

package lesson29;

import lesson18.TableNew;

import java.util.Comparator;

public class TableComparator implements Comparator<TableNew> {

    @Override
    public int compare(TableNew o1, TableNew o2) {
        if(o1.getHeight() == o2.getHeight()){
        return 0;
        } else if(o1.getHeight() < o2.getHeight()){
            return  -1;
        }else{
            return  1;
        }
    }
}


package lesson22;

public class SportTest {
    public static void main(String[] args) {
        Football f = new Football();

        Sport s = new Football();
        Hockey h = new Hockey();
        Event e = new Football();

        printStats(s);
        System.out.println("Players count " + getSport().getPlayersCount());

    }

    public static void printStats(Sport f){
        System.out.println(f.getPlayersCount());
        System.out.println(f.getPeriods());
    }

    public static  Sport getSport(){
        return  new Hockey();
    }
}

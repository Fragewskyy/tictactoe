import java.util.ArrayList;
import java.util.List;

public class Table {
    char[] squares = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    List<Integer> availableSquares = new ArrayList<>();
    public static void printTable(char[] cells){
        System.out.println(cells[0]+"|"+cells[1]+"|"+cells[2]+"\n"+"-+-+-"+"\n"+cells[3]+"|"+cells[4]+"|"+cells[5]+"\n"+"-+-+-"+"\n"+cells[6]+"|"+cells[7]+"|"+cells[8]);
    }
}

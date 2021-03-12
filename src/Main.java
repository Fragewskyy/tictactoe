import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        Table table = new Table();
        for(int i=1; i<10; i++) {
            table.availableSquares.add(i);
        }
        person.name = scanner.nextLine();
        //Game.round(person, table.availableSquares, table, table.squares, person.winCounter, person.looseCounter, person.name);
        while(table.availableSquares.size()>=0) {
            table.printTable(table.squares);
            int ruch = scanner.nextInt();
            table.squares[ruch - 1] = "X";
            table.availableSquares.removeIf(value -> value == ruch);
            person.isWinnerCheck(table.squares, person);
            if(person.isWinner==1){
                person.winCounter++;
                System.out.println(person.name + " wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.isWinner=0;
                table.squares= new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(person.isWinner==2){
                person.looseCounter++;
                System.out.println("Komputer wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.isWinner=0;
                table.squares= new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(table.availableSquares.size()==0 && (person.isWinner!=1 && person.isWinner!=2)){
                System.out.println("Remis! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.isWinner=0;
                table.squares= new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            int ruchKomputera = getRandomItem(table.availableSquares);
            table.squares[ruchKomputera - 1] = "O";
            table.availableSquares.removeIf(value -> value == ruchKomputera);
            if(person.isWinner==1){
                person.winCounter++;
                System.out.println(person.name + " wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.isWinner=0;
                table.squares= new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(person.isWinner==2){
                person.looseCounter++;
                System.out.println("Komputer wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.isWinner=0;
                table.squares= new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(table.availableSquares.size()==0 && (person.isWinner!=1 && person.isWinner!=2)){
                System.out.println("Remis! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.isWinner=0;
                table.squares= new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
        }
    }
    public static <T> T getRandomItem(List<T> list)
    {
        Random random = new Random();
        int listSize = list.size();
        int randomIndex = random.nextInt(listSize);
        return list.get(randomIndex);
    }
}


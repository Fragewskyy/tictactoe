import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        Table table = new Table();
        int charPicker = random.nextInt(2);
        if(charPicker==0){
            person.setPersonChar('X');
            person.setComputerChar('O');
        }
        else if(charPicker==1){
            person.setPersonChar('O');
            person.setComputerChar('X');
        }
        for(int i=1; i<10; i++) {
            table.availableSquares.add(i);
        }
        System.out.println("Podaj imię: ");
        person.name = scanner.nextLine();
        System.out.println("Cześć " + person.name + " twój znak to "+person.getPersonChar());
        while(table.availableSquares.size()>=0) {
            table.printTable(table.squares);
            int ruch = scanner.nextInt();
            table.squares[ruch - 1] = person.getPersonChar();
            table.availableSquares.removeIf(value -> value == ruch);
            person.isWinnerCheck(table.squares, person);
            if(person.getIsWinner()==1){
                person.winCounter++;
                System.out.println(person.name + " wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.setIsWinner(0);
                table.squares= new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(person.getIsWinner()==2){
                person.looseCounter++;
                System.out.println("Komputer wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.setIsWinner(0);
                table.squares= new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(table.availableSquares.size()==0 && (person.getIsWinner()!=1 && person.getIsWinner()!=2)){
                System.out.println("Remis! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.setIsWinner(0);
                table.squares= new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            int ruchKomputera = getRandomItem(table.availableSquares);
            table.squares[ruchKomputera - 1] = person.getComputerChar();
            table.availableSquares.removeIf(value -> value == ruchKomputera);
            if(person.getIsWinner()==1){
                person.winCounter++;
                System.out.println(person.name + " wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.setIsWinner(0);
                table.squares= new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(person.getIsWinner()==2){
                person.looseCounter++;
                System.out.println("Komputer wygrywa! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.setIsWinner(0);
                table.squares= new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                table.availableSquares.clear();
                for(int i=1; i<10; i++) {
                    table.availableSquares.add(i);
                }
            }
            else if(table.availableSquares.size()==0 && (person.getIsWinner()!=1 && person.getIsWinner()!=2)){
                System.out.println("Remis! Wynik to: "+person.winCounter+" : "+person.looseCounter);
                person.setIsWinner(0);
                table.squares= new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
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


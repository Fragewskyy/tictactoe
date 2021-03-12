public class Person {
    String name;
    int winCounter=0;
    int looseCounter=0;
    int isWinner=0;
    public void isWinnerCheck(String[] cells, Person person) {
        if((cells[0]=="X" && cells[3]=="X" && cells[6]=="X") || (cells[1]=="X" && cells[4]=="X" && cells[7]=="X") || (cells[2]=="X" && cells[5]=="X" && cells[8]=="X") || (cells[0]=="X" && cells[1]=="X" && cells[2]=="X") || (cells[3]=="X" && cells[4]=="X" && cells[5]=="X") || (cells[6]=="X" && cells[7]=="X" && cells[8]=="X") || (cells[0]=="X" && cells[4]=="X" && cells[8]=="X") || (cells[2]=="X" && cells[4]=="X" && cells[6]=="X")){
            person.isWinner=1;
        }
        else if((cells[0]=="O" && cells[3]=="O" && cells[6]=="O") || (cells[1]=="O" && cells[4]=="O" && cells[7]=="O") || (cells[2]=="O" && cells[5]=="O" && cells[8]=="O") || (cells[0]=="O" && cells[1]=="O" && cells[2]=="O") || (cells[3]=="O" && cells[4]=="O" && cells[5]=="O") || (cells[6]=="O" && cells[7]=="O" && cells[8]=="O") || (cells[0]=="O" && cells[4]=="O" && cells[8]=="O") || (cells[2]=="O" && cells[4]=="O" && cells[6]=="O")){
            person.isWinner=2;
        }
    }
}

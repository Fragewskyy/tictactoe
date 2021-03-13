public class Person {
    String name;
    int winCounter=0;
    int looseCounter=0;
    int isWinner=0;
    char personChar;
    char computerChar;
    public void isWinnerCheck(char[] cells, Person person) {
        if((cells[0]==person.personChar && cells[3]==person.personChar && cells[6]==person.personChar) || (cells[1]==person.personChar && cells[4]==person.personChar && cells[7]==person.personChar) || (cells[2]==person.personChar && cells[5]==person.personChar && cells[8]==person.personChar) || (cells[0]==person.personChar && cells[1]==person.personChar && cells[2]==person.personChar) || (cells[3]==person.personChar && cells[4]==person.personChar && cells[5]==person.personChar) || (cells[6]==person.personChar && cells[7]==person.personChar && cells[8]==person.personChar) || (cells[0]==person.personChar && cells[4]==person.personChar && cells[8]==person.personChar) || (cells[2]==person.personChar && cells[4]==person.personChar && cells[6]==person.personChar)){
            person.isWinner=1;
        }
        else if((cells[0]==person.computerChar && cells[3]==person.computerChar && cells[6]==person.computerChar) || (cells[1]==person.computerChar && cells[4]==person.computerChar && cells[7]==person.computerChar) || (cells[2]==person.computerChar && cells[5]==person.computerChar && cells[8]==person.computerChar) || (cells[0]==person.computerChar && cells[1]==person.computerChar && cells[2]==person.computerChar) || (cells[3]==person.computerChar && cells[4]==person.computerChar && cells[5]==person.computerChar) || (cells[6]==person.computerChar && cells[7]==person.computerChar && cells[8]==person.computerChar) || (cells[0]==person.computerChar && cells[4]==person.computerChar && cells[8]==person.computerChar) || (cells[2]==person.computerChar && cells[4]==person.computerChar && cells[6]==person.computerChar)){
            person.isWinner=2;
        }
    }
}

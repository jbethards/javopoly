import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    Name name = new Name();
    FirstPlayerStats first= new FirstPlayerStats();
    board b = new board();

    name.getName();
        System.out.println("Player One: "+name.firstPlayer);
        System.out.println("Player Two: "+name.secondPlayer);
        if(name.thirdPlayer != null) {
            System.out.println("Player Three: " + name.thirdPlayer);
        }
        if (name.fourthPlayer != null){
            System.out.println("Player Four: " + name.fourthPlayer);
        }
        name.PieceAssignment();





    }


}
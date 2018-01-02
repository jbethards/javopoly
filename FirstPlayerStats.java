import java.util.Scanner;
import java.math.*;
public class FirstPlayerStats {
    Name name= new Name();
    public String playerName = name.firstPlayer;
    public int playerPositionnumb;
    public String playerPositionName;
    public int money=100;
    public int value=100;
    public String landOwned;
    board b = new board();
    public int i=0;
    int ran = (int)(Math.random() * 6 + 1);
    public int j = ran+i;



    public void startPosition(){

        System.out.println();
        System.out.println("Player Stats");
        board b = new board();
        playerPositionnumb=b.boardNumber[i];
        playerPositionName= b.boardName[i];
        money= 100;
        value = 100;
        System.out.println("Start Position: "+ playerPositionName);
        System.out.println("Position Number: "+ playerPositionnumb);
        System.out.println("Money: "+ money);
        System.out.println("Value: "+ value);
        System.out.println("Type 1 to roll dice");
        Scanner reader = new Scanner(System.in);
        int ans = reader.nextInt();
        if(ans ==1){

            diceRoll();
        }
        endPosition();




    }
    public void endPosition(){


        playerPositionnumb= b.boardNumber[j];
        playerPositionName=b.boardName[j];
        System.out.println("End Position: "+ playerPositionName);
        System.out.println("Position Number: "+ playerPositionnumb);
        System.out.println("Money: "+ money);
        System.out.println("Value: "+ value);
        b.buyPropcheck();

    }
    public void diceRoll(){


        System.out.println("Dice: "+ ran);

    }
    public void endTurn(){
        playerPositionnumb= b.boardNumber[j];
        playerPositionName=b.boardName[j];
        System.out.println("End Position: "+ playerPositionName);
        System.out.println("Position Number: "+ playerPositionnumb);
        System.out.println("Money: "+ money);
        System.out.println("Value: "+ value);
        i = j;

    }

}

import java.util.Scanner;

public class Name {
    public String firstPlayer;
    public String secondPlayer;
    public String thirdPlayer;
    public String fourthPlayer;
    public String name;
    public int firstPlayerMoney;
    public int boardNumber;
    public String boardPosition;
    public int playercount;
    public String pieces[]= {"Racecar","Shoe","Cannon","Iron"};


    public Name() {

    }

    public void getName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Name");
        name = reader.next();
        AddPlayer();

    }


    public void AddPlayer () {
        playercount++;

        //Getting first player
        if(playercount==1){
            firstPlayer = name;
        }
        else if(playercount==2){
            secondPlayer=name;
        }
        else if (playercount==3){
            thirdPlayer=name;
        }
        else if(playercount==4){
            fourthPlayer=name;
        }




        //Assigning Player positions



        //Requesting more players

        System.out.println("Do you want to add another player? y or n");
        Scanner reader1 = new Scanner(System.in);
        String Answer = reader1.next();

        if (Answer.equals("y")) {

            getName();
        }
        if(Answer.equals("n")){

        }
        else
            System.out.println("Not a valid Answer");





    }

    public void getPiece(){


        System.out.println("1 = Racecar");
        System.out.println("2 = Shoe");
        System.out.println("3 = Cannon");
        System.out.println("4 = Iron");


    }
    public void PieceAssignment(){

        for (int i=1;i<=playercount;i++){
            System.out.println("Player "+i+": "+"Please select a piece.");
            getPiece();
            Scanner reader2 = new Scanner(System.in);
            int PieceAnswer= reader2.nextInt();
            System.out.println("Player "+i+":"+ pieces[PieceAnswer-1]);

        }
        FirstPlayerStats first = new FirstPlayerStats();
        first.startPosition();
    }


}

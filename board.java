import java.util.Scanner;

public class board {
    public int boardNumber[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    public String boardName[]= {"go","Cleveland","Baltimore","Denver","Jail","Houstan", "Chicago","LA","Chance","Austin",
    "Philadelphia","Boston","Go To Jail","Dallas","Seattle","NY"};
    public int price[]={0,25,50,75,0,100,125,150,0,175,200,225,0,250,275,300};
    public int rent[]={0,5,10,15,0,21,26,31,0,31,41,46,0,52,58,65};
    public int availableProp[]={0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1};


    public board(){

    }
    public void buyPropcheck(){

        FirstPlayerStats f = new FirstPlayerStats();

        if (availableProp[f.j]== 1){
            System.out.println("Buy "+ boardName[f.j]+ " for "+ price[f.j]+"? y or n");
            System.out.println("The rent for " + boardName[f.j]+" is "+ rent[f.j]);

        }
        if(availableProp[f.j]==0){
            if (f.j==0){
                f.money=f.money+100;
            }
            if(boardNumber[f.j]==5){
                System.out.println("You're in jail");
            }
            if(boardNumber[f.j]==8)
            {
                System.out.println("Free Money");
            }
            if (boardNumber[f.j]==12){
                System.out.println("Go to Jail");
            }
            else{
                f.money = f.money - rent[f.j];
                System.out.println("You owe "+ rent[f.j]);
            }
        }
        Scanner sc= new Scanner(System.in);
        String answ = sc.next();
        if(answ.equals("y")){
            f.money= f.money- price[f.j];
            f.value = f.value+ price[f.j];
            availableProp[f.j]=0;
        }
        f.endTurn();

    }





}

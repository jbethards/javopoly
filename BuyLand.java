package com.jetbrains;

public class BuyLand {
    public String PositionName[]={"Go","Cleveland","Baltimore","Orlando","Jail","San Diego","Chicago","Jacksonville","Free Money",
    "New Orleans","Portland", "Columbus", "Go To Jail","Boston","Seattle","New York"};
    public int available[]={0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1};
    public int price[]={0,25,50,75,0,100,125,150,0,175,200,225,0,250,275,300};
    public int rent[]={0,5,10,15,0,21,27,33,0,40,47,54,0,62,70,80};
    AssigningMoney am=new AssigningMoney();


    public void buy(int newp,int i){
        int changearr=newp-1;
        available[changearr]=0;
        


    }
}

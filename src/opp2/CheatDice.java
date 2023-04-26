package opp2;

//Diceクラスを継承
public class CheatDice extends Dice{
    //概要
    //引数で振った回数を受け取る
    public int CheatDice(int count){
        var diceResult = super.diceResult;
        if(count % 6 == 0){
            diceResult = 6;
        }

        return diceResult;
    }
}

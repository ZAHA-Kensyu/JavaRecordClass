package opp2;

public class DiceTest {
    public static void main(String[] args){
        //サイコロインスタンスを生成する
        Dice dice = new Dice();
        CheatDice cheatDice = new CheatDice();

        final var count = 30;
        System.out.println(count+"回 ダイスを振る");
        //30回振る

        for(var i = 0; i < count; i++){
            cheatDice.cast();//サイコロを振る
            System.out.println("出た目 "+ cheatDice.see());
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("6の倍数は必ず6が出る チートダイス");

        final var count1 = 30;
        for(var i = 0; i < count1; i++){
            cheatDice.cast();//サイコロを振る
            System.out.println((i + 1)+"回 "+"出た目 "+cheatDice.CheatDice((i + 1)));
        }
    }
}

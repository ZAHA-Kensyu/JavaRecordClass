package opp2;
import java.util.Random;
public class Dice {
    //必要に応じて適宜追加
    protected int diceResult;
    //コンストラクタなし
    //メソッド
    int cast(){//サイコロを振るメソッド
        //1~6をランダムな値を返す。
        Random random = new Random();
        diceResult = random.nextInt(6) + 1;
        return diceResult;
    }

    int see(){//出目を確認する
        if(diceResult != 0) {
            //最後に振った時の目を戻り値として返す。
            return diceResult;
        }else {
            //一度も振ったことのないときは1を返す。
            return 1;
        }
    }
}

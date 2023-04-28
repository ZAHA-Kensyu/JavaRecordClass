package function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionObjectPractice {
    public static void main(String[] args) {
        //------------------------------------------------------------------------------------------
        //判定させる数値
        var num = 5;

        //関数オブジェクト生成
        Predicate<Integer> oddOrEven = n -> n % 2 == 0;
        //処理の戻り値を格納
        boolean result = oddOrEven.test(num);
        //偶数か奇数か判断
        String str = result ? num + "は偶数です" : num + "は奇数です";
        //出力
        System.out.println(str+"\n");
        //-----------------------------------------------------------------------------------------
        //与えられた文字列を反転させる関数オブジェクトを作成してください。
        Function<String, String> revers = string -> new StringBuilder(string).reverse().toString();
        //実行結果の戻り値
        String strResult = revers.apply("abc");
        //出力
        System.out.println(strResult+"\n");

        //------------------------------------------------------------------------------------------
        BiFunction<String, String, String[]> split = (string, delimiter) -> string.split(delimiter);
        String[] strings = split.apply("aaa,bbb,ccc,ddd", ",");
        for (var string : strings) System.out.println(string);
        System.out.println("");//改行用

        //------------------------------------------------------------------------------------------
        var inputNumber = 2;
        int initInput = inputNumber;
        var inputCount = 5;

        UnaryOperator<Integer> numberOfTimes2Times = operator -> operator * 2;
        for(var count = 0; count < inputCount; count++) {
            inputNumber = numberOfTimes2Times.apply(inputNumber);
        }
        System.out.println(initInput + "を"+inputCount+"回 2倍した結果" + inputNumber+"\n");

        //------------------------------------------------------------------------------------------
        BiFunction<String,Integer,String> concatenation = (string,maxCount) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for(var count = 0; count < maxCount; count++) {
                stringBuilder.append(string);
            }
            return stringBuilder.toString();
        };

        System.out.println(concatenation.apply("abc",4));
        //------------------------------------------------------------------------------------------
    }
}

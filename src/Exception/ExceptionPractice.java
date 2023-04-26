package Exception;
import java.util.Scanner;
public class ExceptionPractice {
    String judgeScore(int score){
        String str;
        if(score < 0 || score > 100){
            throw new IlligalScoreException("スコアが不正です・");
        }else if(score >= 80){
            str =  "A";
        }
        else if(score >= 70){
            str = "B";
        }
        else if(score >= 60){
            str = "C";
        }
        else{
            str = "D";
        }
        return str;
    }

    public static void main(String[] argc){

        System.out.println("数値を入力してください");
        var inputFlg = false;
        do {
            try{
                inputFlg = false;
                var sc = new Scanner(System.in);
                var str = sc.nextLine();
                var num = Integer.parseInt(str);

                ExceptionPractice exceptionPractice = new ExceptionPractice();
                System.out.println(exceptionPractice.judgeScore(num));

            }catch (NumberFormatException e){
                inputFlg = true;
                System.out.println("数値を入力してください");
                e.printStackTrace();
            }catch (IlligalScoreException e){
                inputFlg = true;
                System.out.println("スコアが不正です");
                e.printStackTrace();
            }
        }while(inputFlg);

    }
}

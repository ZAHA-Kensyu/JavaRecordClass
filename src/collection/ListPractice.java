package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;
public class ListPractice {

    public static void main(String[] args){
        List<String> lists = new ArrayList<>();

        var sc = new Scanner(System.in);
        String name;

        boolean inputFlg = true;
        do {
            System.out.println("名前を入力してください。exitで終了");
            name = sc.nextLine();

            if(!(name.equals("exit"))) {
                lists.add(name);
            }else{
                inputFlg = false;
            }
        }while (inputFlg);
        
        System.out.println("最初に登録された"+lists.get(0));
        System.out.println("最後に登録された"+lists.get(lists.size()-1));

        //アルファベット順に並び替えてくれる関数
        Collections.sort(lists);

        for(var list: lists){
            System.out.println(list);
        }
    }
}

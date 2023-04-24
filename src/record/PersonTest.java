package record;
import record.Person;

public class PersonTest {
    public static void main(String[] args){
        Person.person[] persons = {
                new Person.person("月","ゲツ",50),
                new Person.person("火","カ",1),
                new Person.person("水","スイ",14),
                new Person.person("木","モク",2),
                new Person.person("金","キン",0)
        };

        //最年少と最年長を表示
        System.out.println("最年小 " +persons[Person.AgeMin(persons)].name()  + " 最年長 " + persons[Person.AgeMax(persons)]);

        //ソートされた配列を表示
        int[] ageSort = new int[persons.length];
        ageSort = Person.BabbleSort(persons);

        //出力
        System.out.print("年齢順");
        for(var i = 0; i < persons.length; i++) {
            System.out.print(ageSort[i]+" ");
        }
    }
}

package record;

public class Person {
    record person(String name , String furigana ,int age){};

    //Maxを返すメソッド
    public static int AgeMax(person[] persons){
        var max = persons[0].age;
        var index = 0;
        for(var i = 0; i < persons.length; i++){
            if(max < persons[i].age){
                max = persons[i].age;
                index = i;
            }
        }
        return index;
    }

    //Minを返すメソッド
    public static int AgeMin(person[] persons){
        var min = persons[0].age;
        var index = 0;
        for(var i = 0; i < persons.length; i++){
            if(min > persons[i].age){
                min = persons[i].age;
            }
        }
        return index;
    }

    public static int[] BabbleSort(person[] persons){
        var tmp = 0;
        int[] ageSort = ArrayToRecord(persons);//配列に変換された値を受け取る

        for(var low = (persons.length - 1); low > 0; low--){
            for(var upper = 0; upper  < low; upper++){
                if(ageSort[upper] > ageSort[upper + 1]){
                    tmp = ageSort[upper+1];
                    ageSort[upper+1] = ageSort[upper];
                    ageSort[upper] = tmp;
                }
            }
        }
        return ageSort;
    }

    //配列コピー
    private static int[]ArrayToRecord(person[] persons){
        int[] array = new int[persons.length];
        for(var i = 0; i < persons.length; i++){
            array[i] = persons[i].age;
        }
        return array;
    }
}

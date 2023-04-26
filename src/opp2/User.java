package opp2;

public class User {
    //フィールド作成
    private String name;//名前
    private String birthplace;//出身地
    private String dateOfBirth;

    public User(String name , String birthplace , String dateOfBirth){
        this.name = name;
        this.birthplace = birthplace;
        this.dateOfBirth = dateOfBirth;
    }

    //Object なんでも扱える型
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; //自分自身か?
        if(obj instanceof User) {//同じクラス型か?
            User user = (User) obj;//obj型をUser型に変換
            if (this.name.equals(user.name) && this.birthplace.equals(user.birthplace) && this.dateOfBirth.equals(user.dateOfBirth)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString(){
        return "名前 :"+name+", 出身地 :"+birthplace+", 生年月日 :"+dateOfBirth+"";
    }

    public static void main(String[] args){
        User user1= new User("zaha","okinawa","2000/06/01");
        User user2= new User("zaha","okinawa","2000/06/01");

        System.out.println("比較した結果 :"+user1.equals(user2));
        System.out.print(user1);
        System.out.println("");
        System.out.print(user2);
    }
}

package oop;

public class Account {
    private String name;
    private String tel;
    private String email;
    private String address;

    //コンストラクタ
    public Account(String name,String tel, String email,String address){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo(){
        return this.name+"/"+this.tel+"/"+this.email+"/"+this.address;
    }
}

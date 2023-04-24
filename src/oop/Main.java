package oop;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("zaha", "090-xxx-xxx", "zaharyuuichi@mail.com", "address");
        System.out.println(account.getAccountInfo());

        SmartPhone iphone1 = new SmartPhone("iphone1","Ios"); //スマホのインスタンス生成
        Account acount = new Account("zaha","090","mail","adress");//アカウントのインスタンス生成
        iphone1.setAccount(acount); //アカウント登録
        iphone1.displayMyAccount(); //アカウント表示

        //アドレス追加 10件だけ登録できるが11件分まわして見る。
        for(var i = 0; i < 11; i++) {
            AddressBook addres = new AddressBook("Tanaka","0"+i,"mail");
            if(iphone1.addAddressBook(addres)){
                System.out.println("登録できた");
            }else{
                System.out.println("登録できない");
            }
        }
    }
}

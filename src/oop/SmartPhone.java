package oop;

public class SmartPhone {
    private String model;//スマホの機種名
    private String os;//OSの種類
    private Account account;//自分の情報
    private AddressBook[] addressBooks;//10件だけ登録できる

    String[] apps;//インストールされたアプリ

    //コンストラクタ
    public SmartPhone(String model,String os){
        this.model = model;
        this.os = os;
        addressBooks = new AddressBook[10]; //10件だけアドレスを登録できるようにする
        String[] apps = new String[10];//10だけアプリを登録できるようにする
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void displayDeviceInfo(){
        System.out.println("モデル "+ model +" OS "+os);
    }

    public void displayMyAccount(){
        System.out.println("アカウント情報 "+ account.getAccountInfo());
    }

    public boolean addAddressBook(AddressBook addressBook) {
        //件数分だけforで回して
        for (int i = 0; i < addressBooks.length; i++) {
            if (addressBooks[i] == null) { //アドレスが入っていなければ登録
                addressBooks[i] = addressBook;//アドレス追加
                return true;
            }
        }
        return false;
    }

    public void displayAppList(){
        System.out.println(apps);
    }

//    public getAddressBook(){
//        for (int i = 0; i < addressBooks.length; i++) {
//                System.out.println(addressBooks[i].);
//        }
//    }
}

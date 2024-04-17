public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(12355);
        Account account2 = new Account(23958);
        System.out.println(account1.accountId);
        System.out.println(account2.accountId);
       /*this code will give a comp error, because we cannot assign a new value
         to the final variable.
         account1.accountId = 2234;*/

        //both account1 and account2's rate are changed, because rate declares as static var.
        account1.rate=30;
        System.out.println(account1.rate);
        System.out.println(account2.rate);
        Account.rate= 50;
        System.out.println(account1.rate);
        System.out.println(account2.rate);

        /*value will be assigned one memory location no matter how many instance of the class will be created
        and can not be changed.
        account1.odLimit = 3000;
        Account.odLimit=3249; */



    }
}
class Account{
    public Account(int id){
        accountId=id;
    }
    final int accountId;
    static double rate = 1.5;
    static final int odLimit=1000;

}

class Student {
    int age = 19;

}
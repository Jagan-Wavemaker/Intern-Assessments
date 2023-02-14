import java.util.Scanner;

//abstract class
abstract class LogIn{
    abstract void password();
}
class user extends LogIn{
    void password(){
        int UserPin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String user = sc.next();
        System.out.println("Enter password");
        int pin = sc.nextInt();
        System.out.println(user +" entered password is "+pin);
        if(UserPin == pin){
            System.out.println(user +" laptop is authenticated ");
        } else {
            System.out.println(user +" entered pin is incorrect");
        }

    }
}
class Abstract{
    public static void main(String args[]){
        LogIn obj = new user();
        obj.password();
    }
}
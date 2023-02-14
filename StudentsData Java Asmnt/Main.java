import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.Iterator;
import collection.User;

public class Main{
    public static void main(String[] args) {
        int UserInput;
        int UserName;
        int user_Id;
        String user_Name;
        ArrayList<User> UL = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Create User");
            System.out.println("2.Display User");
            System.out.println("3.Search User");
            System.out.println("4.Delete User");
            System.out.println("5.Sort upon UserId");
            // System.out.println("0.Exit");
            System.out.println("Enter any one option from the above");
            UserInput = sc.nextInt();
            switch(UserInput){
                case 1:
                    System.out.println("Enter UserName");
                    user_Name = sc.nextLine();
                    // System.out.println(user_Name);
                    sc.next();
                    System.out.println("Enter UserId");
                    user_Id = sc.nextInt();
                    // System.out.println(user_Id);
                    UL.add(new User(user_Name, user_Id));
                break;
                case 2:
                    System.out.println(UL);
                break;
                case 3:
                    boolean f = false;
                    System.out.println("Enter UserId");
                    Iterator<User> j = UL.iterator();
                    int UserId = sc.nextInt();
                    // Checking hasNext() values till end
                    while(j.hasNext()){
                        User UN = j.next(); // Go to next value using next() method
                        if(UN.getUserId() == UserId){
                            System.out.println(UN.getUserName());
                            f = true;
                            break;
                        }
                    }
                    // String UserName = map.get(UserId)
                    // System.out.println("UserName is" +((ArrayList<User>) UL).get(UserId));
                break;
                case 4:
                    boolean t = false;
                    String UN = " ";
                    System.out.println("Enter UserId to delete the respective User");
                    // int Userid = sc.nextInt();
                        Iterator<User>h = UL.iterator();
                        int Userid = sc.nextInt();
                        while(h.hasNext()){
                            User s = h.next();
                            if(s.getUserId() == Userid){
                                UN = s.getUserName();
                                UL.remove(s);
                                break;
                            }
                        }
                    System.out.println("Deleted User" + Userid);
                break;
                case 5:
                    //    System.out.println("sorted order of user list is" + Collections.sort(UL(user))); 
                default:
                    System.out.println("Enter a valid input");
                break;
            }
        }
    }
} 

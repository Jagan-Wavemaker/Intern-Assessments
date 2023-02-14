package collection;

public class User {
    String UserName;
    int UserId;
    public User(String user_Name, int user_Id){
        this.UserName = user_Name;
        this.UserId = user_Id;
    }
public String getUserName(){
    return UserName;
}
public int getUserId(){
    return UserId;
}
public void setUserName(String user_Name){
    this.UserName = user_Name;
}
public void setUserId(int user_Id){
    this.UserId = user_Id;
}

//overriding the toString() method 
// @Override
// public String toString()
// {
//     return " User Name = " + this.UserName + " , "
//         + " User Id = " + this.UserId ;
// }
@Override public String toString() {
    return "User Name=" + UserName +  "User ID=" + UserId;
}
}

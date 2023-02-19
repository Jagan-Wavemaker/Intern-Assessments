package org.example;
import java.sql.*;
import java.util.Scanner;
import static java.lang.System.exit;

public class App {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "jagan";
        Connection con = null; //need to initialize a java.sql.Connection from JDBC.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful" + url);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Here..I'm designing a library management application by connecting to my database");
        Scanner input = new Scanner(System.in);
        int val;
        do {
            System.out.println("1-->To insert book details");
            System.out.println("2-->To search for a book");
            System.out.println("3-->To delete a book");
            System.out.println("4-->To display all books");
            System.out.println("0-->To exit");
            System.out.println("Opt any one option from the above to proceed further:");
            val = input.nextInt();
            //Starting switch case
            switch (val){
                case 1:
                    System.out.println("Enter the book id");
                    int bookid = input.nextInt();
                    System.out.println("Enter the book name");
                    String bookname = input.next();
                    System.out.println("Enter the author's name");
                    String bookauthor = input.next();
                    input.next();
                    System.out.println("Enter the published year");
                    int pubyear = input.nextInt();
                    System.out.println("Enter the category of " +bookname +".");
                    String bookcategory = input.next();
                    String sql = "INSERT INTO librarydetails (bookid, bookname, bookauthor, pubyear, bookcategory) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement statement = con.prepareStatement(sql);
                    statement.setInt(1, bookid);
                    statement.setString(2, bookname);
                    statement.setString(3, bookauthor);
                    statement.setInt(4, pubyear);
                    statement.setString(5, bookcategory);
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("A new book details was inserted successfully!");
                    }
                break;
                case 2:
                    System.out.println("Enter book id of the book details you want to search");
                    int bookId = input.nextInt();
                    String query = "select * from librarydetails where bookid='"+bookId+"'";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                        if (rs.next()) {
                            System.out.println("Book Id: "+rs.getInt(1)+","+"Book Name: "+rs.getString(2)+","+"Book Author: "+rs.getString(3)+","+"Year of published:"+rs.getInt(4)+","+"Category: "+rs.getString(5));
                        }
                        else {
                            System.out.println("Record Not Found...");
                        }
                break;
                case 3:
                    System.out.println("Enter book id of the book details you want to delete");
                    int bookIds = input.nextInt();
                    String sqls = "DELETE FROM librarydetails WHERE bookid=?";
                    PreparedStatement statements = con.prepareStatement(sqls);
                    statements.setInt(1, bookIds);
                    int rowsDeleted = statements.executeUpdate();
                    if (rowsDeleted > 0) {
                        System.out.println("A book record was deleted successfully!");
                    }
                    else {
                        System.out.println("No record was deleted, as entered book id doesn't exist");
                    }
                break;
                case 4:
                    //query to display all records from table employee
                    String q="Select * from librarydetails";
                    PreparedStatement statementd = con.prepareStatement(q);
                    ResultSet rss=statementd.executeQuery(q);

                    //to print the book details on console
                    if(rss.next()){
                        do{
                            System.out.println("Book Id: "+rss.getInt(1)+","+"Book Name: "+rss.getString(2)+","+"Book Author: "+rss.getString(3)+","+"Year of published:"+rss.getInt(4)+","+"Category: "+rss.getString(5));
                        }while(rss.next());
                    }
                    else{
                        System.out.println("No tables/records in the DB...");
                    }
                break;
                default:
                    System.out.println("Entered Incorrect option ");
                    exit(1);
                break;
            }
        } while (val!= 0);
    }
}
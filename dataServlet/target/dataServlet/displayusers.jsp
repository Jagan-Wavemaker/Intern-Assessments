<%@page import="Users.User"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
  <head>
   <title>Users List</title>
  </head>
  <body>
      <h1>Displaying Registered Users List</h1>
      <table border ="1" width="500" align="center">
         <tr bgcolor="blue">
          <th><b>User Name</b></th>
          <th><b>User Email</b></th>
          <th><b>User Password</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet
              "DisplayServlet.java"
        --%>
        <%ArrayList<User> userList =
            (ArrayList<User>)request.getAttribute("userList");
        for(User u:userList){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=u.getName()%></td>
                <td><%=u.getEmail()%></td>
                <td><%=u.getPassword()%></td>
            </tr>
            <%}%>
        </table>
        <hr/>
    </body>
</html>
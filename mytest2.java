import java.sql.*;  
class mytest2 {  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/example","root","Chandra@12$");  
  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from cardetails");  
while(rs.next())  
System.out.println(rs.getInt("year")+"  "+rs.getString("selling_price")+"  "+rs.getString("name"));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  

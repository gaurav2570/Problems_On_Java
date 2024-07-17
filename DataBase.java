import java.sql.*;   //1

class DataBase
{
    public static void main(String arg[]) throws Exception
    {
        String URL ="jdbc:mysql://localhost:3306/demo";
        String Username ="root";
        String Password ="root";
        String Query ="select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);  //2

        Statement sobj = cobj.createStatement();  //3

        ResultSet robj = sobj.executeQuery(Query); //4

        while(robj.next()) //5
        {
            System.out.println("Name : "+robj.getString("name"));
            System.out.println("ID : "+robj.getInt("id"));
            System.out.println("Address : "+robj.getString("address"));
            System.out.println("Marks : "+robj.getInt("marks"));
            System.out.println("PhoneNO : "+robj.getInt("phoneNo"));
        }
    }
}
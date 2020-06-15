/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author sakhawat
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

public class dbConnection {
    String dbURL = "jdbc:oracle:thin:@localhost:1521:ORDB";
    String username = "sakhawat";
    String password = "noob";

    Connection conn = null;
    int member_id,book_id,mem_id;
    public dbConnection()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(dbURL, username, password);
            if(conn!=null) System.out.println("Connection successfully established.");
            else System.out.println("Could not establish connection");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public int createAccount(String firstName, String lastName, String email,
            String location, String gender, String username, String password)
    {
        
        boolean exist = existUser(username, password);
        if(exist)
        {
            System.out.println("already a member");
            return 0;
        }
        else{
            try
            {
                String Statement = "select MAX(Member_ID) from member";
                PreparedStatement stmt1 = conn.prepareStatement(Statement);
                ResultSet rset = stmt1.executeQuery();
                while(rset.next()){
                member_id = rset.getInt(1);  }
                System.out.println(member_id);
                String insertCommand = "insert into member(Member_ID,First_Name,Last_Name,Email,Location,Gender,Username,Password)"
                        + " values(?,?,?,?,?,?,?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(insertCommand);
                //stmt.setString(1, Integer.toString(member_id));
                stmt2.setInt(1, member_id+1);
                stmt2.setString(2, firstName);
                stmt2.setString(3, lastName);
                stmt2.setString(4, email);
                stmt2.setString(5, location);
                stmt2.setString(6, gender);
                stmt2.setString(7, username);
                stmt2.setString(8, password);
               
                int count = stmt2.executeUpdate();
                return count;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return 0;
            }
        }
    }
    
    public boolean existUser(String username,String password)
    {
        try
        {
            String query = "select * from member where username = ? and password= ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
                return true;
            }
            return false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }  
    }

    public int addBooks(String user,String bookName, String author, String publisher, String version, String isbn,String type, String sellprice,String copies)
    {
        try
        {
            String St = "select MAX(BOOK_ID) from books";
            PreparedStatement stmt4 = conn.prepareStatement(St);
            ResultSet rset = stmt4.executeQuery();
            while(rset.next()){
            book_id = rset.getInt(1);}
            
            
            String St2 = "select member_id from member where username=?";
            PreparedStatement stmt5 = conn.prepareStatement(St2);
            stmt5.setString(1,user);
            ResultSet rsett = stmt5.executeQuery();
            while(rsett.next()){
            mem_id = rsett.getInt(1);}
     
            String insertCommand2="insert into books values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt3 = conn.prepareStatement(insertCommand2);
            stmt3.setInt(1, book_id+1);
            stmt3.setString(2, bookName);
            stmt3.setString(3, author);
            stmt3.setString(4, publisher);
            stmt3.setString(5, version);
            stmt3.setString(6, isbn);
            stmt3.setInt(7, Integer.parseInt(sellprice));
            stmt3.setInt(8, Integer.parseInt(sellprice)+100);
            stmt3.setInt(9, Integer.parseInt(copies));
            stmt3.setString(10, type);
            
            int ct = stmt3.executeUpdate();
            
            String inscmd="insert into selldata values(?,?,?,sysdate)";
            PreparedStatement stt=conn.prepareStatement(inscmd);
            stt.setInt(1,mem_id);
            stt.setInt(2,book_id+1);
            stt.setInt(3,Integer.parseInt(sellprice));
            stt.executeQuery();
            
            return ct;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int updateSoldBook(String user,String bookID, String copy){
        try
        {
            String St2 = "select member_id from member where username=?";
            PreparedStatement stmt5 = conn.prepareStatement(St2);
            stmt5.setString(1,user);
            ResultSet rsett = stmt5.executeQuery();
            while(rsett.next()){
            mem_id = rsett.getInt(1);}
    
            int price=0;
            String St3 = "select buying_price from books where book_id=?";
            PreparedStatement stmt = conn.prepareStatement(St3);
            stmt.setString(1,bookID);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
            price = rs.getInt(1);}
            
            String st1="select quantity from books where book_id=?";
            PreparedStatement stm1=conn.prepareStatement(st1);
            stm1.setInt(1,Integer.parseInt(bookID));
            int q=0;
            ResultSet rset1 = stm1.executeQuery();
            while(rset1.next()){
            q= Integer.parseInt(rset1.getString(1));
            }
            q=q+Integer.parseInt(copy);
            String st2="update books set quantity=? where book_id=?"  ;
            PreparedStatement stm2 = conn.prepareStatement(st2); 
            stm2.setInt(1,q);
            stm2.setInt(2, Integer.parseInt(bookID));
            int c = stm2.executeUpdate();
            
            String inscmd="insert into selldata values(?,?,?,sysdate)";
            PreparedStatement stt=conn.prepareStatement(inscmd);
            stt.setInt(1,mem_id);
            stt.setInt(2,Integer.parseInt(bookID));
            stt.setInt(3,price);
            stt.executeQuery();
            
            return c;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
      
    }
    
    public int buyUpdate(String user,String bookID, String copy, String price)
    {
        try
        {     
            String St2 = "select member_id from member where username=?";
            PreparedStatement stmt5 = conn.prepareStatement(St2);
            stmt5.setString(1,user);
            ResultSet rsett = stmt5.executeQuery();
            while(rsett.next()){
            mem_id = rsett.getInt(1);}
            System.out.println(mem_id);
            
            String st1="select quantity from books where book_id=?";
            PreparedStatement stm1=conn.prepareStatement(st1);
            stm1.setInt(1,Integer.parseInt(bookID));
            int q=0;
            ResultSet rset1 = stm1.executeQuery();
            while(rset1.next()){
            q= Integer.parseInt(rset1.getString(1));
            }
            q=q-Integer.parseInt(copy);
            String st2="update books set quantity=? where book_id=?"  ;
            PreparedStatement stm2 = conn.prepareStatement(st2); 
            stm2.setInt(1,q);
            stm2.setInt(2, Integer.parseInt(bookID));
            int c = stm2.executeUpdate();
            
            String inscmd="insert into buydata values(?,?,?,sysdate)";
            PreparedStatement stt=conn.prepareStatement(inscmd);
            stt.setInt(1,mem_id);
            stt.setInt(2,Integer.parseInt(bookID));
            stt.setInt(3,Integer.parseInt(price));
            stt.executeQuery();
            
            
            return c;
        }catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int bkashUpdate(String user, String bkname, String mobileno){
        try
        {
            String St2 = "select member_id from member where username=?";
            PreparedStatement stmt5 = conn.prepareStatement(St2);
            stmt5.setString(1,user);
            ResultSet rsett = stmt5.executeQuery();
            while(rsett.next()){
            mem_id = rsett.getInt(1);}
            
            
            String inscmd="insert into bkash values(?,?,?)";
            PreparedStatement stt=conn.prepareStatement(inscmd);
            stt.setInt(1,mem_id);
            stt.setString(2,bkname);
            stt.setString(3,mobileno);
            int c=stt.executeUpdate();
            return c;
            
        }catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int ccdcupdate(String user, String cardtype,String cardname,String cardno,String cvvno)
    {
        try
        {   String St2 = "select member_id from member where username=?";
            PreparedStatement stmt5 = conn.prepareStatement(St2);
            stmt5.setString(1,user);
            ResultSet rsett = stmt5.executeQuery();
            while(rsett.next()){
            mem_id = rsett.getInt(1);}
            
            String inscmd="insert into ccdc values(?,?,?,?,?)";
            PreparedStatement stt=conn.prepareStatement(inscmd);
            stt.setInt(1,mem_id);
            stt.setString(2,cardtype);
            stt.setString(3,cardname);
            stt.setString(4,cardno);
            stt.setString(5,cvvno);
            int c=stt.executeUpdate();
            return c;
        }catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
    }
}

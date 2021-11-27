
package modelUser;

import static Connect.ConnectDB.getConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;


public class ConnectUser {
   
    
    public static ArrayList<User> getAll(){
        ArrayList<User> list=new ArrayList();
        String query="select *from demo.account";
        try{
            Connection con=getConnect();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                User user=new User(rs.getString("taikhoan"),rs.getString("matkhau"),rs.getInt("checkAdmin"),rs.getInt("checkOnline"),rs.getString("tennguoidung"));
                list.add(user);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public static void insert(User user){
        String query="insert into demo.account(taikhoan,matkhau,checkAdmin,checkOnline,tennguoidung) values(?,?,?,?,?)";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, user.getTaikhoan());
            pstmt.setString(2,user.getMatkhau());
            pstmt.setInt(3, user.getCheckAdm());
            pstmt.setInt(4, user.getCheckOnline());
            pstmt.setString(5, user.getTen());
            pstmt.execute();
        }catch(Exception e){
            
        }
    }
    public static void dele(String taikhoan){
        String query="delete from demo.account where taikhoan='"+taikhoan+"'";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.executeUpdate();
        }catch(Exception e){
            
        }
    }
    public static void Update(User user){
        String query="Update demo.account set taikhoan=?,matkhau=?,"
                + "checkAdmin=?,checkOnline=?,tennguoidung=? where taikhoan='"+user.getTaikhoan()+"'";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, user.getTaikhoan());
            ps.setString(2, user.getMatkhau());
            ps.setInt(3, user.getCheckAdm());
            ps.setInt(4, user.getCheckOnline());
            ps.setString(5, user.getTen());
            ps.executeUpdate();
        }catch(Exception e){
            
        }          
    }
    
    public static void main(String[] args) {
        Update(new User("quanghai","123456",0,0,"Nguyễn Quang Hải"));
        ArrayList<User> A=getAll();
        
        for(User nv:A){
            System.out.println(nv);
        }
    }
}

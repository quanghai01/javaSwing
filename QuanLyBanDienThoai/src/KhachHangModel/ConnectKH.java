
package KhachHangModel;




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

public class ConnectKH {
    
    public static ArrayList<KhachHang> getAll(){
        ArrayList<KhachHang> list=new ArrayList();
        String query="select *from demo.khachhang";
        try{
            Connection con=getConnect();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                KhachHang kh=new KhachHang(rs.getString("ten"),rs.getString("diachi"),rs.getString("sdt"),
                        rs.getString("tendt"),rs.getString("hang"),rs.getString("baohanh"),
                        rs.getLong("thanhtien"),rs.getString("thoigian"),rs.getLong("soluong"));
                list.add(kh);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public static void insert(KhachHang kh){
        String query="insert into demo.khachhang(ten,diachi,sdt,tendt,hang,baohanh,thanhtien,thoigian,soluong) values(?,?,?,?,?,?,?,?,?)";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, kh.getTen());
            pstmt.setString(2,kh.getDiachi());
            pstmt.setString(3, kh.getSdt());
            pstmt.setString(4, kh.getTendt());
            pstmt.setString(5, kh.getHang());
            pstmt.setString(6, kh.getBaohanh());
            pstmt.setLong(7, kh.getThanhtien());
            pstmt.setString(8, kh.getThoigian());
            pstmt.setLong(9, kh.getSoluong());
            pstmt.execute();
        }catch(Exception e){
            
        }
    }
    
    public static void dele(String sdt,String name){
        String query="delete from demo.khachhang where sdt='"+sdt+"' and ten='"+name+"'";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public static void Update(KhachHang kh){
        String query="Update demo.khachhang set ten=?,diachi=?,"
                + "sdt=?,tendt=?,hang=?,baohanh=?,thanhtien=?,thoigian=?,soluong=? where ten='"+kh.getTen()+"' and sdt='"+kh.getSdt()+"'";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, kh.getTen());
            ps.setString(2, kh.getDiachi());
            ps.setString(3, kh.getSdt());
            ps.setString(4, kh.getTendt());
            ps.setString(5, kh.getHang());
            ps.setString(6, kh.getBaohanh());
            ps.setLong(7, kh.getThanhtien());
            ps.setString(8, kh.getThoigian());
            ps.setLong(9, kh.getSoluong());
            ps.executeUpdate();
        }catch(Exception e){
            
        }          
    }
    public static void main(String[] args) {
        
        ArrayList<KhachHang> A=getAll();
        
        for(KhachHang nv:A){
            System.out.println(nv);
        }
    }
}

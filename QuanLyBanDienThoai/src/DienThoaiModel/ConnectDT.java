/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoaiModel;




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
public class ConnectDT {
    
    
    public static ArrayList<DienThoai> getAll(){
        ArrayList<DienThoai> list = new ArrayList();
        String query="select * from demo.dienthoai";
        try{
            Connection con=getConnect();
            Statement sttm=con.createStatement();
            ResultSet rs=sttm.executeQuery(query);
            while(rs.next()){
                DienThoai dt = new DienThoai(rs.getString("ma"),rs.getString("ten"),rs.getString("hang"),
                rs.getString("hinhanh"),rs.getLong("gia"),rs.getLong("soluong"));
                list.add(dt);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public static void insert(DienThoai dt){
        String query = "insert into demo.dienthoai(ma,ten,hang,hinhanh,gia,soluong) values(?,?,?,?,?,?)";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, dt.getMa());
            ps.setString(2, dt.getTen());
            ps.setString(3, dt.getHang());
            ps.setString(4, dt.getHinhanh());
            ps.setLong(5, dt.getGia());
            ps.setLong(6, dt.getSoluong());
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
    public static void dele(String ma){
        String query="delete from demo.dienthoai where ma='"+ma+"'";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.executeUpdate();
        }catch(Exception e){
            
        }
    }
    public static void Update(DienThoai dt){
        String query="Update demo.dienthoai set ma=?,ten=?,"
                + "hang=?,hinhanh=?,gia=?,soluong=? where ma='"+dt.getMa()+"'";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, dt.getMa());
            ps.setString(2, dt.getTen());
            ps.setString(3, dt.getHang());
            ps.setString(4, dt.getHinhanh());
            ps.setLong(5, dt.getGia());
            ps.setLong(6, dt.getSoluong());
            ps.executeUpdate();
        }catch(Exception e){
            
        }          
    }
    public static ArrayList<DienThoai> findByMa(DienThoai dt1){
        ArrayList<DienThoai> list = new ArrayList();
        String query="select form demo.dienthoai where ma='"+dt1.getMa()+"'";
        try{
            Connection con=getConnect();
            Statement sttm=con.createStatement();
            ResultSet rs=sttm.executeQuery(query);
            while(rs.next()){
                DienThoai dt = new DienThoai(rs.getString("ma"),rs.getString("ten"),rs.getString("hang"),
                rs.getString("hinhanh"),rs.getLong("gia"),rs.getLong("soluong"));
                list.add(dt);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public static void main(String[] args) {
        insert(new DienThoai("r1","realme6","realme","no",(long)12000,(long)3));
        dele("a1");
        ArrayList<DienThoai> A=getAll();
        
        for(DienThoai dt:A){
            System.out.println(dt);
        }
    }
}

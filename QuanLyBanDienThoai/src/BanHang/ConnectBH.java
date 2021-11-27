/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BanHang;

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
public class ConnectBH {
    
    
    public static ArrayList<BanHang> getAll(){
        ArrayList<BanHang> list = new ArrayList();
        String query="select * from demo.banhang";
        try{
            Connection con=getConnect();
            Statement sttm=con.createStatement();
            ResultSet rs=sttm.executeQuery(query);
            while(rs.next()){
                BanHang bh = new BanHang(rs.getString("ten"),rs.getLong("soluong"),
                rs.getLong("thu"));
                list.add(bh);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public static void insert(BanHang bh){
        String query = "insert into demo.banhang(ten,soluong,thu) values(?,?,?)";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, bh.getTen());
            ps.setLong(3, bh.getThu());
            ps.setLong(2, bh.getSoluong());
            
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
    public static void dele(String ten){
        String query="delete from demo.banhang where ten='"+ten+"'";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.executeUpdate();
        }catch(Exception e){
            
        }
    }
    public static void Update(BanHang bh){
        String query="Update demo.banhang set ten=?,"
                + "soluong=?,thu=? where ten='"+bh.getTen()+"'";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, bh.getTen());
            ps.setLong(3, bh.getThu());
            ps.setLong(2, bh.getSoluong());
            
            ps.executeUpdate();
        }catch(Exception e){
            
        }          
    }
    public static void main(String[] args) {
        ArrayList<BanHang> A=getAll();
        for(BanHang x:A){
            System.out.println(x);
        }
    }
}

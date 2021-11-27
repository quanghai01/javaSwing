/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVienModel;

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

/**
 *
 * @author ADMIN
 */
public class ConnectNV {

    public static ArrayList<NhanVien> getAll(){
        ArrayList<NhanVien> list=new ArrayList();
        String query="select *from demo.nhanvien";
        try{
            Connection con=getConnect();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                NhanVien nv=new NhanVien(rs.getString("ma"),rs.getString("ten"),rs.getLong("luong"),
                        rs.getString("ngaysinh"),rs.getString("gioitinh"),rs.getString("diachi"),
                        rs.getString("hinhanh"),rs.getString("sdt"));
                list.add(nv);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public static void insert(NhanVien nv){
        String query="insert into demo.nhanvien(ma,ten,luong,ngaysinh,gioitinh,diachi,hinhanh,sdt) values(?,?,?,?,?,?,?,?)";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, nv.getMa());
            pstmt.setString(2,nv.getName());
            pstmt.setLong(3, nv.getLuong());
            pstmt.setString(4, nv.getNgaysinh());
            pstmt.setString(5, nv.getGioitinh());
            pstmt.setString(6, nv.getDiachi());
            pstmt.setString(7, nv.getHinhanh());
            pstmt.setString(8, nv.getSdt());
            pstmt.execute();
        }catch(Exception e){
            
        }
    }
    
    public static void dele(String ma,String name){
        String query="delete from demo.nhanvien where ma='"+ma+"' and ten='"+name+"'";
        try{
            Connection con=getConnect();
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.executeUpdate();
        }catch(Exception e){
            
        }
    }
    public static void Update(NhanVien nv){
        String query="Update demo.nhanvien set ma=?,ten=?,"
                + "luong=?,ngaysinh=?,gioitinh=?,diachi=?,hinhanh=?,sdt=? where ma='"+nv.getMa()+"'";
        try{
            Connection con=getConnect();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getName());
            ps.setLong(3, nv.getLuong());
            ps.setString(4, nv.getNgaysinh());
            ps.setString(5, nv.getGioitinh());
            ps.setString(6, nv.getDiachi());
            ps.setString(7, nv.getHinhanh());
            ps.setString(8, nv.getSdt());
            ps.executeUpdate();
        }catch(Exception e){
            
        }          
    }
    public static void main(String[] args) {
        Update(new NhanVien("nv03","Nguyễn Quang Hải",25000,"04/04/2001","Nam","Hà Nội","no avatar","036894"));
        ArrayList<NhanVien> A=getAll();
        
        for(NhanVien nv:A){
            System.out.println(nv);
        }
    }
}

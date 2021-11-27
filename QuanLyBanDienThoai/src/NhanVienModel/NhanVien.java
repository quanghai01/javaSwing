/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVienModel;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String ma;
    private String name;
    private long luong;
    private String ngaysinh;
    private String gioitinh;
    private String diachi;
    private String hinhanh;
    public String sdt;
    public NhanVien() {
    }

    public NhanVien(String ma,String name, long luong, String ngaysinh, String gioitinh, String diachi,String hinhanh,String sdt) {
        this.ma=ma;
        this.name = name;
        this.luong = luong;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinhanh=hinhanh;
        this.sdt=sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String toString(){
        return ma+" "+name+" "+luong+" "+ngaysinh+" "+gioitinh+" "+diachi+" "+hinhanh+" "+sdt;
    }
}

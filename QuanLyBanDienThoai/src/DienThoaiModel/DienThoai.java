/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoaiModel;

/**
 *
 * @author ADMIN
 */
public class DienThoai {
    
    private String ma;
    private String ten;
    private String hang;
    private String hinhanh;
    private long gia;
    private long soluong;

    public DienThoai() {
    }

    public DienThoai(String ma, String ten, String hang, String hinhanh, long gia, long soluong) {
        this.ma=ma;
        this.ten = ten;
        this.hang = hang;
        this.hinhanh = hinhanh;
        this.gia = gia;
        this.soluong = soluong;
    }



    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public long getSoluong() {
        return soluong;
    }

    public void setSoluong(long soluong) {
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public long Tong(){
        return soluong*gia;
    }
    
    public String toString(){
        return ma+" "+ten+" "+hang+" "+hinhanh+" "+gia+" "+soluong;
    }
}

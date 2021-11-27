/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUser;

public class User {
   
    private String taikhoan;
    private String matkhau;
    private int checkAdm;
    private int checkOnline;
    private String ten;
    public User(String taikhoan, String matkhau,int check,int checkOnline,String ten) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.checkAdm=check;
        this.checkOnline=checkOnline;
        this.ten=ten;
    }

   

    public User() {
        
    }

    public int getCheckAdm() {
        return checkAdm;
    }

    public void setCheckAdm(int checkAdmin) {
        this.checkAdm = checkAdmin;
    }
    
    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    } 

    public int getCheckOnline() {
        return checkOnline;
    }

    public void setCheckOnline(int checkOnline) {
        this.checkOnline = checkOnline;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String toString(){
        return ten+" "+taikhoan+" "+matkhau+" "+checkAdm+" "+ checkOnline;
    }
}

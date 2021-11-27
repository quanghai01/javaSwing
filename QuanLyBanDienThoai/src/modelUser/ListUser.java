/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUser;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ListUser {
        ArrayList<User> A=ConnectUser.getAll();
    public ArrayList<User> getAllUser(){
        return A;
    }
    public int add(User user){
        A.add(user);
        ConnectUser.insert(user);
        return 1;
    }
    
    public boolean checkLogin(String taikhoan,String matkhau){
        for(User x:A){
            if(x.getTaikhoan().equals(taikhoan) && x.getMatkhau().equals(matkhau))
                return true;
        }
        return false;
    }
    public boolean checkSignUp(String taikhoan){
        for(User x:A){
            if(x.getTaikhoan().equals(taikhoan))
                return false;
        }
        return true;
    }
    
    public void reset(){
        for(User u:A){
            u.setCheckOnline(0);
            ConnectUser.Update(u);
        }
    }
    public User getUserByTk(String tk){
        for(User u:A){
            if(u.getTaikhoan().equals(tk))
                return u;
        }
        return null;
    }
    public void Update(String taikhoan,String matkhau,String ten){
        for(User u:A){
            if(u.getTaikhoan().equals(taikhoan)){
                u.setMatkhau(matkhau);
                u.setTen(ten);
                ConnectUser.Update(u);
            }
        }
    }
    public void delByTaiKhoan(String tk){
        for(User user:A){
            if(user.getTaikhoan().equals(tk)){
                A.remove(user);
                ConnectUser.dele(tk);
            }
        }
    }
}

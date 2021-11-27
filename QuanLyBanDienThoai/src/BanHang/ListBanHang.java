
package BanHang;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ListBanHang {
    ArrayList<BanHang> A=ConnectBH.getAll();
    
    public ArrayList<BanHang> getAllBanHang(){
        return A;
    }
    
    public int add(BanHang x){
        A.add(x);
        ConnectBH.insert(x);
        return 1;
    }
    public void delByTen(String ten){
        for(BanHang x:A){
            if(x.getTen().equals(ten)){
                A.remove(x);
                ConnectBH.dele(ten);
            }
        }
    }
    public void del(BanHang x){
        A.remove(x);
        ConnectBH.dele(x.getTen());
    }
    public void Update(BanHang bh){
        for(BanHang x:A){
            if(x.getTen().equals(bh.getTen())){
                x.setSoluong(x.getSoluong()+bh.getSoluong());
                x.setThu(x.getThu()+bh.getThu());
                ConnectBH.Update(x);
            }
        }
    }
   
}

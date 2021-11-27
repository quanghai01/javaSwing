
package KhachHangModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class ListKhachHang {
    ArrayList<KhachHang> A= ConnectKH.getAll();
    
    public ArrayList<KhachHang> getAllKhachHang(){
        return A;
    }
    public int add(KhachHang kh){
        A.add(kh);
        ConnectKH.insert(kh);
        return 1;
    }
    
    public int delBySdtvaTen(String sdt,String name){
        for(KhachHang kh:A){
            if(kh.getSdt().equals(sdt) && kh.getTen().equals(name)){
                A.remove(kh);
                ConnectKH.dele(sdt, name);
                return 1;
            }
        }
        return -1;
    }
    
    public KhachHang getByName(String name){
        for(KhachHang kh:A){
            if(kh.getTen().equals(name))
                return kh;
        }
        return null;
    }
    public ArrayList<KhachHang> sortTen(){
        Collections.sort(A);
        return A;
    }
    public ArrayList<KhachHang> sortTendt(){
        Collections.sort(A,new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getTendt().compareTo(o2.getTendt());
            }
        
        
        });
        return A;
    
    }
     public ArrayList<KhachHang> sortTien(){
        Collections.sort(A,new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if(o1.getThanhtien()<o2.getThanhtien())  return -1;
                if(o1.getThanhtien()>o2.getThanhtien())  return 1;
                return 0;
            }
        
        
        });
        return A;
    
    }
}
